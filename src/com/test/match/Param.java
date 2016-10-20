package com.test.match;

public enum Param {
	PARAM_FC("加密手机号"),PARAM_OFFLINE("线下查询会员加密参数"),PARAM_VIPC("会员操作加密参数"),
	PARAM_BACK("返回参数解密"),PARAM_INIT_NUM("原始电话号"),PARAM_FC_PATH("E:\\work\\firstcode.txt"),
	PARAM_OFFLINE_PATH("E:\\work\\offline.txt"),PARAM_VIPC_PATH("E:\\work\\VIP_Code.txt"),
	PARAM_BACK_PATH("E:\\work\\backparam.txt"),PARAM_INIT_PATH("E:\\work\\phonenum.txt");
	
	private final String value;
    private Param(String value){
    	this.value =value;
    }
    public String getValue() {
    	return value ;
    }
}
