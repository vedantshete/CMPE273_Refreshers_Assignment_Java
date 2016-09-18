
public class MyInterface implements movement{
	
	
	public void accelerate(int a){
		int x = a;
	 System.out.println("Speed accelerated by " + x);
	}
	
	public void decelerate(int b){
		int y = b;
		System.out.println("Speed decelerated by "+ y);
	}
	
	public Boolean speedcontrol()
	{
		int speed = 50;
		if(speed <= 55){
			return true;
	}else{
		return false;
	}
	}
	
	public static void main(String args[]){
	 MyInterface obj = new MyInterface();
	 obj.accelerate(5);
	 obj.decelerate(5);
	 if(obj.speedcontrol())
	 {
		 System.out.println("Your speed is fine.");
	 }
	}
	
}
