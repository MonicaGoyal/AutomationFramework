package Javatrickyquestions;

public class Findingoddandevennumbersinanarraydemo {
	
	public static void main(String[] args) {
		
		
	int arraynum[]= {1,2,3,4,5,6,7,8,9,10};
	for(int i=0; i<arraynum.length;i++)
	{
		if(arraynum[i]%2==0)
			
			System.out.println("arraynum is even number"+ arraynum[i]);
		
		
		
	}
	
	for(int i=0;i<arraynum.length;i++) {
		
		if(arraynum[i]%2!=0) {
			
			System.out.println("arraynum is odd number"+ arraynum[i]);
		}
		
	}

	for(int value: arraynum)
	{
		
	 if(value%2==0)
		 
		 System.out.println("even number is"+ value);
	}
		
	
	for(int value: arraynum) {
		
	
	
	if(value%2!=0) {
		
		System.out.println("odd number is"+ value);
	}
    	
    	
    	
    }
 
	}
}
	
	


