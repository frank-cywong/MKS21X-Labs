public class Driver{
	public static void main(String[] args){
		RealNumber r1 = new RealNumber(1.25);
		RealNumber r2 = new RealNumber(8.0);
		System.out.println(r1.add(r2));
		System.out.println(r1.subtract(r2));
		System.out.println(r1.multiply(r2));
		System.out.println(r1.divide(r2)); // should be 5/32 or 0.15625
		System.out.println(r1.getValue());
		System.out.println(r1);
		RationalNumber q1 = new RationalNumber(2,3);
		RationalNumber q2 = new RationalNumber(74,28);
		System.out.println(q1);
		System.out.println(q2);
	}
}
