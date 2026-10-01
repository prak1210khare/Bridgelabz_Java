/*Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
        ➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones.
Auhtor: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras1;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {

    public static void main(String[] args) {

        // Get current time in different time zones
        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("GMT"));

        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display the times
        System.out.println("GMT Time = " + gmtTime);
        System.out.println("IST Time = " + istTime);
        System.out.println("PST Time = " + pstTime);
    }
}