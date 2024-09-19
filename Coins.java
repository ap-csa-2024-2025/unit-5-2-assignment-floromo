public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(1234);
  }

  public static void coinConverter(int x){
    int dollars = x/100;
    int quarters = (x%100)/25;
    int dimes = ((x%100)-(quarters*25))/10;
    int nickles = ((x%100)-(quarters*25)-(dimes*10))/5;
    int pennies = (x%100)-(quarters*25)-(dimes*10)-(nickles*5);

    System.out.println( "Dollar Bills: " + dollars + "\n" + 
                        "Quarters: " + quarters + "\n" + 
                        "Dimes: " + dimes + "\n" + 
                        "Nickles: " + nickles + "\n" + 
                        "Pennies: " + pennies );
  }

}
