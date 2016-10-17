package com.pose.singleton;

import java.util.HashMap;
import java.util.Map;

public class RegitsSingleton {
	private static Map<String, RegitsSingleton> map = new HashMap<String, RegitsSingleton>();
	static{
		RegitsSingleton instance = new RegitsSingleton();
		map.put(RegitsSingleton.class.getName(), instance);
	}
	
	protected RegitsSingleton(){};
	
	public static RegitsSingleton getInstance(String name){
		if(name==null){
			name= RegitsSingleton.class.getName();
		}
		try {
			map.put(name, (RegitsSingleton)Class.forName(name).newInstance());
		} catch (Exception e) {
			throw new RuntimeException("ø’÷∏’Î“Ï≥£");
		}
		if(map.get(name)==null){
			
		}
		return map.get(name);
	}
	
	public String about(){
		return "Hello, I am RegSingleton.";
	}
	
	public static void main(String[] args) {
		RegitsSingleton instance  = RegitsSingleton.getInstance(null);
		System.out.println(instance.about());
	}
}
