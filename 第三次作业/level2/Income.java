package level2;
/**
 * 定义抽象类Income
 */
public abstract class Income {

	// TODO
    public double income;
    public Income(double income){
        this.income=income;
    }
    public abstract double getTax();
}
class OtherIncome extends Income{

    public OtherIncome(double income){super(income);}
    @Override
    public double getTax(){
        return income*0.1;
    }
}

