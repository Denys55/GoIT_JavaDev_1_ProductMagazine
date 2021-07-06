package ProductInShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    Product product = new Product("A", 1.25, 3, 3.0);
    private static final double EPSILON = 0.000001D;


    //if product have count for just sale price
    @Test
    public void testGetPriceByCountInSale(){
        long count = 3;
        double actual = 3.0D;
        double expected = product.getPriceByCount(count);
        assertEquals(expected, actual, EPSILON);
    }

    //if product have count for just regular price
    @Test
    public void testGetPriceByCountRegular(){
        long count = 2;
        double actual = 2.5D;
        double expected = product.getPriceByCount(count);
        assertEquals(expected, actual, EPSILON);
    }

    //if product have count for sale and regular price
    @Test
    public void testGetPriceByCountSaleAndRegular(){
        long count = 4;
        double actual = 4.25D;
        double expected = product.getPriceByCount(count);
        assertEquals(expected, actual, EPSILON);
    }

}