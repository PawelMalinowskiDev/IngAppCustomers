package com.ing.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.ing.app.model.Customer;
import com.ing.app.model.Transaction;

public class CustomerInitialization {
	
	final static SimpleDateFormat sdfTran = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	
	public static Customer initializeCustomer1() throws ParseException {
		Customer c1 = new Customer(1, 35000.25);
		List<Transaction> transactionsC1 = new ArrayList<Transaction>();
		transactionsC1.add(new Transaction("Withdrwal", -100.00, sdfTran.parse("1-01-2019 9:12:30")));
		transactionsC1.add(new Transaction("Restaurant", -22.56, sdfTran.parse("10-01-2019 17:40:56")));
		transactionsC1.add(new Transaction("Laptop", -1450.45, sdfTran.parse("15-01-2019 10:20:56")));
		transactionsC1.add(new Transaction("Coffee", -4.50, sdfTran.parse("17-01-2019 15:10:45")));
		transactionsC1.add(new Transaction("Train ticket", -12.00, sdfTran.parse("19-01-2019 09:23:13")));
		transactionsC1.add(new Transaction("Withdrwal", -500.00, sdfTran.parse("20-01-2019 17:00:00")));
		transactionsC1.add(new Transaction("Grocery", -134.27, sdfTran.parse("26-01-2019 8:32:20")));
		transactionsC1.add(new Transaction("Salary", 10000.00, sdfTran.parse("31-01-2019 10:10:10")));		
		transactionsC1.add(new Transaction("Withdrwal", -350.00, sdfTran.parse("31-01-2019 19:00:00")));
		c1.setTransactions(transactionsC1);
		return c1;
	}

}
