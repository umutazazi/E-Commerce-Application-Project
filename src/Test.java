public class Test {

    /* Umut AZAZİ

       190315071

     */
    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard(3456000, "Umut", 314, "12.02.23");
        CreditCard cc2 = new CreditCard(2345000, "John", 456, "03.02.25");
        CreditCard cc3 = new CreditCard(1234566, "Umut", 543, "12.02.23");
        User user1 = new User("umtazazi", "Umut", "Azazi", "19.02.2000", "12345uuu", "umutazazi3@gmail.com", "Erzene mah..", "Erzene mah", cc1);
        User user2 = new User("johnwick", "John", "Anderson", "20.09.2002", "whokilledmydog1243", "wickjohn@gmail.com", "Usa NYC", "NYC Street 15", cc2);

        Product product1 = new Product("Nvidia 2080Ti", "Grey", "Graphic Card", 30, 1000, "New Factory");
        Product product2 = new Product("Rampage Screen", "Black", "IPS Screen", 20, 1500, "New Factory");
        Product product3 = new Product("James Donkey SSD", "Yellow", "SSD", 40, 100, "New Factory");
        Product product4 = new Product("Intel Core i7", "Black", "CPU", 200, 50, "New Factory");

        Product product5 = new Product("7.62", "Gold", "Bullet", 500, 50, "New Factory");
        Product product6 = new Product("Deagle", "Silver", "Gun", 30, 1300, "New Factory");

        user1.orderProduct(product1, cc3, 1);
        user1.orderProduct(product2, cc1, 1);
        user1.orderProduct(product3, cc1, 3);
        user1.orderProduct(product4, cc3, 3);

        user2.orderProduct(product5, cc2, 1000);
        user2.orderProduct(product6, cc2, 25);
        user2.addToFav(product5);

    }

}

