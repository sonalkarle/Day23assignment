import java.util.ArrayList;
class companyEmpWage
{
        //instance variables  
        public String company;
        public int wage_per_hr;
        public int workday_in_months;
        public int max_working_hrs;
        public int totalSalary;

       // constructor
        public companyEmpWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
                this.company= company;
                this.wage_per_hr= wage_per_hr;
                this.workday_in_months= workday_in_months;
                this.max_working_hrs= max_working_hrs;            
        }
        
        public void setTotalSalary(int totalSalary)
        {
                this.totalSalary=totalSalary;
        }
        public String toString() //to return desire output 
        {
              return "Total employee wage for: " +company+ " is " +totalSalary;
        }
        	
}
//implementing interface
public class employeWage
{
        public static final int isFullTime=1;
        public static final int isPartTime=2;   
        public ArrayList<companyEmpWage> companyEmpWageArray;//created arraylist
        public employeWage()
        {
                companyEmpWageArray=new ArrayList<>();
        }
        //Adding companies in arrays
        public void addCompanyEmpWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
                companyEmpWage companylist=new companyEmpWage(company, wage_per_hr, workday_in_months, max_working_hrs);
                companyEmpWageArray.add(companylist);
        }
        //calling computewage function and calculating empwage for every index
        public void computeEmpWage()
        {
                for(int i=0;i<companyEmpWageArray.size();i++)
                {
                        companyEmpWage companylist=companyEmpWageArray.get(i);//created object and getting companies with index position.
                        companylist.setTotalSalary(this.computeWage(companylist));
                        System.out.println(companylist);
                }
        }

        //function to calculate salary for  employee
        private int computeWage(companyEmpWage companylist)
        {
                //local variables
                int empHrs=0;
                int totalempHrs=0;
                int totalworkingdays=0;

                //loop 
                while(totalempHrs<=companylist.max_working_hrs && totalworkingdays<=companylist.workday_in_months)
                {
                        //switch case 
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
                    //Calculating total salary of employee
                        int totalSalary= totalempHrs*companylist.wage_per_hr; 
                        return totalSalary;
        }

        //main method
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program in Main branch");
                employeWage ob=new employeWage();//created object for empWage class
                ob.addCompanyEmpWage("Realiance",50,35,25);
                ob.addCompanyEmpWage("TCS",40,25,18);
                
                ob.computeEmpWage();//calling fucntion with the object
        }
}
