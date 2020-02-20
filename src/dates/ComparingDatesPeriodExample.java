package dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 01, 01);
        LocalDate localDate1 = LocalDate.of(2018, 12, 31);

        /**
         *
         */

        Period period = localDate.until(localDate1);
        System.out.println("getDays : "+period.getDays());//result is 30 -> performs 31-1
        System.out.println("getMonths : "+period.getMonths());//result is 11 -> performs 12-1
        System.out.println("getYears : "+period.getYears());//result is 0 -> performs 1-1

        Period period1 = Period.ofDays(10);
        System.out.println("period1.getDays : "+period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("getYears : "+period2.getYears());
        System.out.println("toTotalMonths : "+period2.toTotalMonths());

        Period between = Period.between(localDate, localDate1);
        System.out.println("Period : "+between.getDays()+" : "+between.getMonths()+" : "+between.getYears());

        

    }
}
