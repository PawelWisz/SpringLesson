package pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import api.IOrder;
import config.AutoConfig;
import config.Config;
import implementacja.Order;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		IOrder order = context.getBean(IOrder.class);
		order.printOrder();
		IOrder order2 = context.getBean(Order.class);
		order2.printOrder();
	}

}
