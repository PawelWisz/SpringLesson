package kuchnia.kuchniAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import kuchnia.InterfaceZapiekanka;
import kuchnia.Zapiekanka;

@Aspect
public class AspektZapeikanki {

		@DeclareParents(value="kuchnia.IKucharz+", defaultImpl=Zapiekanka.class)
		public static InterfaceZapiekanka iZapiekanka;
}
