package test.java;

import main.java.db.TransactionTable;
import main.java.domain.Transaction;
import main.java.domain.TypeEnums;
import main.java.service.TransactionManage;

public class TransactionTest {
	
	public static void main(String[] args) {
		Transaction t=new Transaction();
		t.setTradeId(1);
		t.setVersion(1);
		t.setSecutityCode("REL");
		t.setQuantity(50);
		t.setOpType(TypeEnums.OP_TYPE_INSERT.getType());
		t.setTradeType(TypeEnums.TRADE_TYPE_BUY.getType());
		TransactionTable.insert(t);
		
		t=new Transaction();
		t.setTradeId(2);
		t.setVersion(1);
		t.setSecutityCode("ITC");
		t.setQuantity(40);
		t.setOpType(TypeEnums.OP_TYPE_INSERT.getType());
		t.setTradeType(TypeEnums.TRADE_TYPE_SELL.getType());
		TransactionTable.insert(t);

		
		t=new Transaction();
		t.setTradeId(3);
		t.setVersion(1);
		t.setSecutityCode("INF");
		t.setQuantity(70);
		t.setOpType(TypeEnums.OP_TYPE_INSERT.getType());
		t.setTradeType(TypeEnums.TRADE_TYPE_BUY.getType());
		TransactionTable.insert(t);

		
		t=new Transaction();
		t.setTradeId(1);
		t.setVersion(2);
		t.setSecutityCode("REL");
		t.setQuantity(60);
		t.setOpType(TypeEnums.OP_TYPE_UPDATE.getType());
		t.setTradeType(TypeEnums.TRADE_TYPE_BUY.getType());
		TransactionTable.insert(t);

		
		t=new Transaction();
		t.setTradeId(2);
		t.setVersion(2);
		t.setSecutityCode("ITC");
		t.setQuantity(30);
		t.setOpType(TypeEnums.OP_TYPE_CANCEL.getType());
		t.setTradeType(TypeEnums.TRADE_TYPE_BUY.getType());
		TransactionTable.insert(t);
		
		t=new Transaction();
		t.setTradeId(4);
		t.setVersion(1);
		t.setSecutityCode("INF");
		t.setQuantity(20);
		t.setOpType(TypeEnums.OP_TYPE_INSERT.getType());
		t.setTradeType(TypeEnums.TRADE_TYPE_SELL.getType());
		TransactionTable.insert(t);

		int relResult=TransactionManage.mergePositionBySecurityCode("REL");
		System.out.println(relResult);
		int itcResult=TransactionManage.mergePositionBySecurityCode("ITC");
		System.out.println(itcResult);
		int infResult=TransactionManage.mergePositionBySecurityCode("INF");
		System.out.println(infResult);

	}
}
