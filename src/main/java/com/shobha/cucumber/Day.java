package com.shobha.cucumber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day {
    public String isSunday(String date)  {
      String reply = null;
      try {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        reply = (date1.getDay() == 0) ? "YES" : "NO";
        
      } catch (ParseException e) {
        reply = "Date format is incorrect";
      }
      return reply;
    }
}
