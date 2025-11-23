package theater;

import java.util.List;

/**
 * Class representing an invoice for a customer.
 */
public class Invoice {

    private final String customer;
    private final List<Performance> performances;

    /**
     * Creates a new invoice.
     * @param customer the customer name
     * @param performances the list of performances
     */
    public Invoice(final String customer, final List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    /**
     * Gets the customer name.
     * @return the customer name
     */
    public String getCustomer() {
        return this.customer;
    }

    /**
     * Gets the list of performances.
     * @return the performances
     */
    public List<Performance> getPerformances() {
        return this.performances;
    }
}
