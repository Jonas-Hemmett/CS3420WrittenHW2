// jdh CS 3240A / CS 5240A Fall 2025

import java.lang.Comparable;

public class Interval implements Comparable {
  String name;
  int startTime;
  int finishTime;
  int weight;

  public Interval(String name, int startTime, int finishTime, int weight) {
    this.name = name;
    this.startTime = startTime;
    this.finishTime = finishTime;
    this.weight = weight;
  }

  public int compareTo(Object o) {
    Interval other = (Interval) o;
    if (this.finishTime < other.finishTime)
      return -1;
    else if (other.finishTime < this.finishTime)
      return 1;
    else
      return 0;
  }

  public String toString() {
    String s = this.name + ": (" + this.startTime + ", " + this.finishTime + ") w=" + this.weight;
    return s;
  }
} // class Interval
