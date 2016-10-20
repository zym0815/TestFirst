package com.test.match;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Test_WriteData {
	
	public void write_txt(String str,File file) throws IOException{
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true),"utf-8"));
		bw.write(str);
		bw.newLine();
		bw.close();
	}
				
	public void write_txt(ArrayList<String> alist,File file) throws IOException{
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true),"utf-8"));
		for(int i=0;i<alist.size();i++){
			bw.write(alist.get(i));
			bw.newLine();
			bw.close();
		}
	}
	

}
