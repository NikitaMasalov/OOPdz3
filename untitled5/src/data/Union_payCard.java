package data;

public class Union_payCard extends Card{
    public Union_payCard() {
        super(PaymentSystem.UNION_PAY);
    }



    protected boolean isCountryValidForTheseCard(Country country) {
        if  (country == Country.CN){
            return true;
        }else {
            return false;
        }
    }
}
