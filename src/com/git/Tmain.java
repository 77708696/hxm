package com.git;

import java.io.File;
/**
 * 
 * @author 黄小明2014年2月9日
 *
 */
public class Tmain {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("测试GIT");
		
		String s="";
		//Thread.currentThread().
		
		System.out.println(System.getProperty("user.dir"));
		config cf = new config(System.getProperty("user.dir") + File.separator + "a.txt");
		System.out.println(cf.GetValue("IcisReport.server.ip"));
		
		cf.listall();
		
	}

}
