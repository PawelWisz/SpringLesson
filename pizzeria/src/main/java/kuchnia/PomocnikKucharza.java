package kuchnia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Deprecated
public class PomocnikKucharza implements IKucharz{

	
	@Autowired
	@Qualifier("pomocnik_kucharza")
	private IKucharz kucharz;
	
	
	public void pobierzSkladnikiZmagazynu(int liczbaSkladnkow) {
		System.out.println("Pomocnik Kucharza pobiera "+ liczbaSkladnkow + " skladnikow z magazynu");
		
	}

	public void pobierzSkladnikiZmagazynu() {
		System.out.println("Pomocnik Kucharza pobiera skladniki");		
	}

	public void przygotujPizze(int liczbaPizzy) {
		System.out.println("Pomocnik Kucharza oddelegowuje przygotowanie pizzy od nr"+liczbaPizzy+" do kucharza");
		kucharz.przygotujPizze(liczbaPizzy);
		
	}

	public void przygotujPizze() {
		System.out.println("Pomocnik Kucharza oddelegowuje przygotowanie pizzy do kucharza");
		kucharz.przygotujPizze();	
		
	}

	public void wydajPizze() {
		System.out.println("Pomocnik wydaje pizze");
		
	}

}
