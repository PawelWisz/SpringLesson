package implementacja;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import api.IPizza;
@Component
public class ExoticPizza implements IPizza {
private int price;
private String name;



public ExoticPizza(@Value("#{goodPizza.price > 13?  13 : 20 }")int price,@Value("#{goodPizza.getName()?.toUpperCase()}") String namel) {
	super();
	this.price = price;
	this.name = namel;
}

public int getPrice() {
	
	return price;
}

public String getName() {
	
	return name;
}

public void setPrice(int price) {
	this.price=price;
	
}


}
