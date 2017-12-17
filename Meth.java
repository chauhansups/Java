package Oops;

public class Meth {

	public static void main(String[] args) {
int i=m1();
System.out.println("i="+i);
int j=m1()+10;
System.out.println("j="+j);
m1();
System.out.println(m1());

	}

	 static int m1() {
System.out.println("executing m1");		
return 10;
	}

}

