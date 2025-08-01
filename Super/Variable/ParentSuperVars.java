public class ParentSuperVars extends GrandparentSuperVars
{
	int a=20;
	
public static void main(String args[])
{
	ParentSuperVars psv=new ParentSuperVars();
	System.out.println(psv.a);
	System.out.println(super.a);
}
}