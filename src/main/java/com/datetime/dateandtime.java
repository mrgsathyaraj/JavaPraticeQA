package com.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dateandtime {


    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date is :"+date);

        LocalDate localdate = LocalDate.now();
        System.out.println("local date is :"+localdate);

        LocalTime localtime = LocalTime.now();
        System.out.println("localtime is "+localtime);

        LocalDateTime localdatetime = LocalDateTime.now();
        System.out.println("local date and time is "+localdatetime);

        //Format the dte and Time in the required pattern

        //DD represent the Day of the year example -Jul-07 is 187th day/365 days.

        DateTimeFormatter FormattedDate = DateTimeFormatter.ofPattern("dd-mm-YYYY");
        String FormattedDateObj= FormattedDate.format(localdatetime);
        System.out.println("local date :"+FormattedDateObj);

        DateTimeFormatter FormattedTime= DateTimeFormatter.ofPattern("HH:mm:ss");
        String FormattedTimeObj= FormattedTime.format(localdatetime);
        System.out.println("local time :"+FormattedTimeObj);


    }
}
