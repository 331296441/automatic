package com.wood.automatic.common.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtil {
     // Date 转 LocalDateTime
    public static LocalDateTime dateToLocalDateTime(Date date) {
        if (date == null) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    // LocalDateTime 转 Date
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

}