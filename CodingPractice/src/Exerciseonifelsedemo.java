import java.util.Scanner;

public class Exerciseonifelsedemo {
	
	public static void main(String[] args) {
		
		//int age =18;
//		
//		boolean cond = (age == 18);
//		
//		if(cond) {
//			
//			System.out.println("Boys:you can drive");
//			
//		}
//		
//		else {System.out.println("Sorry: you can not drive");	
//			
//			
//		}
//		}
		
//	int markschem;
//	int marksmaths;
//	int marksphy;
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter your marks in chemistry");
//	markschem = sc.nextInt();
//	System.out.println("Enter your marks in maths");
//	marksmaths = sc.nextInt();
//	System.out.println("Enter your marks in physics");
//	marksphy =sc.nextInt();
//	
//	int avgmarks = (markschem+marksmaths+marksphy)/3;
//	if(avgmarks>=40 && markschem>33 && marksmaths>33 && marksphy>33 ) {
//		
//		System.out.println("student is passed");
//	
//		}
//			
//	else {
//		
//		System.out.println("student is not passed");
//		
//	}
//	
	
//	int incomeslab=0;
//	int incometax=0;
//	
//	if(incomeslab>2.5 && incomeslab<5) {
//		
//		System.out.println("the incometaxpayable is"+ incomeslab*.5 );
//	}
//	
//	if(incomeslab>5 && incomeslab<10) {
//		
//		System.out.println("the incometaxpayable is"+ incomeslab*.20 );
//	}
//	
//	
//	if(incomeslab>10) {
//		System.out.println("the incometaxpayable is"+ incomeslab*.30);
//	}
//	
//	
	
	//Enhanced switch case
		
//		Scanner sc = new Scanner(System.in);
//		
//		int day = sc.nextInt();
//		 switch(day) {
//		 
//		 case 1-> System.out.println("today is monday");
//		 
//		 case 2-> System.out.println("today is tuesday");
//		 
//		 
//		 case 3-> System.out.println("today is wednesday");
//		 
//		 case 4-> System.out.println("today is thurs");
//		 
//		 
//		
//	
//	
//	
//	}
//	
//	

		Scanner sc = new Scanner(System.in);
		String website = sc.next();
		if(website.endsWith(".org")) {
			System.out.println("This is an organizational website");}
		else if(website.endsWith(".in"))	{
			System.out.println("this is an indian website");
		}
		else if (website.endsWith(".com")) {
			System.out.println("This is a commercial website");
		}
			
			
			
		}
		
		
		
		
	}


