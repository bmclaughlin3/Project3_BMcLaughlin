package comp.comp152;

import java.util.ArrayList;

public class ResidentialCustomer extends Customer{
    /**
     * @param custName
     */
    public ResidentialCustomer(String custName) {
        super(custName);
    }

    @Override
    public double payForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        return 0;
    }
}

//do taxes
