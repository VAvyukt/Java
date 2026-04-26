public class ParentSuperVars extends GrandparentSuperVars
{
	int a=20;
	
	public void printVars() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
public static void main(String args[])
{
	ParentSuperVars psv=new ParentSuperVars();
	psv.printVars();
}
}