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

                //loop 
                while(totalempHrs<=emp.max_working_hrs && totalworkingdays<=emp.workday_in_months)
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
                        int TotalSalary= totalempHrs*emp.wage_per_hr; //Calculating total salary of employee
		
			//printing totalsalary of different companies employee
                        System.out.println( "Total Employee Salary of " + emp.company +" is " + TotalSalary);
        }

        //main method
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program in Main branch");
		employeWage ob=new employeWage();//created object for empWage class
                ob.addCompanyEmpWage("Realiance",70,35,25);//calling funtion with the object
                ob.addCompanyEmpWage("TCS",40,25,18);//calling function with the object
                
		ob.computeEmpWage();
}
}


