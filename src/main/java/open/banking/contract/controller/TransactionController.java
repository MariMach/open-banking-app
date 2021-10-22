package open.banking.contract.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import open.banking.contract.entity.Transaction;
import open.banking.contract.service.TransactionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class TransactionController {

	private TransactionService transactionService;
	
	@Autowired
	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	@GetMapping("/transactions/{accountNumber}")
	public List<Transaction> transactionsByAccountNumber(@PathVariable("accountNumber") Long accountNumber) {
	        return transactionService.findAllByAccountNumber(accountNumber);
	}
	
}
