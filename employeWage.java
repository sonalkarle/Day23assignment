public class employeWage
{
	//Compute employee wages for multiple companies
	//constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static void computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
	//variables
	
		int empHrs=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
	//computation
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()* 10) %3;
			switch(empCheck)
			{
				case IS_FULL_TIME:
				empHrs=8;
				break;
				case IS_PART_TIME:
				empHrs=4;
				break;
				default:
				empHrs=0;
				break;
			}
		totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays + " EmpHr: " +empHrs);
		}
	int totalEmpWage = totalEmpHrs * empRatePerHour;
	System.out.println("Total emp wage for company: " +company+"is: "+totalEmpWage );

	}
	public static void main(String[] args)
	{
	computeEmpWage("Dmart",20,26,10);
	computeEmpWage("Reliance",20,25,40);
	}

}
