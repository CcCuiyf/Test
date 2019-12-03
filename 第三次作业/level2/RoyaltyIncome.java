package level2;
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends  Income{
    @Override
    public double getTax(){
        return income*0.2;
    }
    public RoyaltyIncome(double income){
        super(income);
    }
	// TODO


}
