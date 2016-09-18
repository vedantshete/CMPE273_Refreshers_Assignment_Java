public class Multithread extends Thread{
	
	private Thread x;
	private String threadone; 
	
	int stops=5;
	int st=1;
	
	Multithread(String a){
		threadone = a;
		System.out.println("Thread number "+ threadone +" starts.");
	}
	
	public void run(){
		try{
			System.out.println("Thread number "+ threadone +" is running.");
			Thread.sleep(5000);
		}
		catch(InterruptedException interr){
			System.out.println("Thread number " + threadone +" is interrupted.");
		}
		System.out.println("Thread number " + threadone +" has terminated.");
	}
	public void start()
	   {
	      if (x == null)
	      {
	         x = new Thread(this, threadone);
	         x.start ();     
	      }
	    }
	public static void main(String args[]){
		String tr1 = "1";
		String tr2 = "2";
		String tr3 = "3";
		
		Multithread obj1 = new Multithread(tr1);
		Multithread obj2 = new Multithread(tr2);
		Multithread obj3 = new Multithread(tr3);
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
