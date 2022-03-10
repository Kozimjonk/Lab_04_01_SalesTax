public class Main
{

    public static void main(String[] args)
    {
	double itemPrice = 30.00;
    double Tax = itemPrice * 0.05;
    double totalPrice = itemPrice + Tax;

        System.out.println("Price of the Item: $" + itemPrice);
        System.out.println("Tax: $" + Tax);
        System.out.println("Total: $" + totalPrice);
    }
}
