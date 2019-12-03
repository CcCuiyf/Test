package level2;
public class SalaryIncome extends  Income{
    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
    public SalaryIncome(double income){
        super(income);
    }
	// TODO

}
