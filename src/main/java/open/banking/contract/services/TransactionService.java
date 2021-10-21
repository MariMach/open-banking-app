package open.banking.contract.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import open.banking.contract.model.Transaction;


@Service
public class TransactionService {

	
	 public List<Transaction> findAllByAccountNumber(Long accountNumber) {
		 Transaction transaction1 = new Transaction("transaction type o", new Date(), new Long(1), "USD", 123.0, "Mimi0", "");
		 Transaction transaction2 = new Transaction("transaction type o", new Date(), new Long(1), "USD", 300.0, "Mimi1", "");
		 Transaction transaction3 = new Transaction("transaction type o", new Date(), new Long(1), "USD", 400.0, "Mimi2", "");
		 List<Transaction> transactions = List.of(transaction1, transaction2, transaction3);;
		 return transactions.stream()
	                .filter(transaction -> transaction.getAccountNumber().equals(accountNumber)).collect(Collectors.toList());
	 }
}
