import java.util.Scanner;
public class Mid
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		double exceeding;
		double annualTax = 0.0;
		int annualIncome;
		while (true)
		{
			
			System.out.println("Enter Monthly Salary ( 0 to exit ) : ");
			int monthlySalary = input.nextInt();

			if ( monthlySalary == 0 )
			{
				System.out.println("Program Terminated...");
				return;
			}
			else
			{
				
				annualIncome = monthlySalary * 12;
				if ( annualIncome <= 600000 )
				{
					annualTax = 0.0;
					
				}
				else if ( annualIncome > 600000 && annualIncome <= 1200000 )
				{
					exceeding = annualIncome - 600000;
					annualTax = 0.01 * exceeding;
					
				}
				else if ( annualIncome > 1200000 && annualIncome <= 2200000 )
				{
					exceeding = annualIncome - 1200000;	
					annualTax = 6000 + (exceeding * 0.11);
					
				}
				else if ( annualIncome > 2200000 && annualIncome <= 3200000 )
				{
					exceeding = annualIncome - 2200000;
					annualTax = 116000 + (exceeding * 0.23);
					
				}
				else if ( annualIncome > 3200000 && annualIncome <= 4100000 )
				{
					exceeding = annualIncome - 3200000;
					annualTax = 346000 + (exceeding * 0.3);
					
				}
				else if ( annualIncome > 4100000 )
				{
					exceeding = annualIncome - 4100000;
					annualTax = 616000 + (exceeding * 0.35);
				}
				
				double monthlyTax = annualTax / 12;
				double net = monthlySalary - monthlyTax;
				System.out.println("Annual Income: " + annualIncome);
				System.out.println("Annual Tax: " + annualTax);	
				System.out.println("Monthly Tax Deduction: " + monthlyTax);
				System.out.println("Net Monthly Salary After Tax: " + net);
			}
		}
	}
}
			
			
			
		

	

		

		