// jdh CS 3240A / CS 5240A Fall 2025

public class Person {
  String name;
  int numCats;

  Person(String name, int numCats) {
    this.name = name;
    this.numCats = numCats;
  }

  @Override public String toString() {
    String s = this.name;
    if (this.numCats == 0)
      s = s + " (no cats)";
    else if (this.numCats == 1)
      s = s + " (one cat)";
    else
      s = s + " (" + this.numCats + " cats)";
    return s;
  }
} // class Person
