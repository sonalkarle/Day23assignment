
public class employeWage
{
	//Calculate daily wage for fulltime and partime empoyee using switch case statement 
	//constant
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_RATE_PER_HR=20;


        public static void main(String[] args)
        {
                //variable
                int empHr=0;
                int salary=0;
                //Computation
                int empCheck=(int)Math.floor(Math.random()*10)%3;
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
                System.out.println("Salary is "+salary);
        }
}


