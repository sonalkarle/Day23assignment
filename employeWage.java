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
                }
                else
                {
                        System.out.println("Employee is absent");
                }

	}
}
