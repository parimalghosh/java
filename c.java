class Circle
{
	double rad;
	public void take(double r)
	{
		rad=r;
	}

	public void show()
	{
		System.out.println("Radious : "+rad);
		System.out.println("Circumference of the circle : "+doCir());
		System.out.println("Area of the circle : "+doArea());
	}

	double doCir()
	{
		return 2*Math.PI*rad;
	}

	double doArea()
	{
		return Math.PI*rad*rad;
	}
}


class c
{
	public static void main(String args[])
	{
		Circle ob1=new Circle();
		ob1.take(7);
		ob1.show();
	}
}