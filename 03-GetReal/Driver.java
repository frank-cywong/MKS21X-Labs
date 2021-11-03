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
		RationalNumber q2 = new RationalNumber(70,28);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q1.add(q2)); // should be 19/6
		System.out.println(q1.subtract(q2)); // should be -11/6
		System.out.println(q1.multiply(q2)); // should be 5/3
		System.out.println(q1.divide(q2)); // should be 4/15
		System.out.println(r2.add(q2)); // should be 10.5
		System.out.println(r2.subtract(q2)); // should be 5.5
		System.out.println(r2.multiply(q2)); // should be 20
		System.out.println(r2.divide(q2)); // should be 3.2
		System.out.println(q2.add(r2)); // should still be 10.5
		System.out.println(q2.subtract(r2)); // should be -5.5
		System.out.println(q2.multiply(r2)); // should still be 20
		System.out.println(q2.divide(r2)); // should be 0.3125
		System.out.println(q1.equals(new RationalNumber(1,2))); // should be false
		System.out.println(q1.equals(new RationalNumber(6,9))); // should be true
		System.out.println(q1.reciprocal()); // should be 3/2
		System.out.println(new RationalNumber(3,0)); // should be 0/1
		System.out.println((new RationalNumber(3,0)).reciprocal().equals(new RationalNumber(8,0))); // should be true due to how 0s are handled
		System.out.println(new RationalNumber(0,2).equals(new RationalNumber(0,1))); // should be equal
		double a,b;
		RealNumber ra,rb;
		for(int i = 0; i < 15; i++){
			a = Math.random()*5;
			b = Math.random()*5;
			ra = new RealNumber(a);
			rb = new RealNumber(b);
			switch(ra.compareTo(rb)){
				case(-1):
					System.out.println(a < b ?"Correct":"Incorrect");
					break;
				case(0):
					System.out.println(a == b ?"Correct":"Incorrect");
					break;
				case(1):
					System.out.println(a > b ?"Correct":"Incorrect");
					break;
			}
		}
	}
}
