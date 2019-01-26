package com.jxtb.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件
 **/
public class ReadProperties {
	
	public static String getString(String str){
		InputStream in = ReadProperties.class.getResourceAsStream("/common.properties");  
    	Properties p = new Properties();   
    	try {
			p.load(in);
			str = p.getProperty(str);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return str;
	}
	
}
