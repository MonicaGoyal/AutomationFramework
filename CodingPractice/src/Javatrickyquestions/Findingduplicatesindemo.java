package Javatrickyquestions;

public class Findingduplicatesindemo {

	public static void main(String[] args) {
		
		String str[]= {"Monica","Mickey","Mukesh","Monica"};
		
		boolean flag=false;
		
		for(int i=0;i<str.length;i++) {
			
			for(int j=i+1;i<str.length;j++)
			{
				
				if(str[i]==str[i])
					
					System.out.println("found duplicate elements is"+ str[i]);
				    flag=true;
				
				 
				
			}
			
		}
	

	}

}
