package com.zxy.utils;

import java.util.HashMap;
import java.util.Map;
/**
 * 错误信息工具类，用来临时存放错误信息，反馈给前端页面
 * @author OverrideRe
 *
 */

public class ErrorMessageUtil {
	private static Map<String, StringBuffer> errorMessage = new HashMap<>();
	
	public void put(String key,String value){
		if(errorMessage.containsKey(key)){//该错误的信息若存在就存入
			errorMessage.get(key).append("," + value);
		}else{
			StringBuffer sb = new StringBuffer(value);//不存在就新建
			errorMessage.put(key, sb);
		}
	}
	
	public boolean isEmpty(){
		return errorMessage.isEmpty();
	}
	
	public Map<String, StringBuffer> getErrors(){
		return errorMessage;
	}
}
