import java.util.Scanner;
public class Arc_Cos {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		double xa, xb, ya, yb, xapow, xbpow, xaxb, yayb, sumxaxbyayb, multi, div ;
		double yapow, ybpow, sqrt1, sumxapowyapow, sumxbpowybpow, sqrt2, theta;		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter xa");
		xa = input.nextDouble();
		
		System.out.println("Enter xb");
		xb = input.nextDouble();
		
		System.out.println("Enter ya");
		ya = input.nextDouble();
		
		System.out.println("Enter yb");
		yb = input.nextDouble();
		
		xaxb = xa * xb;
		yayb = ya * yb;
		
		sumxaxbyayb = xaxb + yayb;
		
		xapow = Math.pow(xa, 2);
		xbpow = Math.pow(xb, 2);
		
		yapow = Math.pow(ya, 2);
		ybpow = Math.pow(yb, 2);
		
		sumxapowyapow = xapow + yapow;
		sumxbpowybpow = xbpow + ybpow;
		
		sqrt1 = Math.sqrt(sumxapowyapow);
		sqrt2 = Math.sqrt(sumxbpowybpow);
		
		multi = sqrt1 * sqrt2;
		div = sumxaxbyayb / multi;
		
		theta = Math.acos(div);
		
		System.out.println(Math.toDegrees(theta));
	}

}
