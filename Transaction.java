package main.java.domain;

public class Transaction {
	
	private int id;
	
	private int TradeId;
	
	private String secutityCode;
	
	private int quantity;
	
	private int opType;
	
	private int tradeType;
	
	private int version;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTradeId() {
		return TradeId;
	}

	public void setTradeId(int tradeId) {
		TradeId = tradeId;
	}

	public String getSecutityCode() {
		return secutityCode;
	}

	public void setSecutityCode(String secutityCode) {
		this.secutityCode = secutityCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOpType() {
		return opType;
	}

	public void setOpType(int opType) {
		this.opType = opType;
	}

	public int getTradeType() {
		return tradeType;
	}

	public void setTradeType(int tradeType) {
		this.tradeType = tradeType;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	

}
