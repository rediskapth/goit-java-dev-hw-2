package ua.goit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateCostTest {

    CalculateCost calculateCost = new CalculateCost();
    ProductsRepository productsRepository = new ProductsRepository();

    @Test
    void testEmptyBasket() {
        assertEquals(0.0, calculateCost.calculateTotalCost(""));
    }

    @Test
    void testIncorrectEnterValue() {
        double actual = calculateCost.calculateTotalCost("12YT");
        double expected = 0.0;

        assertEquals(expected, actual);
    }

    @Test
    void testCalculationOfBasket() {
        double actual = calculateCost.calculateTotalCost("ABCD");
        double expected = 7.25;

        assertEquals(expected, actual);
    }

    @Test
    void testCalculationOfBasketWithCorrectAndNotCorrectValues() {
        double actual = calculateCost.calculateTotalCost("ABCDEEED");
        double expected = 8.0;

        assertEquals(expected, actual);
    }

    @Test
    void testCalculatePromPriceForProductA() {
        double sum = 0.0;
        for (int quantityA = 0; quantityA < 3; quantityA++) {
            sum = calculateCost.calculatePromPrice(productsRepository.a, quantityA, sum);
        }

        double actual = sum;
        double expected = 3.0;

        assertEquals(expected, actual);
    }
}