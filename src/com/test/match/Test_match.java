package com.test.match;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_match {
		
	Test_WriteData twd =new Test_WriteData();
	
	public void readtxt(String txtpath) throws IOException{
		File file =new File(txtpath);
		if(!file.exists()){
			System.out.println("文件不存在，检查路径");
		}
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
		String str=null;
		while((str=br.readLine())!=null){
			if(str.contains(Param.PARAM_FC.getValue())){
				twd.write_txt(str, new File(Param.PARAM_FC_PATH.getValue()));
			}else if(str.contains(Param.PARAM_OFFLINE.getValue())){
				twd.write_txt(str, new File(Param.PARAM_OFFLINE_PATH.getValue()));
			}else if(str.contains(Param.PARAM_VIPC.getValue())){
				twd.write_txt(str, new File(Param.PARAM_VIPC_PATH.getValue()));
			}else if(str.contains(Param.PARAM_BACK.getValue())){
				twd.write_txt(str, new File(Param.PARAM_BACK_PATH.getValue()));
			}else{
				twd.write_txt(str, new File(Param.PARAM_INIT_PATH.getValue()));
			}	
		}	
		br.close();
	}

}
