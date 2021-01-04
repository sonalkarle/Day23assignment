<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
class empWage
{
	//calculating total wages for each company
        //instance variables
        public static final int isFullTime=1;
        public static final int isPartTime=2;
	public String company;
	public int wage_per_hr;
	public int workday_in_months;
	public int max_working_hrs;

        //constructor
        public empWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
		this.company= company;
		this.wage_per_hr= wage_per_hr;
		this.workday_in_months= workday_in_months;
		this.max_working_hrs= max_working_hrs;
	}

	//function to calculate salary for  employee
	public void computeWage()
	{
		//local variables
		int empHrs=0;
		int totalempHrs=0;
		int totalworkingdays=0;

                //loop 
                while(totalempHrs<=max_working_hrs && totalworkingdays<=workday_in_months)
                {
                        //condition
                        int empCheck=(int)(Math.floor(Math.random()*10)%3);
                        switch(empCheck)
                        {
                                case 1:
                                        empHrs=8;
                                        break;
                                case 2:
                                        empHrs=4;
                                        break;
                                default:
                                        empHrs=0;
                                        break;
                        }
                        //adding hours in total hours as totalemp hours is 0
                        totalempHrs=totalempHrs+empHrs;
                        totalworkingdays++; 
                }
                        int TotalSalary= totalempHrs*wage_per_hr; //Calculating total salary of employee
		
			
                        System.out.println( "Total Employee Salary of " + company +" is " + TotalSalary);
        }
        //main method
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program in Main branch");
		empWage Realiance=new empWage("Realiance",30,50,120);// created object and initializes argument to it
		empWage tcs=new empWage("TCS",40,70,100);//created object and initializes the argument to the constructor
		

                Realiance.computeWage();//calling funtion with the object
                tcs.computeWage();//calling function with the object
                
>>>>>>> 9_Totalwageformonth_UC9
	}

>>>>>>> 8_Computeemployeewage_UC8
}
>>>>>>> 5_WagesforMonth_UC5
=======
class companyEmpWage
{
	//Ability to manage employee wages for mutiple company
        //instance variables
        public static final int isFullTime=1;
        public static final int isPartTime=2;
	public String company;
	public int wage_per_hr;
	public int workday_in_months;
	public int max_working_hrs;

        //constructor
        public companyEmpWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
		this.company= company;
		this.wage_per_hr= wage_per_hr;
		this.workday_in_months= workday_in_months;
		this.max_working_hrs= max_working_hrs;
	}
}	
public class employeWage
{
	public static final int isFullTime=1;
        public static final int isPartTime=2;
	private int num_of_company=0;
	private companyEmpWage[] companyEmpWageArray;
	
	public employeWage()//default construcor
	{
		companyEmpWageArray=new companyEmpWage[4];
	}
	
	private void addCompanyEmpWage(String company,int wage_per_hr, int workday_in_months,int max_working_hrs)
	{
		companyEmpWageArray[num_of_company]=new companyEmpWage(company,wage_per_hr,workday_in_months,max_working_hrs);
		num_of_company++;
	}
	//calling computewage function and calculating empwage for every index
	public void computeEmpWage()
	{
		for(int i=0;i<num_of_company;i++)
		{
			computeWage(companyEmpWageArray[i]);
		}
	}

	//function to calculate salary for  employee
	public void computeWage(companyEmpWage emp)
	{
		//local variables
		int empHrs=0;
		int totalempHrs=0;
		int totalworkingdays=0;
=======
interface companyEmployeewage
{
        public void addCompanyEmpWage(String company,int wage_per_hr, int workday_in_months,int max_working_hrs);
        public void computeEmpWage();
} //created interface and it means all the functions are abstract but not needed to mentioned

class companyEmpWage 
{
        //instance variables
        public static final int isFullTime=1;
        public static final int isPartTime=2;
        public String company;
        public int wage_per_hr;
        public int workday_in_months;
        public int max_working_hrs;

        //constructor
        public companyEmpWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
                this.company= company;
                this.wage_per_hr= wage_per_hr;
                this.workday_in_months= workday_in_months;
                this.max_working_hrs= max_working_hrs;
        }
}
	//implementing interface
public class employeWage implements companyEmployeewage
{
        public static final int isFullTime=1;
        public static final int isPartTime=2;

        private int num_of_company=0;
        private companyEmpWage[] companyEmpWageArray;

        public employeWage()
        {
                companyEmpWageArray=new companyEmpWage[4];
        }

        //Adding companies in arrays
        public void addCompanyEmpWage(String company,int wage_per_hr, int workday_in_months,int max_working_hrs)
        {
                companyEmpWageArray[num_of_company]=new companyEmpWage(company,wage_per_hr,workday_in_months,max_working_hrs);
                num_of_company++;
        }

        //calling computewage function and calculating empwage for every index
        public void computeEmpWage()
        {
                for(int i=0;i<num_of_company;i++)
                {
                        computeWage(companyEmpWageArray[i]);
                }
        }

        //function to calculate salary for  employee
        public void computeWage(companyEmpWage emp)
        {
                //local variables
                int empHrs=0;
                int totalempHrs=0;
                int totalworkingdays=0;
>>>>>>> 11_UsingInterfaceapproch_UC11

                //loop 
                while(totalempHrs<=emp.max_working_hrs && totalworkingdays<=emp.workday_in_months)
                {
<<<<<<< HEAD
                        //condition
=======
                        //switch case 
>>>>>>> 11_UsingInterfaceapproch_UC11
                        int empCheck=(int)(Math.floor(Math.random()*10)%3);
                        switch(empCheck)
                        {
                                case 1:
                                        empHrs=8;
                                        break;
                                case 2:
                                        empHrs=4;
                                        break;
                                default:
                                        empHrs=0;
                                        break;
                        }
                        //adding hours in total hours as totalemp hours is 0
                        totalempHrs=totalempHrs+empHrs;
                        totalworkingdays++; 
                }
                        int TotalSalary= totalempHrs*emp.wage_per_hr; //Calculating total salary of employee
<<<<<<< HEAD
		
			//printing totalsalary of different companies employee
=======

                        //printing totalsalary of different companies employee
>>>>>>> 11_UsingInterfaceapproch_UC11
                        System.out.println( "Total Employee Salary of " + emp.company +" is " + TotalSalary);
        }

        //main method
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program in Main branch");
<<<<<<< HEAD
		employeWage ob=new employeWage();//created object for empWage class
                ob.addCompanyEmpWage("Realiance",70,35,25);//calling funtion with the object
                ob.addCompanyEmpWage("TCS",40,25,18);//calling function with the object
                
		ob.computeEmpWage();
}
}

>>>>>>> 10_manageempWageformulticompany_UC10

=======
                employeWage ob=new employeWage();//created object for empWage class
                ob.addCompanyEmpWage("Realiance",80,65,85);
                ob.addCompanyEmpWage("TCS",40,25,18);
                
                ob.computeEmpWage();
        }
}

>>>>>>> 11_UsingInterfaceapproch_UC11
