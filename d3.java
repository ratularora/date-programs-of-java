import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;

 class Main {
   public static void main(String[] args) 
   {
      String[] weekdays = new DateFormatSymbols().getWeekdays();
      
      for (int i = 1; i < (weekdays.length); i++) {
         String weekday = weekdays[i];
         System.out.println("weekday = " + weekday);
      }
   }
}