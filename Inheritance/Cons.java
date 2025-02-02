package Inheritance;

public class Cons {
    public class A 
{
	static int q;
	int a;
	A()
	{
		super();
		this.a = 0;
		
	}
	public void one()
	{
		System.out.println(a);
	}
	public static void main(String args[])
{
	C l = new C();
	l.three();
	l.two();
	l.one();
	
}

}
class B extends A
{
	static int y;
	int b;
	B()
	{
		super();
		this.b =0;
	}
	public void two()
	{
		System.out.println(b);
	}
	
}
class C extends B
{
	static int W;
	int c;
	C()
	{
		super();
		this.c =0;
	}
	public void three()
	{
		System.out.println(c);
	}
	

}
}