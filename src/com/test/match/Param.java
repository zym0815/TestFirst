package com.test.match;

public enum Param {
	PARAM_FC("�����ֻ���"),PARAM_OFFLINE("���²�ѯ��Ա���ܲ���"),PARAM_VIPC("��Ա�������ܲ���"),
	PARAM_BACK("���ز�������"),PARAM_INIT_NUM("ԭʼ�绰��"),PARAM_FC_PATH("E:\\work\\firstcode.txt"),
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
