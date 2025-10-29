// jdh CS 3240A / CS 5240A Fall 2025

public class Edge {
  int capacity;
  int flow;
  boolean isBackward;
  Edge originalEdge;
  Node n1;
  Node n2;

  public Edge(Node n1, Node n2, int capacity, int flow) {
    // this is an original edge
    this.n1 = n1;
    this.n2 = n2;
    this.capacity = capacity;
    this.flow = flow;
    this.isBackward = false;
  }

  public Edge(Node n1, Node n2, int capacity, boolean isBackward) {
    // this is a residual edge
    this.n1 = n1;
    this.n2 = n2;
    this.capacity = capacity;
    this.isBackward = isBackward;
  }

  public String toString() {
    String s = n1 + " -> " + n2 + " (c=" + capacity + ", f=" + flow + ")";
    return s;
  }
} // class Edge
