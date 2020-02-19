package compound;
import java.util.Scanner;

public class program {
	
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		System.err.print("enter numbers");
		intrest i=new intrest();
		double p=s.nextDouble();
		double t=s.nextDouble();
		double r=s.nextDouble();
		i.si(p, t, r);
		i.ci(p,t,r);
	}
}
