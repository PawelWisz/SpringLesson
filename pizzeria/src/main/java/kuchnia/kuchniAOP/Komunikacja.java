package kuchnia.kuchniAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Komunikacja {
	
	
	@Pointcut("args(argumentInt)")
	public void pointCutInt(int argumentInt) {}
	
	@Pointcut("target(kuchnia.IKucharz)")
	public void pointCutTarget() {}
	
	@Pointcut("@target(annotation)")
	public void pointCutTargetAnnotation(Deprecated annotation) {}
	
	@Pointcut("within(kuchnia.Kucharz)")
	public void pointCutWithin() {}
	
	@Before("!pointCutWithin() && pointCutInt(arg)")
	public void porada(int arg) {
		System.out.println("PORADA "+ arg);
	}
	
	

	/*@After("execution(* kuchnia.IKucharz.pobierzSkladnikiZmagazynu(..))")
	public void poinorujOPobraniuSkladnikow() {
		System.out.println("Kucharz pobral skaldniki");

	}
	
	@Around("execution(* kuchnia.IKucharz.wydajPizze(..))")
	public void wydaniePizzy(ProceedingJoinPoint jp) {
		try{
			System.out.println("Pizza gotowa");
			jp.proceed();
			System.out.println("Pizza wydana");
		}catch(Throwable t) {
			System.out.print("Nie wydano pizzy");
		}
	}*/
}
