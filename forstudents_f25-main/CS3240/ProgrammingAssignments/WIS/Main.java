// jdh CS 3240A / CS 5240A Fall 2025

import java.util.List;

public class Main {

  public static void main(String args[]) {
    testOne();
    testTwo();
  }

  public static void testOne() {
    Interval I1 = new Interval("I1", 0, 6, 2);
    Interval I2 = new Interval("I2", 1, 9, 4);
    Interval I3 = new Interval("I3", 7, 11, 4);
    Interval I4 = new Interval("I4", 3, 14, 7);
    Interval I5 = new Interval("I5", 12, 15, 2);
    Interval I6 = new Interval("I6", 13, 15, 1);

    IntervalSet intervalSet = new IntervalSet();

    intervalSet.add(I1);
    intervalSet.add(I2);
    intervalSet.add(I3);
    intervalSet.add(I4);
    intervalSet.add(I5);
    intervalSet.add(I6);

    List<Interval> schedule = intervalSet.schedule();
    System.out.println("here's the schedule:");
    for (Interval interval: schedule) {
      System.out.println(interval);
    }
  } // testOne()

  //-----------------------------------------------------

  public static void testTwo() {
    Interval I1 = new Interval("I1", 6, 13, 10);
    Interval I2 = new Interval("I2", 4, 6, 2);
    Interval I3 = new Interval("I3", 14, 19, 4);
    Interval I4 = new Interval("I4", 17, 20, 2);
    Interval I5 = new Interval("I5", 1, 4, 3);
    Interval I6 = new Interval("I6", 2, 5, 4);
    Interval I7 = new Interval("I7", 13, 15, 3);
    Interval I8 = new Interval("I8", 10, 12, 5);
    Interval I9 = new Interval("I9", 7, 9, 6);
    Interval I10 = new Interval("I10", 12, 16, 7);

    IntervalSet intervalSet = new IntervalSet();

    intervalSet.add(I1);
    intervalSet.add(I2);
    intervalSet.add(I3);
    intervalSet.add(I4);
    intervalSet.add(I5);
    intervalSet.add(I6);
    intervalSet.add(I7);
    intervalSet.add(I8);
    intervalSet.add(I9);
    intervalSet.add(I10);

    List<Interval> schedule = intervalSet.schedule();
    System.out.println("here's the schedule:");
    for (Interval interval: schedule) {
      System.out.println(interval);
    }
  } // testTwo()
} // class Main
