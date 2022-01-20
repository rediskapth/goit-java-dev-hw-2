package ua.goit;

public class CalculateCost {

    public double calculateTotalCost(String basket) {

        ProductsRepository products = new ProductsRepository();

        double sum = 0;

        if (basket.isEmpty()) {
            System.out.println("Enter products for price calculation");
        } else {
            String[] productBasket = basket.toLowerCase().split("");
            int aQuantity = 0;
            int cQuantity = 0;
            for (String prod : productBasket) {
                switch (prod) {
                    case "a" -> {
                        aQuantity++;
                        sum = calculatePromPrice(products.getA(), aQuantity, sum);
                    }
                    case "b" -> sum += products.getB().getPrice();
                    case "c" -> {
                        cQuantity++;
                        sum = calculatePromPrice(products.getC(), cQuantity, sum);
                    }
                    case "d" -> sum += products.getD().getPrice();
                    default -> System.out.println("Enter correct product. Product '" + prod.toUpperCase() + "' is absent in store.");
                }
            }
        }
        return sum;
    }

    public double calculatePromPrice(Product product, int quantity, double sum) {
        if (quantity % product.getPromQuantity() == 0) {
            sum = sum - (product.getPromQuantity() - 1) * product.getPrice() + product.getPromPrice();
        } else {
            sum += product.getPrice();
        }
        return sum;
    }

    public void printSum(double sum) {
        System.out.println("Price of basket - " + sum);
    }
}
