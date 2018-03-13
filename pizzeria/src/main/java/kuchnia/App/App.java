package kuchnia.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kuchnia.IKucharz;
import kuchnia.InterfaceZapiekanka;
import kuchnia.config.AppConfig;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IKucharz i = (IKucharz) context.getBean("kucharz");
		((InterfaceZapiekanka)i).przygotujZapiekanke();
		

	}

}
