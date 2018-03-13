package implementacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import api.IOrder;
import api.IPizza;


@Component
@Primary
public class ExclusiveOrder implements IOrder{
	
	

	private IPizza pizza;
	
	public ExclusiveOrder() {
		super();
	}

	public void printOrder() {
		System.out.println("Zamowinie exclisive: "+ pizza.getName()+ ", cena: "+pizza.getPrice());
		
	}
	
	public IPizza getPizza() {
		return pizza;
	}
	
	
	@Value("#{exoticPizza}")
	public void setPizza(IPizza pizza) {
		this.pizza=pizza;
	}

}
