package com.pose.singleton;

import java.util.Vector;

public class GlobalConfig {

	private static GlobalConfig instance;
	
	private Vector properties  = null;
	
	private boolean isUpdating  = false;
	
	private int readCount = 0;
	
	private GlobalConfig(){};
	
	public static GlobalConfig getInstace(){
		if(instance == null){
			syncInit();
		}
		return instance;
	}

	private static synchronized void syncInit() {
		// TODO Auto-generated method stub
		if(instance ==null){
			instance = new GlobalConfig();
		}
	}
	
	
	public synchronized void update(String p_data){
		syncUpdateIn();
	}

	private synchronized void syncUpdateIn() {
		
		while(readCount>0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(""); 
			}
		}
		
	}
	
	
	private synchronized void syncReadIn(){
		readCount++;
	}
	
	private synchronized void syncReadOut(){
		readCount--;
		
		notifyAll();
	}
	
	public Vector getproperties(){
		syncReadIn();
		
		syncReadOut();
		
		return properties;
	}
}
