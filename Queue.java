
public class Queue {
static String[] ApplicantQ;
int cap;
static int top;
static int last;

public Queue(){
	cap = 5;
	ApplicantQ = new String[cap];
	top=0;
	last=0;
}

public boolean FullQ(){
	if(top>=(cap-1)){
		return true;
	}return false;
}

public boolean EmptyQ(){
	if(last>top || top==0){
		top = last = 0;
		return true;
	}return false;
}

public int Capinuse(){
	return top-last;
}
	
public boolean newApplicant(String x){
	if(!FullQ()){
		if(EmptyQ()){
			System.out.println("Queue is empty.");
		}
		ApplicantQ[top++] = x;
		return true;
	}else{
		return false;
	}		
}

public String removeApplicant(){
	if(EmptyQ()){
		System.out.println("Queue is empty.");
		return "No applicant remaining.";
	}else{
		String doneApplicant = ApplicantQ[last];
		ApplicantQ[last++] = null;
		return doneApplicant;
	}
}		
	
public void printApplicants(){
		System.out.println();
		System.out.println("Applicants being attended:");
		System.out.println();
		for(int i=top-1; i>=last; i--)
		{
			System.out.println(ApplicantQ[i]+"  ");
		}
		System.out.println();
	}
	
public static void main(String args[]){
	Queue obj = new Queue();
	System.out.println("Welcome to passport office.");
	obj.printApplicants();
	String app1 = "Vedant";
	String app2 = "Rahul";
	String app3 = "Paul";

	obj.newApplicant(app1);
	System.out.println("Added: "+app1+" Total applicants: "+obj.Capinuse());
	obj.newApplicant(app2);
	System.out.println("Added: "+app2+" Total applicants: "+obj.Capinuse());
	obj.newApplicant(app3);
	System.out.println("Added: "+app3+" Total applicants: "+obj.Capinuse());
	
	obj.printApplicants();
	
	System.out.println("Applicant attended: "+obj.removeApplicant());
	System.out.println("Total applicants remaining: "+obj.Capinuse());
	System.out.println("Applicant attended: "+obj.removeApplicant());
	System.out.println("Total applicants remaining: "+obj.Capinuse());
	
	obj.printApplicants();
	
	
	
	
}

}
