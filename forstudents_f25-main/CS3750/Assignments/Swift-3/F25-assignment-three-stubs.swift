// CS 3750 Fall 2025
// stubs and classes for Swift Assignment #3 extra credit

class Node: Hashable, CustomStringConvertible {
    var name: String
    var adjlist: [Node] = []
    var description: String {return name}
    init(name: String) {
        self.name = name
    }

    static func==(n1: Node, n2: Node) -> Bool {
        return n1.name == n2.name
    }

    func hash(into hasher: inout Hasher) {
        hasher.combine(name)
    }
}

//======================================================

class Graph {
    var nodes: [Node] = []

    func addNode(_ node: Node) {
        if let _ = nodes.firstIndex(of: node) {
            return
        }
        nodes.append(node)
    }

    func addEdge(_ node1: Node, _ node2: Node) {
        // add node2 to the adjacency list of node1
        if let _ = nodes.firstIndex(of: node1), let _ = nodes.firstIndex(of: node2) {
            if let _ = node1.adjlist.firstIndex(of: node2) {
                return
            }
            node1.adjlist.append(node2)
        }
        // and add node1 to the adjacency list of node2
        if let _ = nodes.firstIndex(of: node2), let _ = nodes.firstIndex(of: node1) {
            if let _ = node2.adjlist.firstIndex(of: node1) {
                return
            }
            node2.adjlist.append(node1)
        }
    }

    func printGraph() {
        for i in 0..<nodes.count {
            let n = nodes[i]
            print("Node \(n.name):", terminator: "")
            for j in 0..<n.adjlist.count {
                print(" \(n.adjlist[j].name)", terminator: "")
            }
            print("")
        }
    }

    func bfs(_ startNode: Node) -> [Node] {
        // here are variables that will be useful
        var ccnodes: [Node] = []
        var queue = Queue<Node>()
        var discovered: [Node:Bool] = [:]
        for node in nodes {
            discovered[node] = false
        }

        // implement this
        return ccnodes
    } // bfs
} // class Graph

//======================================================

func testBFS() {
    let n1 = Node(name: "n1")
    let n2 = Node(name: "n2")
    let n3 = Node(name: "n3")
    let n4 = Node(name: "n4")
    let n5 = Node(name: "n5")
    let n6 = Node(name: "n6")
    let n7 = Node(name: "n7")
    let n8 = Node(name: "n8")
    let n9 = Node(name: "n9")
    let n10 = Node(name: "n10")

    let g = Graph()
    g.addNode(n1)
    g.addNode(n2)
    g.addNode(n3)
    g.addNode(n4)
    g.addNode(n5)
    g.addNode(n6)
    g.addNode(n7)
    g.addNode(n8)
    g.addNode(n9)
    g.addNode(n10)

    g.addEdge(n1, n2);
    g.addEdge(n1, n3);
    g.addEdge(n2, n3);
    g.addEdge(n2, n4);
    g.addEdge(n2, n5);
    g.addEdge(n3, n5);
    g.addEdge(n3, n7);
    g.addEdge(n3, n8);
    g.addEdge(n4, n5);
    g.addEdge(n5, n6);
    g.addEdge(n7, n8);
    g.addEdge(n9, n10);

    g.printGraph()
    let nodes = g.bfs(n1)
    print(nodes)
} // testBFS()
