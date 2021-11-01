public class Driver{
	public static void main(String[] args){
		RealNumber r1 = new RealNumber(1.25);
		RealNumber r2 = new RealNumber(8.0);
		System.out.println(r1.add(r2));
		System.out.println(r1.subtract(r2));
		System.out.println(r1.multiply(r2));
		System.out.println(r1.divide(r2)); // should be 5/32 or 0.15625
	}
}
