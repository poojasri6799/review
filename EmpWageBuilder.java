public class EmpWageBuilder
{
	public static void main(String[] args)
	{
		int Is_FULL_TIME=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck== Is_FULL_TIME)
		 {
	    	System.out.println("Employee is present");
	    }
  	    else
			System.out.println("Employee is absent");
	}
}
