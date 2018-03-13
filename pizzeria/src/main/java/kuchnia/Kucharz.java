package kuchnia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Kucharz implements IKucharz{
	
	@Autowired
	@Qualifier("kucharz")
	private IKucharz kucharz;

	public void pobierzSkladnikiZmagazynu() {
		System.out.println("kucharz pobiera skladniki");
		
	}

	public void przygotujPizze() {
		System.out.println("Kucharz przygotowywuje pizze");
		
	}

	public void wydajPizze() {
		System.out.println("Kucharz wydaje pizze");
		
	}

	public void pobierzSkladnikiZmagazynu(int liczbaSkladnkow) {
		System.out.println("kucharz pobiera "+ liczbaSkladnkow + " skladnikow z magazynu");
	}

	public void przygotujPizze(int liczbaPizzy) {
		System.out.println("Kucharz przygotwuje pizze nr: "+liczbaPizzy);
		
	}
	

}
