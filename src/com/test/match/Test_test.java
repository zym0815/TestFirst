package com.test.match;

import java.io.IOException;

public class Test_test {
	public static void main(String[] args){
		Test_match tm =new Test_match();
		try {
			tm.readtxt("E:\\java_test_data\\0921.txt");  //¶ÁÈ¡½á¹û
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
