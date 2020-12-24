package com.intergration.paymentcenter.unionpaypayment.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * 
 * 客户端IP
 * 
 * @author zkchend
 * 
 */
public abstract class WebUtil {
	protected static final Logger logger = LoggerFactory.getLogger(WebUtil.class);

	/**
	  * 获取客户端IP
	  * 
	  * @param request
	  * @return
	  */
	public static String getRemoteIP(HttpServletRequest request) {
		  String ip = request.getHeader("x-forwarded-for");
		  if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
		   ip = request.getHeader("Proxy-Client-IP");
		  }
		  if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
		   ip = request.getHeader("WL-Proxy-Client-IP");
		  }
		  if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
		   ip = request.getRemoteAddr();
		  }
		  if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
		   ip = "127.0.0.1";
		  }
		  
		  if(ip.indexOf(",")>-1){
		   ip = ip.substring(0, ip.indexOf(","));
		  }
		  
		  return ip;
	 }
	
	
	public static String getLocalIP() {
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			logger.error("", e);
		}
		
		String ipAddrStr = "";
		if (addr != null) {
			byte[] ipAddr = addr.getAddress();
			
			for (int i = 0; i < ipAddr.length; i++) {
				if (i > 0) {
					ipAddrStr += ".";
				}
				ipAddrStr += ipAddr[i] & 0xFF;
			}
		} else {
			ipAddrStr = "localhost";
		}
		
		return ipAddrStr;
	}
	
	
}
