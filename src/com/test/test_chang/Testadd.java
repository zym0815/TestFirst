package com.test.test_chang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//����ȡ�����ݼ��ϡ���������ַ������洢��Buffer
public class Testadd {
	//spathΪ·��
	public ArrayList<String> test(String spath) throws IOException{
		String str=null;
		File file =new File(spath);
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
		ArrayList<String> al =new ArrayList<String>();
		while((str=br.readLine())!=null){
			al.add(str);
		}
		br.close();
		return al;
		
	}
}
