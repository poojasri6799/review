public class EmpWageBuilderUC1
{
	public static void main(String[] args)
	{
	final int Is_FULL_TIME=1;
	final int EMP_RATE_PER_HR=20;
	int empHrs=0;
	int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck== Is_FULL_TIME)
		 {
	      		empHrs=8;
	         }
  	    else
		{
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("employee wage "+empWage);
	}
}
