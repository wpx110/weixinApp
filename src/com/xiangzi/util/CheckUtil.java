package com.xiangzi.util;

import java.util.Arrays;

public class CheckUtil {
	
	private static final String token ="xiangzi";
	
	
public static boolean checkSignature(String signature,String timestamp,String nonce){
	
	String []  arr = new String[]{token,timestamp,nonce};
	//排序
	Arrays.sort(arr);
	
	
	//生成字符串
	StringBuffer content = new StringBuffer();
	for(int i=0;i<arr.length;i++){
		content.append(arr[i]);
	}
	
	//sha1 加密
	String temp = Sha1Util.hex_sha1(content.toString());
	
	
	
	return temp.equals(signature);
	
}	

}
