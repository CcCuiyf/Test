package level2;

public class Main {

	public static void main(String[] args) {
		// TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new OtherIncome(3000), new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		total=incomes[0].getTax()+incomes[1].getTax()+incomes[2].getTax();
		System.out.println(total);
	}

}
