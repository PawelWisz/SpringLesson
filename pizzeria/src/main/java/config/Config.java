package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import api.IOrder;
import api.IPizza;
import implementacja.GoodPizza;
import implementacja.Order;

//@Configuration
public class Config {
		
	/*@Bean
	public IPizza pizza() {
		return new GoodPizza(15,"Dobra");
	}*/
	

	
	/*@Bean(name = "inna")
	public IOrder order(IPizza pizza) {
		return new Order(pizza);
	}*/


}
