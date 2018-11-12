package lab3;

public class recursiveFuncs {
	public static int factorial(int num) {
		if(num > 1) {
			return factorial(num - 1) * num;
		}else {
			return 1;
		}
	}
	
	public static int pow2(int num, int pow) {
		if(pow >= 1) {
			return pow2(num, pow - 1) * num;
		}else {
			return 1;
		}
	}
	
	public static int summation(int num) {
		if(num > 1) {
			return summation(num - 1) + num;
		}else {
			return 1;
		}
	}
	
	public static int euclidGCD(int x, int y) {
		if(y == 0){
			return x;
		}else if(x >= y && y >= 1) {
			return euclidGCD(y, (x % y));
		}else {
			return euclidGCD(y,x);
		}
	}
}