package com.test.match;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Make_num {
	
	//count为电话号后8位
	public List<String> createnum(int count){
		List<String> numlist =new ArrayList<String>();
		int numcount130=130;
		int numcount150=150;
		int numcount180=180;
		for(int i=0;i<10;i++){
			String str130 =String.valueOf(numcount130+i);
			for(int j=0;j<10;j++){
				String str130num=str130+String.valueOf(count+j);
				numlist.add(str130num);
			}
			String str150 =String.valueOf(numcount150+i);
			for(int j=0;j<10;j++){
				String str150num=str150+String.valueOf(count+j);
				numlist.add(str150num);
			}
			String str180 =String.valueOf(numcount180+i);
			for(int j=0;j<10;j++){
				String str180num=str180+String.valueOf(count+j);
				numlist.add(str180num);
			}
		}
				
		return numlist;
		
	}
}
