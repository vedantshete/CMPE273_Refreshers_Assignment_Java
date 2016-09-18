import java.util.ArrayList;
import java.util.Scanner;

public class CakeList {

	public ArrayList<String> cakeList;
	public CakeList()
	{
		cakeList = new ArrayList<String>();
		
	}
    public static void main(String[] args) {
    	CakeList obj=new CakeList();
    	//obj.cakeList = new ArrayList<>();

        obj.cakeList.add("Chocolate");
        obj.cakeList.add("Fruit");
        obj.cakeList.add("Vanilla");
        obj.cakeList.add("Strawberry");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter cake flavour to be searched:");
        String x;  
        x = in.nextLine();    
       if(obj.Check(x)){
    	   System.out.println("Found"); 
       }else{
    	   System.out.println("Not found");
       }              
    } 
    public boolean Check(String x)
    {
         return(this.cakeList.contains(x));
    }
    }

    
