<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6_Tillreachedend_UC6
public class employeWage
{
	//Refactor the code for calculating monthly wage of fulltime & parttime employee
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_RATE_PER_HR=20;
        public static final int NUM_OF_WORKINGDAYS=2;
        public static final int MAX_HRS_IN_MONTH=10;

        public static int computrEmpWage()
        {
		//variabls
                int empHr=0;
                int totalEmpHr=0;
                int totalWorkingDays=0;
		//computation
                while (totalEmpHr<=MAX_HRS_IN_MONTH && totalWorkingDays<=NUM_OF_WORKINGDAYS)
                {
                        totalWorkingDays++;
                        int empCheck=(int) Math.floor(Math.random()*10)%3;
                        switch (empCheck)
                        {
                        case FULL_TIME:
                        System.out.println("Employee is fulltime");
                        empHr=8;
                        break;
                        case PART_TIME:
                        System.out.println("Employee is parttime");
                        empHr=4;
                        break;
                        default:
                        System.out.println("Employee is absent");
                        empHr=0;
                        }
                totalEmpHr += empHr;

                }
                int totalsalary = totalEmpHr * EMP_RATE_PER_HR;
                System.out.println("Total salary: "+totalsalary);
		return totalsalary;

        }
	public static void main(String[] args)
	{
	computrEmpWage();

<<<<<<< HEAD
				
<<<<<<< HEAD
=======
class employeeWage
{
	//Check employee is present or not
	public static void main(String[] args)
	{
		//constant
                int isPresent=1;
		//computation
                int res=(int)(Math.random()*10)%2;
                if(res==isPresent)
                {
                        System.out.println("Employee is present");
=======
class employeeWage
{
	//Check employee present or not and if present calculate its daily wage
	public static void main(String[] args)
	{
		//variables
                int isPresent=1;
                int empRatePerHr=20;
                int salary=0;
                int empHr=0;
		//computation
                int res=(int)(Math.random()*10)%2;
                //condition
		if(res==isPresent)
                {
                        System.out.println("Employee is present");
                        empHr=8;
>>>>>>> 2_DailyemployeeWage_UC2
                }
                else
                {
                        System.out.println("Employee is absent");
<<<<<<< HEAD
                }

>>>>>>> 1_Emppresentorabsent_UC1
=======
                        empHr=0;
                }
		//final answer
                salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);		


>>>>>>> 2_DailyemployeeWage_UC2
=======
class employeeWage
{
	//Add part time employee and add its daily wage
	public static void main(String[] args)
	{
		
	
		//variables
                int isfulltime=1;
                int isparttime=2;
                int empRatePerHr=20;
                int empHr=0;
                int salary=0;
		//computation
                int res=(int)(Math.random()*10)%3;
		//condition
                if(res==isfulltime)
                {
                        System.out.println("Employee is fulltime");
                        empHr=8;
                }
                else if(res==isparttime)
                {
                        System.out.println("Employee is Parttime");
                        empHr=4;
                }
		

>>>>>>> 3_AddPartTime_UC3
=======
>>>>>>> 6_Tillreachedend_UC6
=======
>>>>>>> 7_Refactorcode_UC7
	}
=======

public class employeWage
{
	//Calculate daily wage for fulltime and partime empoyee using switch case statement 
	//constant
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_RATE_PER_HR=20;

=======
public class employeWage
{
	//Calculating fulltime & parttime employee monthly wages using switch case
     	//constant
	public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_RATE_PER_HR=20;
	public static final int NO_OF_WORKINGDAYS=2;
>>>>>>> 5_WagesforMonth_UC5

        public static void main(String[] args)
        {
                //variable
                int empHr=0;
                int salary=0;
<<<<<<< HEAD
                //Computation
                int empCheck=(int)Math.floor(Math.random()*10)%3;
=======
		int totalsalary=0;
                //Computation
                int empCheck=(int)Math.floor(Math.random()*10)%3;
		//loop
		for(int day=0; day< NO_OF_WORKINGDAYS; day++)
                {
>>>>>>> 5_WagesforMonth_UC5
		//condition
                switch (empCheck) {

                        case FULL_TIME:
                        System.out.println("Employee is fulltime");
                        empHr=8;
                        break;
			 case PART_TIME:
                        System.out.println("Employee is parttime");
                        empHr=4;
                        break;
                        default:
                        System.out.println("Employee is absent");
                        empHr=0;

                }
                salary=(empHr*EMP_RATE_PER_HR);
<<<<<<< HEAD
                System.out.println("Salary is "+salary);
        }
>>>>>>> 4_UsingSwitchcase_UC4
}

=======
		totalsalary+=salary;


                System.out.println("Salary is "+salary);
}
		 System.out.println("Totalsalary is "+totalsalary);

        }
=======
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

>>>>>>> 8_Computeemployeewage_UC8
}
>>>>>>> 5_WagesforMonth_UC5

