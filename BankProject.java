import java.util.*;
class BankProject {
	public static String bankName = "MY BANK";
	public String name,Address,city;
	public double balance;
	BankProject(String name)
	{
		this.name = name;
	}
	public void deposit(double amount)
	{
		this.balance = this.balance+amount;
		System.out.println("After Deposit Balance is : "+this.balance);
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient Amount.......");
			System.exit(0);
		}
		else
		{
			this.balance = this.balance-amount;
			System.out.println("After Withdraw the Balnce is : "+this.balance);
		}
	}
	public static void main(String[] args) {
		System.out.println("*********************WELCOME TO MY BANK*************************************");
		System.out.println("Anil Kumar Edited here");
		System.out.println("Welcome TO "+BankProject.bankName);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		System.out.println("Enter your Address : ");
		String addss = sc.next();
		System.out.println("Enter City of customer : ");
		String cty = sc.next();
		BankProject c1 = new BankProject(name);
		System.out.println("CONGRATULATIONS "+ c1.name+" Your Account Created");
		System.out.println("\n\n");
		while(true)
		{
			System.out.println("*********************WELCOME TO MY BANK*************************************");
			System.out.println("Choose Your option to perform");
			System.out.println("\n\t\t\tD-Deposit");
			System.out.println("\n\t\t\tW-WithDraw");
			System.out.println("\n\t\t\tE-Exit");
			String option = sc.next();
			if(option.equalsIgnoreCase("D"))
			{
				System.out.println("Enter Amount : ");
				double amount = sc.nextDouble();
				c1.deposit(amount);
			}
			else if(option.equalsIgnoreCase("W"))
			{
				System.out.println("Enter Amount To WithDraw : ");
				double amount = sc.nextDouble();
				c1.withdraw(amount);
			}
			else if(option.equalsIgnoreCase("E"))
			{
				System.out.println("Thanks For banking");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Option...");
			}
			
		}
		

	}

}
