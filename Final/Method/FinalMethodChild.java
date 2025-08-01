public class FinalMethodChild extends FinalMethodParent{
public void display() //it is giving an error here because the earlier method is final.
{
	System.out.println("This is the child display");
}
public static void main(String args[])
{
	FinalMethodChild mc=new FinalMethodChild();
	mc.display();
}
}
