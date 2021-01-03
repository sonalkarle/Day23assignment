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
		

	}
}
