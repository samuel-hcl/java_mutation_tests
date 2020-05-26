public class Cart {

    public int totalPrice(int quantity, Boolean coupon) {
        if(quantity >= 10 || coupon == true) {
            return quantity * 15;
        }
        return 17 * quantity;
    }

}
