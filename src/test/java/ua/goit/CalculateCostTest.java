package ua.goit;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class CalculateCostTest {

    CalculateCost calculateCost = new CalculateCost();
    // The general idea of unit tests is isolation. If the class named CalculateCostTest we should test only
    // CalculateCost methods. All dependencies like ProductsRepository we should "mock" with Mockito framework
    // using when().thenReturn() methods - Fixed.

    @Test
    void testEmptyBasket() {
        assertEquals(0.0, calculateCost.calculateTotalCost(""));
    }

    @Test
        // Good job! We should test not only "happy path" but all possible ways
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
        ProductsRepository productsRepositoryMock = mock(ProductsRepository.class);
        Mockito.when(productsRepositoryMock.getA()).thenReturn(new Product("A", 1.25, 3, 3.00));
        double sum = 0.0;

        for (int quantityA = 0; quantityA < 3; quantityA++) {
            sum = calculateCost.calculatePromPrice(productsRepositoryMock.getA(), quantityA, sum);
        }

        double actual = sum;
        double expected = 3.0;

        assertEquals(expected, actual);
    }
}