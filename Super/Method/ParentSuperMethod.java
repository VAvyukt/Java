public class ParentSuperMethod
{
	public void display()
	{
		System.out.println("This is the parent display");
	}
    public static void main(String args[])
	{
		ParentSuperMethod psm=new ParentSuperMethod();
		System.out.println(psm.display);
	}
}