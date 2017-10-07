package com.mbokinala.wrmswhendoestheperiodend.schedule;

import org.joda.time.DateTime;
import org.joda.time.Interval;

/**
 * Created by ajonnakuti on 10/6/17.
 */

public class PeriodInfo {

    private static Interval perOne;
    private static Interval perTwo;
    private static Interval perThree;
    private static Interval perFour;
    private static Interval perFive;
    private static Interval perSix;
    private static Interval perSeven;
    private static Interval perEight;
    private static Interval perTutorial;
    private static Interval perNine;

    private static void initIntervals() {
        DateTime now = new DateTime();

        perOne = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 7, 53), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 8, 36));
        perTwo = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 8, 40), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 9, 24));
        perThree = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 9, 28), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 10, 11));
        perFour = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 10, 18), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 11, 1));
        perFive = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 11, 5), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 11, 48));
        perSix = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 11, 48), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 12, 20));
        perSeven = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(),12, 24), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 13, 7));
        perEight = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 13, 11), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 13, 54));
        perTutorial = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 13, 58), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 14, 28));
        perOne = new Interval(new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(),14, 32), new DateTime(now.getYear(), now.getMonthOfYear(), now.getDayOfMonth(), 15, 15));
    }

    public static String getPeriod() {
        initIntervals();

        String period = "Error";
        DateTime now = new DateTime();

        if(perOne.contains(now)) {
            period = "1st";
        } else if (perTwo.contains(now)) {
            period = "2nd";
        } else if (perThree.contains(now)) {
            period = "3rd";
        } else if (perFour.contains(now)) {
            period = "4th";
        } else if (perFive.contains(now)) {
            period = "5th";
        } else if (perSix.contains(now)) {
            period = "6th";
        } else if (perSeven.contains(now)) {
            period = "7th";
        } else if (perEight.contains(now)) {
            period = "8th";
        } else if (perTutorial.contains(now)) {
            period = "Tutorial";
        } else if (perNine.contains(now)) {
            period = "9th";
        } else if (!(now.getHourOfDay() >= 15 && now.getMinuteOfDay() >= 5)) {
            period = "passing";
        }

        return period;
    }

}
