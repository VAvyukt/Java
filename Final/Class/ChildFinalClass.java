public class ChildFinalClass extends ParentFinalClass{ //we will get an error here because the ParentFinalClass is final.
public static void main(String args[])
{
	ChildFinalClass cc=new ChildFinalClass();
	cc.display();
}
}