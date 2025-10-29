// jdh CS 3240A / CS 5240A Fall 2025

import java.util.ArrayList;
import java.util.List;

public class Node {
  String name;
  List<Edge> adjlist;
  List<Edge> adjlistResid;

  public Node(String name) {
    this.name = name;
    this.adjlist = new ArrayList<Edge>();
    this.adjlistResid = new ArrayList<Edge>();
  }

  public void addEdge(Edge edge) {
    this.adjlist.add(edge);
  }

  public void addResidualEdge(Edge edge) {
    this.adjlistResid.add(edge);
  }

  @Override
  public String toString() {
    String s = this.name;
    return s;
  }

} // class Node
