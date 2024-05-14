
package com.mycompany.alarm;

/**
 *
 * @author MyBook Hype
 */
public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
    public static void main(String[] args) {
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(true, false));
    }
}
