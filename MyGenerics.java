
public class MyGenerics {
	
public static void main(String args[]){	
	MyGenerics obj1 = new MyGenerics();
	String name_1 = "Vedant";
	String major_1 = "SE";
	double gpa_1 = 3.7;
	
	
	
	MyGenerics obj2 = new MyGenerics();
	String name_2 = "Sourabh";
	String major_2 = "CE";
	double gpa_2 = 3.9;
	
	
	System.out.println("Student 1: ");
	obj1.setdata(name_1,major_1,gpa_1);
	
	
	System.out.println("Student 2: ");
	obj2.setdata(name_2,major_2,gpa_2);
	
}

public void setdata(String x, String y, double z){
	String name = x;
	String major = y;
	double gpa = z;

	show(name);
	show(major);
	show(gpa);
}

public <A> void show(A data)
{
	System.out.println(" "+data);
}
}
//
//public double returnmethod(){
//	return 
//}
//
//}





//
//public class MyGenerics {
//	public static <A> void print(A[] input){
//		for(A outt: input){
//			System.out.println(" "+outt);
//		}
//	}
//	
//	public static void main(String args[]){
//		Integer[] intArr = {3,5,1};
//		Double[] doubleArr = {2.1,5.2,3.3};
//		
//		System.out.println("Integer array contains:");
//		print(intArr);
//		
//		System.out.println("Double array contains:");
//		print(doubleArr);
//	}
//	
//}

