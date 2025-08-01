public class ChildSuperVars extends ParentSuperVars
{
	int a=30;
	
    public static void main(String args[])
	{
		ChildSuperVars csv=new ChildSuperVars();
		System.out.println(csv.a);
		System.out.println(super.a);
	}
}