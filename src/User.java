import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;


public class User {

    private String username;
    private String name;
    private String surname;
    private String birthday;
    private String password;
    private String email;
    private String homeAdress;
    private String workAdress;
    private ArrayList<Order> productOrdered = new ArrayList<Order>();
    private ArrayList<Product> favProduct = new ArrayList<Product>();
    private ArrayList<CreditCard> creditCard = new ArrayList<CreditCard>();

//Constructors

    public User(String username, String name, String surname, String birthday, String password, String email, String homeAdress, String workAdress, ArrayList<CreditCard> creditCard) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
        this.creditCard = creditCard;
    }

    public User(String username, String name, String surname, String birthday, String password, String email, String homeAdress, String workAdress, ArrayList<CreditCard> creditCard, ArrayList<Order> productOrdered, ArrayList<Product> favProduct) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
        this.creditCard = creditCard;
        this.productOrdered = productOrdered;
        this.favProduct = favProduct;
    }


    public User(String username, String name, String surname, String birthday, String password, String email, String homeAdress, String workAdress, CreditCard creditCard) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
        this.creditCard.add(creditCard);
    }


    //Methods
    public void orderProduct(Product product, CreditCard creditCard, int mountOfProduct) {
        Order order = new Order(this, creditCard, product, mountOfProduct);
        if (order.stockInfo()) {
            this.productOrdered.add(order);
            product.reduceStock(mountOfProduct);
        } else {
            System.out.println("Your mount is stock off ");
        }

    }

    public void addToFav(Product product) {
        this.favProduct.add(product);
    }

    //Getter and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }
}
