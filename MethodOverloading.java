package Oops;

public class MethodOverloading {
	static void m1(){
		System.out.println("m1()");
	}
	static void m1(int i){
		System.out.println("m1(int");
	}

	public static void main(String[] args) {
		m1(10);
		m1();

	}

}
