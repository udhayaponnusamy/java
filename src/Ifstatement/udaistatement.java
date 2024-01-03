package Ifstatement;

public class udaistatement {

	public static void main(String[] args) {
		 System.out.println("1");
	        System.out.println("2");
	        System.out.println("3");
	        System.out.println("4");
	        System.out.println("5");
	        
	        
	        //1.while loop
	        
	        /*
	         * syntax of while loop
	         * 
	         * while(condition)
	         * {
	         *             body/statements
	         * 
	         * 
	         * }
	         * 
	         * 
	         */
	        //0-----10------
	        int num=5;
	        int i=0;
	        
	        while(i<=num)
	        {
	            System.out.println("The value of-->"+i);//0 1 2 3 4 5
	            i++;//i+1-->0+1=1   1+1=2  2+1=3    3+1=4     4+1=5  5+1=6-----.........
	            
	        }
	        
	        System.out.println("Thanks");
	        
	        
	        //infinite while loop
	    /*    
	        while(true)    
	        {
	                System.out.println("Welcome to Taj");
	        }
	    
	        */
	        
	        System.out.println("****************The even numbers using while loop***************");
	        int ii=2;
	        int evenumbers=10;
	        
	        while(ii<=evenumbers)
	        {
	            System.out.println("even number are--->"+ii);
	            
	            ii=ii+2;
	            
	            
	        }
		
	        {
	        	    String[] Vechile = {"volvo", "BMW", "Ford", "Nexa"};
	        	    for (String z : Vechile) {
	        	      System.out.println(z);
	        	      
	        	    }    
	        	  }
	        	
	       
	        	    // Outer loop.
	        	    for (int y = 1; y <= 2; y++) {
	        	      System.out.println("Outer: " + y); // Executes 2 times
	        	      
	        	      // Inner loop
	        	      for (int j = 1; j <= 3; j++) {
	        	        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
	        	      }
	        	    } 
	        	  
	        	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//4. if --else if

				/*	//syntax
					if(condition)
					{
					
						//statements
						
						
					}else if(condition)
					{
					
							//statements
						
					}else if(condition)
					{
						
						//statements
						
					}
					else if(condition)
					{
					
						//statements
						
					}
					else
					{
						//statements
					}
					*/



				String browserName="chrome";

				if(browserName.equals("chrome"))
				{

					System.out.println("Launch the chrome Browser");


				}else if(browserName.equals("firefox"))
				{
					System.out.println("Launch the firefox Browser");
						//statements

				}else if(browserName.equals("ie"))
				{
					System.out.println("Launch the ie Browser");


				}
				else if(browserName.equals("safari"))
				{

					System.out.println("Launch the safari Browser");
					//statements

				}
				else
				{

					System.out.println("Plz pass vaild browser name");
					//statements
				}




















			}

		
	}


