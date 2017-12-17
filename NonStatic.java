package Oops;

public class NonStatic {

static int i;
private static NonStatic ns;
int j;
int k;
public static void main(String[] args) {
	System.out.println("execution start");
	NonStatic.i=10;
	NonStatic.ns=new NonStatic();
	ns.j=20;
	ns.k=30;
	System.out.println("execution end");


	}

}
