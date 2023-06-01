Certainly! Here's an updated README.md file that includes code snippets for each method:

```markdown
# Weighted Graph Implementation

This Java code provides an implementation of a weighted graph data structure. It allows you to add vertices, add edges between vertices with weights, and perform various graph operations like printing the graph, performing breadth-first search, and Dijkstra's algorithm.

## Classes and Methods

### Main.java

The `Main` class contains the main entry point of the program. It allows the user to interact with the graph by choosing from a menu of options:

#### addVertex()
```java
System.out.println("Enter vertex value:");
int vertexValue = scanner.nextInt();
Vertex<Integer> vertex = new Vertex<>(vertexValue);
graph.addVertex(vertex);
System.out.println("Vertex added.");
```

#### addEdge()
```java
System.out.println("Enter source vertex value:");
int sourceValue = scanner.nextInt();
System.out.println("Enter destination vertex value:");
int destValue = scanner.nextInt();
System.out.println("Enter edge weight:");
double weight = scanner.nextDouble();
Vertex<Integer> source = new Vertex<>(sourceValue);
Vertex<Integer> destination = new Vertex<>(destValue);
graph.addEdge(source, destination, weight);
System.out.println("Edge added.");
```

#### printGraph()
```java
System.out.println("Graph:");
graph.printGraph();
```

#### BreadthFirstSearch()
```java
System.out.println("Enter starting vertex value for Breadth-First Search:");
int startBFSValue = scanner.nextInt();
Vertex<Integer> startBFS = new Vertex<>(startBFSValue);
BreadthFirstSearch<Vertex<Integer>> bfs = new BreadthFirstSearch<>();
System.out.println("Breadth-First Search traversal:");
System.out.println(bfs.traverse(graph, startBFS));
```

#### DijkstraSearch()
```java
System.out.println("Enter starting vertex value for Dijkstra's Algorithm:");
int startDijkstraValue = scanner.nextInt();
Vertex<Integer> startDijkstra = new Vertex<>(startDijkstraValue);
DijkstraSearch<Vertex<Integer>> dijkstra = new DijkstraSearch<>();
System.out.println("Dijkstra's Algorithm traversal:");
System.out.println(dijkstra.traverse(graph, startDijkstra));
```

### WeightedGraph.java

The `WeightedGraph` class represents a weighted graph. It contains the following methods:

#### addVertex(Vertex vertex)
```java
public void addVertex(Vertex vertex) {
    if (!map.containsKey(vertex)) {
        map.put(vertex, new ArrayList<>());
    }
}
```

#### getVertices()
```java
public Set<Vertex> getVertices() {
    return map.keySet();
}
```

#### addEdge(Vertex source, Vertex destination, double weight)
```java
public void addEdge(Vertex source, Vertex destination, double weight) {
    Edge<Vertex> edge = new Edge<>(source, destination, weight);
    map.get(source).add(edge);

    if (!map.containsKey(destination)) {
        map.put(destination, new ArrayList<>());
    }
    map.get(destination).add(edge);
}
```

#### getEdges(Vertex vertex)
```java
public List<Edge<Vertex>> getEdges(Vertex vertex) {
    return map.getOrDefault(vertex, new ArrayList<>());
}
```

#### printGraph()
```java
public void printGraph() {
    for (Map.Entry<Vertex, List<Edge<Vertex>>> entry : map.entrySet()) {
        Vertex vertex = entry.getKey();
        List<Edge<Vertex>> edges = entry.getValue();
        System.out.print("Vertex: " + vertex + " Edges: ");

        for (Edge<Vertex> edge : edges) {
            System.out.print(edge + " ");
        }

        System.out.println();
    }
}
```

### Vertex.java

The `Vertex` class represents a vertex in the graph. It has the following methods:



#### Vertex(V data)
```java
public Vertex(V data) {
    this.data = data;
    this.adjacentVertices = new HashMap<>();
}
```

#### getData()
```java
public V getData() {
    return data;
}
```

#### addAdjacentVertex(Vertex<V> destination, double weight)
```java
public void addAdjacentVertex(Vertex<V> destination, double weight) {
    adjacentVertices.put(destination, weight);
}
```

#### setAdjacentVertices(Map<Vertex<V>, Double> adjacentVertices)
```java
public void setAdjacentVertices(Map<Vertex<V>, Double> adjacentVertices) {
    this.adjacentVertices = adjacentVertices;
}
```

#### getAdjacentVertices()
```java
public Map<Vertex<V>, Double> getAdjacentVertices() {
    return adjacentVertices;
}
```

#### toString()
```java
@Override
public String toString() {
    return String.valueOf(data);
}
```

### Test.java

The `Test` class provides a sample usage of the `WeightedGraph` class. It creates a graph, adds vertices, adds edges, and prints the graph.

### Search.java

The `Search` interface defines the contract for different graph traversal algorithms. It contains a single method `traverse(WeightedGraph<V> graph, V start)`.

### Edge.java

The `Edge` class represents an edge between two vertices with a weight. It has the following methods:

#### Edge(V sourceVertex, V destinationVertex, double weight)
```java
public Edge(V sourceVertex, V destinationVertex, double weight) {
    this.sourceVertex = sourceVertex;
    this.destinationVertex = destinationVertex;
    this.weight = weight;
}
```

#### getSourceVertex()
```java
public V getSourceVertex() {
    return sourceVertex;
}
```

#### setSourceVertex(V sourceVertex)
```java
public void setSourceVertex(V sourceVertex) {
    this.sourceVertex = sourceVertex;
}
```

#### getDestinationVertex()
```java
public V getDestinationVertex() {
    return destinationVertex;
}
```

#### setDestinationVertex(V destinationVertex)
```java
public void setDestinationVertex(V destinationVertex) {
    this.destinationVertex = destinationVertex;
}
```

#### getWeight()
```java
public double getWeight() {
    return weight;
}
```

#### setWeight(double weight)
```java
public void setWeight(double weight) {
    this.weight = weight;
}
```

#### toString()
```java
@Override
public String toString() {
    return "(" + sourceVertex + " -> " + destinationVertex + " : " + weight + ")";
}
```

### DijkstraSearch.java

The `DijkstraSearch` class implements the `Search` interface and provides an implementation of Dijkstra's algorithm.
```

Please note that these code snippets are meant to give you an idea of the structure and functionality of the program. They may not be complete or runnable on their own. Make sure to integrate them into your existing codebase appropriately.
