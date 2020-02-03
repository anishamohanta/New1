
public class GetValue
{
	  public int basicSal= 3000;
  public static void main(String[] args) 
  {
  
    GetValue g=new GetValue();
    
	  
	Example e1=new Example();
	e1.display();
	System.out.println(e1.empName);
	System.out.println(e1.empNo);
	System.out.println(e1.city);
	System.out.println(e1.phoneNo);
	System.out.println("salary is:"+g.basicSal);
	
   }
}

