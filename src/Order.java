public class Order {
    private User userForOrdering;
    private CreditCard creditCardForOrdering;
    private Product productForOrdering;
    private int mountForOrdering;

    //Constructors
    Order(User orderingUser, CreditCard orderingCreditCard, Product orderingProduct, int mountOfOrder) {
        this.userForOrdering = orderingUser;
        this.creditCardForOrdering = orderingCreditCard;
        this.productForOrdering = orderingProduct;
        this.mountForOrdering = mountOfOrder;
    }

    //Getter and Setters
    public Product getProductForOrdering() {

        return this.productForOrdering;
    }

    //Methods
    public boolean stockInfo() {
        int remainingStock = productForOrdering.getProductStockInfo() - mountForOrdering;
        return (remainingStock >= 0);
    }
}





