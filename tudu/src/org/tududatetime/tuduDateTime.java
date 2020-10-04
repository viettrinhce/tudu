/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tududatetime;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 

/**
 *
 * @author nicholas
 */
public class tuduDateTime {
    int month;
    int day;
    int year;
    int hour;
    int minute;
    int second;
    String strDateTime;
    java.sql.Date sqlDate;
    public tuduDateTime(int month, int day, int year, int hour, int minute, int second) throws ParseException{
        strDateTime = Integer.toString(month) + "-" + Integer.toString(day) + "-" + Integer.toString(year) + " " + Integer.toString(hour) + ":" + Integer.toString(minute) + ":" + Integer.toString(second);
        //first convert string to java.util.Date object using SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        java.util.Date date = sdf.parse(strDateTime);
        sqlDate = new Date(date.getTime());
    }
    public java.sql.Date getSqlDate() {
        return sqlDate;
    }
}
