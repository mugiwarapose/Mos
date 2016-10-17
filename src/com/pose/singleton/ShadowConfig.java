package com.pose.singleton;

import java.util.Vector;
/**
 * 
 * @author zhangdd
 *	影子实例
 *	在更新属性时，直接生产另一个单例对象实例，这个新的单例对象会从数据库或配置文件读取最新的配置信息
 *	然后将这些配置信息赋给旧的单例对象的属性
 */
public class ShadowConfig {

	private static ShadowConfig instance;
	
	private Vector properties;
	
	public static ShadowConfig getInstance(){
		
		if(instance==null){
			syncInit();
		}
		
		return instance;
	}

	private static void syncInit() {
		// TODO Auto-generated method stub
		if(instance==null){
			instance = new ShadowConfig();
		}
	}
	
	public Vector getProperties(){
		return properties;
	}
	
	public void updateProperties(){
		ShadowConfig shadow = new ShadowConfig();
		properties = shadow.getProperties();
	}
	
}
