import java.util.Scanner;

class ShipCost
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        double shipCosts = 0;
        double totalCosts = 0;
        double itemPrice = 0;
        final double SHIP_COST_THRESHOLD = 100;
        final double SHIP_RATE = .02;
        String trash = "";

        // get the itemPrice

        IO.print("Enter the item price: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= SHIP_COST_THRESHOLD)
            {
                shipCosts = 0;
                totalCosts = itemPrice;
            }
            else // we have shipping cost
            {
                shipCosts = itemPrice * SHIP_RATE;
                totalCosts = itemPrice + shipCosts;
            }

            IO.println("The shipping cost is " + shipCosts);
            IO.println("The total cost is " + totalCosts);
        }
        else // got trash
        {
            trash = in.nextLine();
            IO.println("This is an incorrect value " + trash);
            IO.println("Run the program again with correct input");
            System.exit(0);
        }
    }
}