package implementacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import api.IOrder;
import api.IPizza;


@Component
public class Order implements IOrder{
	
	
	
	private IPizza pizza;
	
	public Order(@Value("#{goodPizza}")IPizza pizza) {
		super();
		this.pizza=pizza;
	}

	public void printOrder() {
		System.out.println("Zamowinie: "+ pizza.getName()+ ", cena: "+pizza.getPrice());
		
	}

}
