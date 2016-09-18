
public class MyStack {
	private String stackData[];
	private int top;
	private int size;
	
	public static MyStack getInitializedStack(int size){
		MyStack stack = new MyStack();
		stack.stackData = new String[size];
		stack.size=size;
		stack.top =-1;
		return stack;
				
	}
	
	public void push(String value){
		
		if(top==size-1){
			System.out.println("Stack is full.");
		}else{
			top++;
			this.stackData[top]=value;	
		}
	}
	
	public String pop(){
		
		if(top!=-1){
			return stackData[top--];
		}else{
			System.out.println("Stack is empty.");
		}
		return null;
	}
	
	public void displayData(){
		for(int i=top; i>-1;i--){
			System.out.println(stackData[i]);
		}
		System.out.println("\n\n");
	}
	
	public static void main(String[] args){
		MyStack obj = MyStack.getInitializedStack(5);
		obj.push("White");
		obj.push("Blue");
		obj.push("Black");
		obj.push("Orange");
		obj.push("Red");
		obj.displayData();	
		obj.push("Pink");
		obj.displayData();
		System.out.println("Popping"+obj.pop());
		obj.displayData();
		System.out.println("Popping"+obj.pop());
		obj.displayData();
		System.out.println("Popping"+obj.pop());
		System.out.println("Popping"+obj.pop());
		System.out.println("Popping"+obj.pop());
		System.out.println("Popping"+obj.pop());
		
		
	}
	
	

}
