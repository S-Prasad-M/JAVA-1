class MultithreadingDemo implements Runnable {
	public void run()
	{
		try {
			System.out.println("Shree Prasad is running at " + Thread.currentThread().getId()+" meter/second");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
class MultiThreading {
	public static void main(String[] args)
	{
		int n = 5;
		for (int i = 0; i < n; i++) {
			Thread object= new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
