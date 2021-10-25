package open.banking.contract;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.web.server.LocalServerPort;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import open.banking.contract.controller.TransactionController;
import open.banking.contract.repository.TransactionRepository;
import open.banking.contract.service.TransactionService;


public class TransactionComponentTest {

    @LocalServerPort
    private int port;
    
    @Mock
    private TransactionRepository transactionRepository;


    @Test
    public void testApplicationEndToEnd() {
    	RestAssuredMockMvc.given().standaloneSetup(new TransactionController(new TransactionService(transactionRepository)))
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/1", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
