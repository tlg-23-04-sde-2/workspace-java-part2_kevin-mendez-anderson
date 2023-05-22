package gov.irs;

public interface IRS {
    public void collectTaxes();
    public void register(TaxPayer payer);

    //Static factory method for clients to obain the sole instance of IRSEnum
    public static IRS getInstance(){
        return IRSEnum.INSTANCE;
    }
}
