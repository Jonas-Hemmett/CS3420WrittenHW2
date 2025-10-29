// jdh CS3240A / CS 5240A Fall 2025

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Person john = new Person("John", 0);
    Person mary = new Person("Mary", 1);
    Person shannon = new Person("Shannon", 5);

    Stack<Person> friendStack = new Stack<Person> ();
    System.out.println("push " + john);
    friendStack.push(john);
    System.out.println("push " + mary);
    friendStack.push(mary);
    System.out.println("push " + shannon);
    friendStack.push(shannon);

    // now pop the top entry
    if ( ! friendStack.empty() ) {
      Person p = friendStack.pop();
      System.out.println("popped " + p);
    }

    // now push a new friend
    Person tom = new Person("Tom", 2);
    System.out.println("push " + tom);
    friendStack.push(tom);

    // and pop everyone
    System.out.println("now pop every entry");
    while ( ! friendStack.empty() ) {
      Person p = friendStack.pop();
      System.out.println("popped " + p);
    }
  } // main()
} // StackDemo
