import Console.Console;

public class Client {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Console console = new Console();
        System.out.println("Наполните корзину пожалуйста");

        double priceBucket = cart.calculateTotalCost(console.readCart());
        System.out.println("Итого к оплате: "+priceBucket+" условных едениц");
    }


}
