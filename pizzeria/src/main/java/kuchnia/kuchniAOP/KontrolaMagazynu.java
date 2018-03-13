package kuchnia.kuchniAOP;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KontrolaMagazynu {
	
	
	@Pointcut("execution(* kuchnia.IKucharz.pobierzSkladnikiZmagazynu(..))")
	public void pointcut() {}
	

	/*@Before("pointcut()")
	public void sprawdzSkladnikiMagazynu() {
		System.out.println("Sprawdzam stan magazynu");
	}*/
	
	@AfterThrowing("pointcut()")
	public void magazynPusty() {
		System.out.println("W magazynie sa braki");
		
	}
}
