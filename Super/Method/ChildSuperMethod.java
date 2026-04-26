public class ChildSuperMethod extends ParentSuperMethod
{
	public void display()
	{
		System.out.println("This is the child display");
	}

	public void testSuper() {
		super.display();
	}
    public static void main(String args[])
	{
		ChildSuperMethod csm=new ChildSuperMethod();
		csm.display();
		csm.testSuper();
	}
}
