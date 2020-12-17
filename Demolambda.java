package java8featues;

public class Demolambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse r = n -> {
			int rem, rev = 0;
			while (n != 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			System.out.println(rev);
		};
		r.rev(123);
	}
}