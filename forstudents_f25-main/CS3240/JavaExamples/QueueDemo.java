// jdh CS3240A / CS 5240A Fall 2025

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Person john = new Person("John", 0);
    Person mary = new Person("Mary", 1);
    Person shannon = new Person("Shannon", 5);

    Queue<Person> friendQueue = new LinkedList<Person> ();
    System.out.println("enqueue " + john);
    friendQueue.offer(john);
    System.out.println("enqueue " + mary);
    friendQueue.offer(mary);
    System.out.println("enqueue " + shannon);
    friendQueue.offer(shannon);

    // now dequeue the top entry
    Person p = friendQueue.poll();
    if (p != null) {
      System.out.println("dequeued " + p);
    }

    // now enqueue a new friend
    Person tom = new Person("Tom", 2);
    System.out.println("enqueue " + tom);
    friendQueue.offer(tom);

    // and dequeue everyone
    System.out.println("now dequeue every entry");
    p = friendQueue.poll();
    while (p != null) {
      System.out.println("dequeued " + p);
      p = friendQueue.poll();
    }
  } // main()
} // QueueDemo
