import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CartTest {
    @Test
    public void shouldReturnNormalPrice() {
        Cart cart = new Cart();
        int quantity = 10;
        int price = cart.totalPrice(quantity,false);
        assertEquals(150, price);
    }

    @Test
    public void shouldReturnNormalPricenew() {
        Cart cart = new Cart();
        int quantity = 2;
        int price = cart.totalPrice(quantity,false);
        assertEquals(34, price);
    }

    @Test
    public void shouldApplyDiscountByQuantity() {
        Cart cart = new Cart();
        int quantity = 15;
        int price = cart.totalPrice(quantity,false);
        assertEquals(225, price);
    }

    @Test
    public void shouldApplyDiscountByCoupon() {
        Cart cart = new Cart();
        int quantity = 2;
        int price = cart.totalPrice(quantity,true);
        assertEquals(30, price);
    }
}


// run coverage
// ./gradlew test

// run mutation
// ./gradlew pitest
