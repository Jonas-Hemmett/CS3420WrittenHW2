// jdh CS 3240A / CS 5240A Fall 2025

import java.util.List;
import java.util.ArrayList;

public class IntervalSet {
  List<Interval> theIntervals;
  int p[];
  int M[];

  public IntervalSet() {
    theIntervals = new ArrayList<Interval>();
    theIntervals.add(new Interval("dummy", 0, 0, 0));
  }

  //----------------------------------------------------------------

  public boolean add(Interval interval) {
    if ( theIntervals.contains(interval) ) {
      System.out.println("ERROR: interval " + interval + " is already in the set");
      return false;
    }

    theIntervals.add(interval);
    return true;
  }

  //----------------------------------------------------------------

  private int opt(int i) {
    // implement this
  } // opt()

  //----------------------------------------------------------------

  private void traceback(int i, List<Interval> sch) {
    // implement this
  } // traceback()

  //----------------------------------------------------------------

  public List<Interval> schedule() {
    // implement this
  } // schedule()
} // class IntervalSet
