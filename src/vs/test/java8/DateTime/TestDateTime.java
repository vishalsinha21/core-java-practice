package vs.test.java8.DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDateTime {

    public static void main(String[] args) {

        //Only Date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2018, 1, 1);
        System.out.println(date1);

        date1 = date1.plusDays(40);
        System.out.println(date1);

        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());

        //Only time, upto nano second
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.minusHours(1));

        System.out.println(LocalTime.of(2, 2));
        System.out.println(LocalTime.of(2, 2, 2, 300000000));

        //Date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println(dateTime.getDayOfWeek().getValue());

        Duration duration = Duration.between(LocalDateTime.of(2018, 3, 1, 1, 30), LocalDateTime.of(2018, 3, 5, 1, 0));
        System.out.println(duration.toMinutes());
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());

    }
}
