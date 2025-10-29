// jdh CS3240A / CS 5240A Fall 2025

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
  public static void main(String[] args) {
    Person john = new Person("John", 0);
    Person mary = new Person("Mary", 1);
    Person shannon = new Person("Shannon", 5);
    Person tom = new Person("Tom", 2);

    Map<Person, Person> bestFriendMap = new HashMap<Person, Person> ();
    // John's best friend is Mary
    bestFriendMap.put(john, mary);
    // Shannon's best friend is also John
    bestFriendMap.put(shannon, john);
    // but Mary considers her best friend to be Tom
    bestFriendMap.put(mary, tom);

    // who is mary's best friend?
    Person maryBestFriend = bestFriendMap.get(mary);
    if (maryBestFriend != null)
      System.out.println("Mary's best friend is " + maryBestFriend);
    else
      System.out.println("Mary does not have a best friend");

    // who is tom's best friend?
    Person tomBestFriend = bestFriendMap.get(tom);
    if (tomBestFriend != null)
      System.out.println("Tom's best friend is " + tomBestFriend);
    else
      System.out.println("Tom does not have a best friend");

    // now iterate through all of the entries
    Set<Person> keys = bestFriendMap.keySet();
    for (Person p: keys) {
      System.out.println(p + ": best friend is " + bestFriendMap.get(p));
    }
  } // main()
} // HashMapDemo
