package ua.goit;

public class App {

    public static void main(String[] args) {
        CalculateCost price = new CalculateCost();
        price.printSum(price.calculateTotalCost("ABCDABA"));
    }
}
