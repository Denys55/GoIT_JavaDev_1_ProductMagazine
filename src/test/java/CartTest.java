import ProductInShop.Product;
import org.junit.Before;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CartTest {

    private static Map<String, Product> products = new HashMap<>();
    Cart cart = new Cart();
    private static final double EPSILON = 0.000001D;

    @Before
    public void initializationProducts(){
    products.put("A", new Product("A", 1.25, 3, 3.0));
    products.put("B", new Product("B", 4.25));
    products.put("C", new Product("C", 1.00, 6, 5.0));
    products.put("D", new Product("D", 0.75));}


    //checking the calculation of the total value of the basket without discounts
    @Test
    public void testCalculateTotalCostRegular(){
        double actual = 1.25D + 4.25D + 1.00 + 0.75D;
        double expected = cart.calculateTotalCost("ABCD");
        assertEquals(expected, actual, EPSILON);
    }

    //checking the count of the basket with the discounted quantity of item A
    @Test
    public void testCalculateTotalCostRegularAndSale(){
        double actual = 3.0D + 4.25D + 1.00 + 0.75D;
        double expected = cart.calculateTotalCost("AAABCD");
        assertEquals(expected, actual, EPSILON);
    }


}

