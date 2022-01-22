package ogunodev;

public class PreferredCustomer extends Customer{
    /*
   When a preferred customer spends $500, he or she gets a 5 percent discount on all
future purchases.
When a preferred customer spends $1,000, he or she gets a 6 percent discount on all
future purchases.
When a preferred customer spends $1,500, he or she gets a 7 percent discount on all
future purchases.
When a preferred customer spends $2,000 or more, he or she gets a 10 percent discount
on all future purchases.
Design a class named PreferredCustomer, which extends the Customer class you created
in Challenge 1. The PreferredCustomer class should have fields for the
amount of the customer's purchases and the customer's discount level. Write one or more
constructors and the appropriate mutator and accessor methods for the class's fields. Dem-
onstrate the class in a single program.

     */
    private double purchase;
    private double discountLevel;


    public PreferredCustomer(String name, String address, long telephone, long customerNumber, boolean mailingList, double purchase) {
        super(name, address, telephone, customerNumber, mailingList);
        this.purchase = purchase;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public double getDiscountLevel() {
        if(purchase>=500 && purchase<1000){
            setDiscountLevel(5);
        }
        else if(purchase>=1000 && purchase<1500){
            setDiscountLevel(6);
        }
        else if(purchase>=1500 && purchase<2000){
            setDiscountLevel(7);
        }
        else if (purchase>=2000){
            setDiscountLevel(10);
        }
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    public double total(){
        return purchase=purchase-(purchase*discountLevel/100);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPreferred Customer" +
                "\npurchase=" + purchase +
                "\ndiscountLevel=" + getDiscountLevel()+
                "\ntotal including discount: "+total();
    }
}
