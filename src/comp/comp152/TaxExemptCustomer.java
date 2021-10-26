package comp.comp152;

import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{

    public TaxExemptCustomer(String Name, int ID) {
        super(Name, ID);
    }

    public void arrangeDelivery(){
        System.out.println("customer name:" + getName() + ", deliver anytime");
    }

    @Override
    public double payForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        System.out.println("This order is for " +getName() + " and will be paid for with a purchase order");
        double total  = 0.0;
        for (int i =0; i < itemsInOrder.size(); i++){
            total +=itemsInOrder.get(i).getPrice();
        }
        return total;
    }
}

