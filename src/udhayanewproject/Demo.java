package udhayanewproject;

public class Demo {
   int a=10;
   int b=20;
   final int c=40;
   static int d=40;
   int e;
   
   
   void add()
	{
	//local variables
	int first=20;
	int second=60;
	
	
	int sum=first+second;
	System.out.println(sum);
	int sum=first/second;
	System.out.println(sum);
	
	}
	
	
	public static void main(String[] args) {
		
   Demo obj=new Demo();
   System.out.println(obj.a);
   
   System.out.println(obj.e=100);
   
   
   
   
   
   
	}

}
