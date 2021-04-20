package au.com.nab.icommerce.product.auditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductAuditingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAuditingServiceApplication.class, args);
	}

}
