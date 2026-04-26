public class ChildSuperConstructor extends ParentSuperConstructor
{
	ChildSuperConstructor()
	{
		super();
		System.out.println("This is the child class");
	}
	public static void main(String args[])
	{
		ChildSuperConstructor cd=new ChildSuperConstructor();
	}
}
