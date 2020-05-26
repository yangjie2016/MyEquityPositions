package main.java.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import main.java.domain.Transaction;

public class TransactionTable {
	
	private static int seqNo=1;
	private static Map<Integer,Transaction> map=new HashMap<Integer,Transaction>(100);
	
	public static boolean insert(Transaction t) {
		int id=seqNo++;
		t.setId(id);
		map.put(id, t);
		if(map.containsKey(t)) {
			return true;
		}else {
			return false;
		}
	}

	public static List<Transaction> getBySecurityCode(String securityCode){
		List<Transaction> list= map.values().stream()
				.filter(t->t.getSecutityCode().equals(securityCode))
				.collect(Collectors.toList());
		return list;
	}
	
}
