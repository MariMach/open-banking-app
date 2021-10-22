package open.banking.contract;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;
	 
	@Test
	public void testTransactions() throws Exception 
	{
		mockMvc.perform( MockMvcRequestBuilders
	      .get("/api/v1/transactions/1")
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk());
	}
}
