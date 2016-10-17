package com.pose.singleton;

import java.util.Vector;
/**
 * 
 * @author zhangdd
 *	Ӱ��ʵ��
 *	�ڸ�������ʱ��ֱ��������һ����������ʵ��������µĵ������������ݿ�������ļ���ȡ���µ�������Ϣ
 *	Ȼ����Щ������Ϣ�����ɵĵ������������
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
