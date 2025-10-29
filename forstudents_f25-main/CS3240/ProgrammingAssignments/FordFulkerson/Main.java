// jdh CS 3240A / CS 5240A Fall 2025

import java.util.List;

public class Main {
  public static void main(String args[]) {
    testOne();
//  testTwo();
  }

  //----------------------------------------------------------------------
  // the example from the Ch. 7 worksheet, with initial flow set to zero

  public static void testOne() {
    Node ns = new Node("s");
    Node na = new Node("a");
    Node nb = new Node("b");
    Node nc = new Node("c");
    Node nd = new Node("d");
    Node ne = new Node("e");
    Node nt = new Node("t");

    Graph G = new Graph();
    G.addNode(ns);
    G.addNode(na);
    G.addNode(nb);
    G.addNode(nc);
    G.addNode(nd);
    G.addNode(ne);
    G.addNode(nt);

    G.addEdge(ns, na, 5);
    G.addEdge(ns, nb, 5);
    G.addEdge(na, nd, 5);
    G.addEdge(nb, nt, 6);
    G.addEdge(nc, nb, 3);
    G.addEdge(nd, nc, 4);
    G.addEdge(nd, ne, 4);
    G.addEdge(ne, nt, 4);

    G.print();
    G.checkFlow(ns, nt);

    int mf = G.findMaxFlow(ns, nt);
    System.out.println("flow is " + mf);
    List<Edge> edges = G.getEdges();
    for (Edge e: edges) {
      System.out.println(e);
    }
  } // testOne()

  //----------------------------------------------------------------------
  // the example from the Ch. 7 worksheet, with nonzero initial flow

  public static void testTwo() {
    Node ns = new Node("s");
    Node na = new Node("a");
    Node nb = new Node("b");
    Node nc = new Node("c");
    Node nd = new Node("d");
    Node ne = new Node("e");
    Node nt = new Node("t");

    Graph G = new Graph();
    G.addNode(ns);
    G.addNode(na);
    G.addNode(nb);
    G.addNode(nc);
    G.addNode(nd);
    G.addNode(ne);
    G.addNode(nt);

    G.addEdge(ns, na, 5, 4);
    G.addEdge(ns, nb, 5, 4);
    G.addEdge(na, nd, 5, 4);
    G.addEdge(nb, nt, 6, 6);
    G.addEdge(nc, nb, 3, 2);
    G.addEdge(nd, nc, 4, 2);
    G.addEdge(nd, ne, 4, 2);
    G.addEdge(ne, nt, 4, 2);

    G.print();
    G.checkFlow(ns, nt);

    int mf = G.findMaxFlow(ns, nt);
    System.out.println("flow is " + mf);
    List<Edge> edges = G.getEdges();
    for (Edge e: edges) {
      System.out.println(e);
    }
  } // testTwo()

} // class Main
