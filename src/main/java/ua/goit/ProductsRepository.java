package ua.goit;

public class ProductsRepository {

    // Should we be able to change the data for any reason or only get the information?
    // It's always better to do the fields private with accessor methods
    public Product a = new Product("A", 1.25, 3, 3.00);
    public Product b = new Product("B", 4.25);
    public Product c = new Product("C", 1.00, 6, 5.00);
    public Product d = new Product("D", 0.75);
}
