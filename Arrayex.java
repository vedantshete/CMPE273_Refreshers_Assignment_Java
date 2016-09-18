class Arrayex {

public static void main(String args[]){
	double sum=0;
    double[] arr = new double[4];
    
        arr[0] = 3.5;
        arr[1] = 4;
        arr[2] = 3.7;
        arr[3] = 4;
        sum = arr[0] + arr[1] + arr[2] + arr[3];
    
    Arrayex obj = new Arrayex();
    double average = cgpa(sum);
    System.out.println("Your cumulative gpa is:");  
    System.out.println(average);
    if(obj.pass(average)){
    	System.out.println("You have graduated!");
    }
}       

public boolean pass(double y){
	if(y>=3)
	{
		return true;
	}else {
		return false;
	}
}

public static double cgpa(double x)
{

    double avg=0;
	avg = x / 4;
	return avg;

}
}
