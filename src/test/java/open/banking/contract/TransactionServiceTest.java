package open.banking.contract;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import open.banking.contract.repository.TransactionRepository;
import open.banking.contract.service.TransactionService;



public class TransactionServiceTest {

	@Mock
	private TransactionRepository transactionRepository;


    @Test
    public void findAllByAccountNumber() {
        TransactionService transactionService = new TransactionService(transactionRepository);
        assertThat(transactionService.findAllByAccountNumber(1L).size()).isEqualTo(3);
    }
    
}
