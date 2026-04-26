public class FinalVariable{
public static void main(String args[])
{
	int a=10;
	a++;
	System.out.println(a);
	
	final int b=10;
	b++; // b++ will not work in this case, since b is final.
	System.out.println(b);
}
}