public class Order { // class
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order(boolean filled, double cost, String shippingMethod) { // constructor
        if (cost > 24.00) {
            System.out.println("High value item!");
        }

        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if(isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else { // if order ir false, then return order not ready
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping(){
        if(shipping.equals("Regular")){
            return 0;
        } else if(shipping.equals("Express")){
            return 1.75;
        } else {
            return .50;
        }
    }

    public static void main(String[] args){
        Order book = new Order(true, 9.99, "Express");
        Order cd = new Order(true, 10.99, "Regular");


        book.ship(); // execute the ship method with book object
        cd.ship();
    }

}
