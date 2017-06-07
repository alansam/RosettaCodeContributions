
import java.text.*;
import java.util.*;

public class RLastFridayOfMonth {

  public static void main(String[] args) {
    int year;
    if (args.length > 0) {
      year = Integer.parseInt(args[0]);
    }
    else {
      year = 2012;
    }
    GregorianCalendar c = new GregorianCalendar(year, 0, 1);

    for (String mon : new DateFormatSymbols(/*Locale.US*/).getShortMonths()) {
      if (!mon.isEmpty()) {
        int totalDaysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, totalDaysOfMonth);

        int daysToRollBack = (c.get(Calendar.DAY_OF_WEEK) + 1) % 7;

        int day = totalDaysOfMonth - daysToRollBack;
        c.set(Calendar.DAY_OF_MONTH, day);

        System.out.printf("%04d %s %d\n", year, mon, day);

        c.set(year, c.get(Calendar.MONTH) + 1, 1);
      }
    }
    return;
  }
}

