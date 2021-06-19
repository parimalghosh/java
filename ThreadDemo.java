class ThreadDemo
{
	public static void main(String args[])
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread is : "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interupted.");
		}
	}
}
