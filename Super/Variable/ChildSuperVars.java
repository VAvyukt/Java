public class ChildSuperVars extends ParentSuperVars
{
	int a=30;

	public void printVars() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
    public static void main(String args[])
	{
		ChildSuperVars csv=new ChildSuperVars();
		csv.printVars();
	}
}