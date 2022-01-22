package ogunodev;

public class Customer extends Person {
   /*
Next, design a class named Customer, which extends the Person class. The Customer class
should have a field for a customer number and a boolean field indicating whether the
customer wishes to be on a mailing list. Write one or more constructors and the appropriate
mutator and accessor methods for the class's fields. Demonstrate an object of the Customer
class in a simple program.

A retail store has a preferred customer plan where customers can earn discounts on all their
purchases. The amount of a customer's discount is determined by the amount of the cus-
tomer's cumulative purchases in the store as follows:
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

    private long CustomerNumber;
    boolean MailingList = true;

    public Customer(String name, String address, long telephone, long customerNumber, boolean mailingList) {
        super(name, address, telephone);
        CustomerNumber = customerNumber;
        MailingList = mailingList;
    }

    public long getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        CustomerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return MailingList;
    }

    public void setMailingList(boolean mailingList) {
        MailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" +
                "\nCustomerNumber=" + CustomerNumber +
                "\nMailingList=" + MailingList ;
    }
}