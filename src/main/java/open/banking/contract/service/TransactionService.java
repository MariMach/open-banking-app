package open.banking.contract.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import open.banking.contract.entity.Transaction;
import open.banking.contract.repository.TransactionRepository;


@Service
public class TransactionService {
	
    private TransactionRepository repository;

    @Autowired
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> findAllByAccountNumber(Long accountNumber) {
        return repository.findAllByAccountNumber(accountNumber);
    }

	public List<Transaction> findAll() {
        return repository.findAll();
	}

}

