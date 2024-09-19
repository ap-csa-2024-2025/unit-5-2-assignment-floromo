public class Clock
{

  public static void main(String[] args)
    {
      timeOfDay(12);
    }

  public static void timeOfDay (int x){
    String day;

    if (x==0 || x==24) {
      day = "midnight";
    } else if (x==12) {
      day = "noon";
    } else if (x==18) {
      day = "dusk";
    } else if (x > 0 && x < 12) {
      day = "morning";
    } else if (x > 12 && x < 18) {
      day = "afternoon";
    } else if (x > 18 && x < 24) {
      day = "evening";
    } else {
      day = "try again";
    }

    System.out.print(day);
  }
}
