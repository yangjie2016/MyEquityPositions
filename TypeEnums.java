package main.java.domain;

public enum TypeEnums {
	
	TRADE_TYPE_BUY(1,"BUY",""),
	TRADE_TYPE_SELL(2,"SELL",""),
	
	OP_TYPE_INSERT(1,"INSERT",""),
	OP_TYPE_UPDATE(2,"UPDATE",""),
	OP_TYPE_CANCEL(3,"CANCEL","");

	private int type;
	
	private String code;
	
	private String desc;	
	

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private TypeEnums(int type, String code, String desc) {
		this.type = type;
		this.code = code;
		this.desc = desc;
	}

	public String getCodeByType() {
		TypeEnums[] types=TypeEnums.values();
		for(TypeEnums type:types) {
		}
		return  "";
	}
	
}

	
