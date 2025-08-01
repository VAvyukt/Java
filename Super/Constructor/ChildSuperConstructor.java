public class ChildSuperConstructor extends ParentSuperConstructor
{
	ChildSuperConstructor()
	{
		System.out.println("This is the child class");
		super.ParentSuperConstructor();
	}
}