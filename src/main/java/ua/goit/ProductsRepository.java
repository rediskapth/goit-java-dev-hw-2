package ua.goit;

public class ProductsRepository {

    // Should we be able to change the data for any reason or only get the information? - Only get. Fixed.
    // It's always better to do the fields private with accessor methods - Fixed.
    private final Product A = new Product("A", 1.25, 3, 3.00);
    private final Product B = new Product("B", 4.25);
    private final Product C = new Product("C", 1.00, 6, 5.00);
    private final Product D = new Product("D", 0.75);

    public Product getA() {
        return A;
    }

    public Product getB() {
        return B;
    }

    public Product getC() {
        return C;
    }

    public Product getD() {
        return D;
    }
}
