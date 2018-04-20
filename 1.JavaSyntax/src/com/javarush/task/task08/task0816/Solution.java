package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("KateJG", new Date("FEBRUARY 5 1982"));
        map.put("KateJG1", new Date("November 5 1981"));
        map.put("KateJG2", new Date("DECEMBER 5 1982"));
        map.put("KateJG3", new Date("JANUARY 5 1982"));
        map.put("KateJG4", new Date("MARCH 5 1982"));
        map.put("KateJG5", new Date("JULY 5 1982"));
        map.put("KateJG6", new Date("AUGUST 5 1982"));
        map.put("KateJG7", new Date("SEPTEMBER 5 1982"));
        map.put("KateJG8", new Date("OCTOBER 5 1982"));
        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator <Map.Entry<String, Date>> Iterator = map.entrySet().iterator();
        while(Iterator.hasNext()) {
            Map.Entry<String, Date> pair = Iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth()< 8 ) {
                Iterator.remove();
            }
        }


    }

    public static void main(String[] args) {

    }
}
