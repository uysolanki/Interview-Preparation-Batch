package day8;

public class MyNewEmployee extends MyEmployee
{

	@Override
	public void calculateTotalIncome() {
		double totalIncome=this.sal+this.commision;
	}

}
