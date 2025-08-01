public class ChildSuperMethod extends ParentSuperMethod
{
	public void display()
	{
		System.out.println("This is the child display");
	}
    public static void main(String args[])
	{
		ChildSuperMethod csm=new ChildSuperMethod();
		System.out.println(csm.display);
		System.out.println(super.display);
	}
}
