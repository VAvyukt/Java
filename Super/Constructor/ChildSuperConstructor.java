public class ChildSuperConstructor extends ParentSuperConstructor
{
	ChildSuperConstructor()
	{
		System.out.println("This is the child class");
		super.ParentSuperConstructor();
	}
	public static void main(String args[])
	{
		Child cd=new Child();
	}
}
