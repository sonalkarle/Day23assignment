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
                }
                else
                {
                        System.out.println("Employee is absent");
                        empHr=0;
                }
		//final answer
                salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);		


	}
}
