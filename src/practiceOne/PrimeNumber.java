package practiceOne;

//import java.math.RoundingMode;
//import com.google.common.math.InMath;
public class PrimeNumber {

	public static void main(String[] args) {

		// write a java program to check whether a given number is prime or not

//		int a1=63;
//		if(IntMath.isPrime(a1))
//			System.out.println(a1+ " is a prime number");
//		else
//			System.out.println(a1+ " is not a prime number");
		
		int num = 2;
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println("number " + num + " is prime");
		}else {
			System.out.println("number "+ num+ " is not prime");
		}
	}
}