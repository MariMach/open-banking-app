package open.banking.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import open.banking.contract.controller.TransactionController;


// @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
// @ComponentScan(basePackageClasses=TransactionController.class)
// @SpringBootApplication(scanBasePackages = {"open.banking.contract.entity", "open.banking.contract.repository"} , exclude = JpaRepositoriesAutoConfiguration.class)
@SpringBootApplication
public class ContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractApplication.class, args);
	}

}

