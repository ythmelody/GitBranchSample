package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st version");
		MyMath myMath = new MyMath();
		System.out.println(myMath.add(10, 5));
	}

}

class MyMath {
	int add(int a, int b) {
			return a+b;
	}
}