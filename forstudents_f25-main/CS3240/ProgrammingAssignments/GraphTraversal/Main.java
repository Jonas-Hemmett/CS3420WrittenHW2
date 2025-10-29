// jdh CS 3240A / CS5240A Fall 2025

import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String args[]) {
    testOne();
    testTwo();
    testThree();
  }

  //--------------------------------------------
  // this is the graph in Lecture 3-B

  public static void testOne() {
    System.out.println("*** testOne() ***");
    Node na = new Node("a");
    Node nb = new Node("b");
    Node nc = new Node("c");
    Node nd = new Node("d");
    Node ne = new Node("e");
    Node nf = new Node("f");
    Node ng = new Node("g");
    Node nh = new Node("h");
    Node ni = new Node("i");
    Node nj = new Node("j");
    Node nk = new Node("k");
    Node nl = new Node("l");
    Node nm = new Node("m");

    Graph G = new Graph();
    G.addNode(na);
    G.addNode(nb);
    G.addNode(nc);
    G.addNode(nd);
    G.addNode(ne);
    G.addNode(nf);
    G.addNode(ng);
    G.addNode(nh);
    G.addNode(ni);
    G.addNode(nj);
    G.addNode(nk);
    G.addNode(nl);
    G.addNode(nm);

    G.addEdge(na, nb);
    G.addEdge(na, nc);
    G.addEdge(nb, nc);
    G.addEdge(nb, nd);
    G.addEdge(nb, ne);
    G.addEdge(nc, ng);
    G.addEdge(nc, nh);
    G.addEdge(nd, nc);
    G.addEdge(nd, ne);
    G.addEdge(ne, nf);
    G.addEdge(ng, nh);
    G.addEdge(ni, nj);
    G.addEdge(nk, nl);
    G.addEdge(nl, nm);

    System.out.println("--- DFS ---");
    Map<Node, Node> first = G.DFS(na);
    for (Node n: first.keySet()) {
      System.out.print(n);
      Node parent = first.get(n);
      while (parent != null) {
        System.out.print(" -> " + parent);
        parent = first.get(parent);
      }
      System.out.println();
    }

    System.out.println("--- BFS ---");
    first = G.BFS(na);
    for (Node n: first.keySet()) {
      System.out.print(n);
      Node parent = first.get(n);
      while (parent != null) {
        System.out.print(" -> " + parent);
        parent = first.get(parent);
      }
      System.out.println();
    }
  } // testOne()

  //--------------------------------------------
  // a graph having no edges

  public static void testTwo() {
    System.out.println("*** testTwo() ***");
    Node na = new Node("a");
    Node nb = new Node("b");
    Node nc = new Node("c");
    Node nd = new Node("d");
    Node ne = new Node("e");
    Node nf = new Node("f");

    Graph G = new Graph();
    G.addNode(na);
    G.addNode(nb);
    G.addNode(nc);
    G.addNode(nd);
    G.addNode(ne);
    G.addNode(nf);

    System.out.println("--- DFS ---");
    Map<Node, Node> first = G.DFS(na);
    for (Node n: first.keySet()) {
      System.out.print(n);
      Node parent = first.get(n);
      while (parent != null) {
        System.out.print(" -> " + parent);
        parent = first.get(parent);
      }
      System.out.println();
    }

    System.out.println("--- BFS ---");
    first = G.BFS(na);
    for (Node n: first.keySet()) {
      System.out.print(n);
      Node parent = first.get(n);
      while (parent != null) {
        System.out.print(" -> " + parent);
        parent = first.get(parent);
      }
      System.out.println();
    }
  } // testTwo()

  //--------------------------------------------
  // the graph shown in the assignment spec

  public static void testThree() {
    System.out.println("*** testThree() ***");
    Node na = new Node("a");
    Node nb = new Node("b");
    Node nc = new Node("c");
    Node nd = new Node("d");
    Node ne = new Node("e");
    Node nf = new Node("f");
    Node ng = new Node("g");
    Node nh = new Node("h");
    Node ni = new Node("i");
    Node nj = new Node("j");
    Node nk = new Node("k");

    Graph G = new Graph();
    G.addNode(na);
    G.addNode(nb);
    G.addNode(nc);
    G.addNode(nd);
    G.addNode(ne);
    G.addNode(nf);
    G.addNode(ng);
    G.addNode(nh);
    G.addNode(ni);
    G.addNode(nj);
    G.addNode(nk);

    G.addEdge(na, nb);
    G.addEdge(na, nc);
    G.addEdge(nb, nc);
    G.addEdge(nb, nd);
    G.addEdge(nd, nf);
    G.addEdge(ne, nc);
    G.addEdge(ne, ng);
    G.addEdge(ne, nk);
    G.addEdge(nf, ng);
    G.addEdge(nf, nh);
    G.addEdge(nh, ni);
    G.addEdge(nh, nj);
    G.addEdge(ni, nk);

    System.out.println("--- DFS ---");
    Map<Node, Node> first = G.DFS(na);
    for (Node n: first.keySet()) {
      System.out.print(n);
      Node parent = first.get(n);
      while (parent != null) {
        System.out.print(" -> " + parent);
        parent = first.get(parent);
      }
      System.out.println();
    }

    System.out.println("--- BFS ---");
    first = G.BFS(na);
    for (Node n: first.keySet()) {
      System.out.print(n);
      Node parent = first.get(n);
      while (parent != null) {
        System.out.print(" -> " + parent);
        parent = first.get(parent);
      }
      System.out.println();
    }
  } // testThree()

} // class Main
