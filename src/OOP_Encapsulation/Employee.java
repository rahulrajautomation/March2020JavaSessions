package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private int salary;
	
	

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void getAddress()
	{
		System.out.println("employee address");
	}
		private void getaccount()
		{
			System.out.println("BankAccountDetails");
		}
		public int getSalary()
		{
			return salary;
		}
		public void getemployeebankdata(){
			getaccount();
		}

	

}
