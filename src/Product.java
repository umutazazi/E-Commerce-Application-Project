public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStockInfo;
    private int productWeight;
    private String productDescriptionInfo;

    //Constructors
    public Product(String productName, String productColor, String productCategory, int productStockInfo, int productWeight, String productDescriptionInfo) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInfo = productStockInfo;
        this.productWeight = productWeight;
        this.productDescriptionInfo = productDescriptionInfo;
    }

    //Methods
    public void reduceStock(int mountOfProduct) {

        this.productStockInfo -= mountOfProduct;
        System.out.println("From " + this.productName + "\t" + this.productStockInfo + " is Left");

    }

    //Getter and Setter
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockInfo() {
        return productStockInfo;
    }

    public void setProductStockInfo(int productStockInfo) {
        this.productStockInfo = productStockInfo;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescriptionInfo() {
        return productDescriptionInfo;
    }

    public void setProductDescriptionInfo(String productDescriptionInfo) {
        this.productDescriptionInfo = productDescriptionInfo;
    }
}
