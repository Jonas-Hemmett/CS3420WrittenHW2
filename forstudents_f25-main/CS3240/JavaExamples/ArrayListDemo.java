// jdh CS3240A / CS 5240A Fall 2025

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    Person john = new Person("John", 0);
    Person mary = new Person("Mary", 1);
    Person shannon = new Person("Shannon", 5);

    List<Person> myFriends = new ArrayList<Person> ();
    myFriends.add(john);
    myFriends.add(mary);
    myFriends.add(shannon);

    int numFriends = myFriends.size();
    System.out.println("total #friends = " + numFriends);
    System.out.println("here they are:");
    for (Person friend: myFriends) {
      System.out.println("  " + friend);
    }

    // now add a new friend
    Person tom = new Person("Tom", 2);
    myFriends.add(tom);

    // but shannon is no longer my friend
    int idx = myFriends.indexOf(shannon);
    if (idx >= 0)
      myFriends.remove(idx);

    // can also do this
    myFriends.remove(mary);

    System.out.println("here are my friends now:");
    for (Person friend: myFriends) {
      System.out.println("  " + friend);
    }
  }
}
