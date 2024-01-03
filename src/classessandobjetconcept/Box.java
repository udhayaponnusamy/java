package classessandobjetconcept;

class student

{
	String name;
	int rank;
	
	void display()
	{
	System.out.println("NAME =+ name");
	
	}
}


public class Box { 

	

	public static void main(String[] args) 
		{
		
		student s1 = new student();
		student s2 = new student();
		s1.name = "muruga";
		s2.name = "harae rama harae krishana";
		s1.rank = 100;
		s2.rank =50;
		s1.display();
		s2.display();
		
		int mark1 = 65;
		int mark2 =38;
		System.out.println(mark1);
	
		
		System.out.println(s2.name);
		System.out.println(s2.rank);
		
		
		
		int compName = company();
		System.out.println(compName);
		
		
		
		
		
		
		
		
		
		}
		
}	
		
		
		
		
		
		

	


