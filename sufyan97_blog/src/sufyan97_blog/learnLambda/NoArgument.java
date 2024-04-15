package sufyan97_blog.learnLambda;

import java.math.BigDecimal;

public class NoArgument {
	interface Reference{
		public BigDecimal getGravitionalEnergyValue();
	}
	
	public void doCalculateForce() {
		Reference refInner= new Reference() {
			public BigDecimal getGravitionalEnergyValue() {
				BigDecimal grav = new BigDecimal(9.80f);
				return grav;
			}
		};
		
		System.out.println("show gravitional value from inner = " + refInner.getGravitionalEnergyValue());
	}
	
	public static void main(String[] args) {
		Reference ref = 
		()-> {
			BigDecimal grav = new BigDecimal(9.80f);
			return grav;
		};
		System.out.println("show gravitional value from main = " + ref.getGravitionalEnergyValue());
		
		NoArgument noArgument = new NoArgument();
		noArgument.doCalculateForce();
	}
}
