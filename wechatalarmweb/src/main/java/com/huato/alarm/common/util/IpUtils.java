package com.huato.alarm.common.util;

import com.alibaba.fastjson.JSON;

import com.huato.common.bean.IPZoneBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * IP地址获取的工具
 * @author dengyu
 * @date 2017-07-28
 */
public class IpUtils {

	private static final String UNKNOWN = "UNKNOWN";
	/**
	 * 饿汉式单例 谷歌的工程师写的
	 */
	private IpUtils() {
	}

	private static final IpUtils INSTANCE = new IpUtils();

	public static IpUtils getInstance() {
		return INSTANCE;
	}

	public static String getRequestIp() {

		String ipAddress = null;
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : ip;
	}
	/**
	 * 获取百度接口的IP区域地址解析字符串
	 * @param urlString
	 * @return
	 */
	public static String get(String urlString) {
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5 * 1000);
			conn.setReadTimeout(5 * 1000);
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setUseCaches(false);
			conn.setInstanceFollowRedirects(false);
			conn.setRequestMethod("GET");
			int responseCode = conn.getResponseCode();
			if (responseCode == HttpStatus.OK.value()) {
				StringBuilder builder = new StringBuilder();
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
				for (String s = br.readLine(); s != null; s = br.readLine()) {
					builder.append(s);
				}
				br.close();
				return builder.toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	/**
	 * 封装了获取IP地址信息
	 * @param ip
	 * @return
	 */
	public static IPZoneBean getIPZoneInfo( String ip, String url, String ak){
    	url = url.replace("IP", ip).replace("AK", ak);
        String ipaddress = IpUtils.get(url);
        IPZoneBean ipZoneBean = JSON.parseObject(ipaddress,IPZoneBean.class);
        if(ipZoneBean.getStatus()==0){
        	return ipZoneBean;
        }
        return null;
	}
	
	
}
