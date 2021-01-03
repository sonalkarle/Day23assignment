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

	}
}
