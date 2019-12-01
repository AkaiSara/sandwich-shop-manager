////////////////////////////////////////////////////////////////////
// [Sara] [Righetto] [1174009]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class TakeAwayManager implements TakeAwayBill{
    public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException {
        double total = 0.0;
        return total;
    }
}