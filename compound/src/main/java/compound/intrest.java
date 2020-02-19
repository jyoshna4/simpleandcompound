
package compound;

import static java.lang.Math.pow;


public class intrest {
	public void si(double p,double t,double r)
	{
		System.err.print("simple intrest is"+((p*t*r)/100));
		
	}
	public void ci(double p,double t,double r)
	{
		double a=pow((1+r/100),t);
		double b=p*(a-1);
		System.err.print("compound intrest is"+b);
		
	}

}
