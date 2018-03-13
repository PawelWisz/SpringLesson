package kuchnia.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kuchnia.IKucharz;
import kuchnia.InterfaceZapiekanka;
import kuchnia.Kucharz;
import kuchnia.PomocnikKucharza;
import kuchnia.Zapiekanka;
import kuchnia.kuchniAOP.AspektZapeikanki;
import kuchnia.kuchniAOP.Komunikacja;
import kuchnia.kuchniAOP.KontrolaMagazynu;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public InterfaceZapiekanka zapiekanka() {
		return new Zapiekanka();
	}
	@Bean
	public  AspektZapeikanki zap() {
		return new AspektZapeikanki();
	}
	
	@Bean
	@Qualifier("kucharz")
	public IKucharz kucharz() {
		return new Kucharz();
	}
	
	@Bean
	@Qualifier("pomocnik_kucharza")
	public IKucharz pomocnikKucharza() {
		return new PomocnikKucharza();
	}
	
	@Bean
	public KontrolaMagazynu kontrola() {
	return new KontrolaMagazynu();
	}
	
	@Bean
	public Komunikacja komunikacja() {
		return new Komunikacja();
	}
}
