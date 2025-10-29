// jdh CS 3240A / CS 5240A Fall 2025

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class Graph {
  List<Node> nodes;

  public Graph() {
    this.nodes = new ArrayList<Node>();
  }

  //-------------------------------------------------------

  public void addNode(Node n) {
    this.nodes.add(n);
  }

  //-------------------------------------------------------

  public Edge addEdge(Node n1, Node n2, int capacity) {
    return this.addEdge(n1, n2, capacity, 0);
  }

  //-------------------------------------------------------

  public Edge addEdge(Node n1, Node n2, int capacity, int flow) {
    Edge e1 = new Edge(n1, n2, capacity, flow);
    if (flow > capacity || flow < 0) {
      System.out.println("ERROR: flow must be >= 0 and <= capacity");
      return null;
    }

    int idx1 = this.nodes.indexOf(n1);
    if (idx1 >= 0) {
      this.nodes.get(idx1).addEdge(e1);
      return e1;
    } else {
      System.out.println("ERROR: node " + n1.name + " not found in graph");
      return null;
    }
  } // addEdge()

  //-------------------------------------------------------

  private void addResidualEdge(Edge originalEdge, int capacity, boolean isBackward) {
    if (isBackward) {
      Edge residualEdge = new Edge(originalEdge.n2, originalEdge.n1, capacity, isBackward);
      residualEdge.originalEdge = originalEdge;
      originalEdge.n2.addResidualEdge(residualEdge);
    } else {
      Edge residualEdge = new Edge(originalEdge.n1, originalEdge.n2, capacity, isBackward);
      residualEdge.originalEdge = originalEdge;
      originalEdge.n1.addResidualEdge(residualEdge);
    }
  } // addResidualEdge()

  //---------------------------------------------------------

  public void print() {
    for (Node n: this.nodes) {
      System.out.print("Node : " + n);
      for (Edge edge: n.adjlist) {
        if ( ! edge.isBackward ) {
          System.out.print(" " + edge.n2 + " (c=" + edge.capacity);
          System.out.print(", f=" + edge.flow + ")");
        }
      }
      System.out.println();
    }
  } // print()

  //---------------------------------------------------------

  private void printResidualGraph() {
    for (Node n: this.nodes) {
      System.out.print("Node " + n + ":");
      for (Edge edge: n.adjlistResid) {
        if (edge.isBackward)
          System.out.print(" " + edge.n2 + " (bkwd; c=" + edge.capacity + ")");
        else
          System.out.print(" " + edge.n2 + " (c=" + edge.capacity + ")");
      }
      System.out.println();
    }
  } // printResidualGraph()

  //---------------------------------------------------------
  
  public void printFlow() {
    for (Node n1: this.nodes) {
      for (Edge edge: n1.adjlist) {
        System.out.println(n1 + " -> " + edge.n2 + ": " + edge.flow);
      }
    }
  } // printFlow()
  
  //---------------------------------------------------------

  private List<Edge> findPathInResid(Node s, Node t) {
    int i, k, idx;
    boolean done, found;
    Node n1, n2;

    List<Edge> path = new ArrayList<Edge>();

    Stack<Node> stack = new Stack<Node>();
    Map<Node, Boolean> explored = new HashMap<Node, Boolean> ();
    Map<Node, Node> parent = new HashMap<Node, Node> ();

    for (Node n: this.nodes) {
      explored.put(n, false);
      parent.put(n, null);
    }

    done = false;
    stack.push(s);
    while ( ! done && ! stack.empty() ) {
      n1 = stack.pop();
      if ( ! explored.get(n1) ) {
        explored.put(n1, true);
//      System.out.println("explore: " + n1);
        if (parent.get(n1) != null)
          System.out.println("tree: " + n1 + " -> " + parent.get(n1));
//      System.out.println("set explored [" + n1 + "] to true");
        for (Edge edge: n1.adjlistResid) {
//        if ( ( ! edge.isBackward && edge.flow < edge.capacity ) ||
//             ( edge.isBackward && edge.flow > 0 ) ) {
          if (1 == 1) {
            n2 = edge.n2;
            if ( ! explored.get(n2) ) {
//            System.out.println("add edge from " + n1 + " to " + n2);
//            System.out.println("discover: " + n2);
              stack.push(n2);
              parent.put(n2, n1);
              if (n2 == t)
                done = true;
//          } else {
//            System.out.println("have already explored " + n2);
            }
          }
        }
      }
    }

    System.out.println("here's the backward path from " + t);
    done = false;
    Node node = t;
    while ( ! done ) {
      if (parent.get(node) == null) {
        done = true;
      } else {
        System.out.println(node + " to " + parent.get(node));
        Node p = parent.get(node);
        // find the edge from node to parent
        for (Edge e: p.adjlistResid) {
          if (e.n2 == node) {
            path.add(e);
            break;
          }
        }
        node = p;
      }
    }

    System.out.println();
    return path;
  } // findPathInResid()

  //---------------------------------------------------------

  public int findMaxFlow(Node s, Node t) {
    // implement this
  } // findMaxFlow()

  //-------------------------------------------------------

  public boolean checkFlow(Node s, Node t) {
    // implement this

    // check that flow out of s == flow into t
    // check conservation condition at each node
  } // checkFlow()

  //---------------------------------------------------------

  public List<Edge> getEdges() {
    // implement this
  } // getEdges()

  //-------------------------------------------------------

  private void buildResidualGraph() {
    // implement this
  } // buildResidualGraph()

  //---------------------------------------------------------

  private void augment(List<Edge> path) {
    // implement this
  } // augment()

  //---------------------------------------------------------

  private int findBottleneck(List<Edge> path) {
    // implement this
  } // findBottleneck()

} // class Graph
