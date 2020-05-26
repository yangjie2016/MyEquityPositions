package main.java.service;

import java.util.List;

import main.java.db.TransactionTable;
import main.java.domain.Transaction;
import main.java.domain.TypeEnums;

public class TransactionManage {
	
	public static int mergePositionBySecurityCode(String securityCode) {
		int result=0;
		List<Transaction> tlist=TransactionTable.getBySecurityCode(securityCode);
		for(Transaction t:tlist){
			if(t.getOpType()==TypeEnums.OP_TYPE_INSERT.getType()) {
				if(t.getTradeType()==TypeEnums.TRADE_TYPE_BUY.getType()) {
					result+=t.getQuantity();
				}else {
					result-=t.getQuantity();
				}
			}else if(t.getOpType()==TypeEnums.OP_TYPE_UPDATE.getType()) {
				result=t.getQuantity();
				break;
			}else {
				result=0;
				break;
			}
			
		}
		
		return result;
	}
	
}
