package com.git;
import java.util.*;
import java.io.*;
/**
 * 
 * @author Administrator
 *
 */
public class config {
	private String dbuser="root";
	private String dbpwd="123456";
	private String IP="192.168.1.1";
	private Properties props = new Properties();
	public config(){	
	}
	/**
	 * 加载配置文件
	 * 
	 * */
	public config(String filePath){
		 try {
	         InputStream in = new BufferedInputStream (new FileInputStream(filePath));
	         props.load(in);
		 }catch(IOException e){
			 
		 }
	}
	public String GetValue(String key){
		String value = props.getProperty (key);
	 //   System.out.println(key+value);
	    return value;
	}

	/**
	 * 列出所有配置文件
	 */
	public void listall(){
		
		Enumeration en =	props.propertyNames();
		while(en.hasMoreElements()){
			String key = (String) en.nextElement();
			 String Property = props.getProperty (key);
             System.out.println("key:" + key+Property);
            
		}
		
	}
}
