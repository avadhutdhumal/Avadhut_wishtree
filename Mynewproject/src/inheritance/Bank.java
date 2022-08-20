package inheritance;

public class Bank {

		private String bankname;
		private String bankaddress;
		private int banknumber;
		private Employee e;
		
		public void setbankname(String bankname)
		{
			this.bankname=bankname;
		}
		
		public String getbankname()
		{
			return bankname;
		}
		
		public void setbankaddress(String bankaddress)
		{
			this.bankaddress=bankaddress;
		}
		
		public String getbankaddress()
		{
			return bankaddress;
		}
		
		public void setbanknumber(int banknumber)
		{
			this.banknumber=banknumber;
		}
		
		public int getbanknumber()
		{
			return banknumber;
		}
		
		public void setEmployee(Employee e)
		{
			this.e=e;
		}
		
		public Employee getEmployee()
		{
			return e;
		}
		
	}

