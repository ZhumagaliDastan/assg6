# Weighted Graph Implementation

This Java code provides an implementation of a weighted graph data structure. It allows you to add vertices, add edges between vertices with weights, and perform various graph operations like printing the graph, performing breadth-first search, and Dijkstra's algorithm.

## Classes and Methods

### Main.java

The `Main` class contains the main entry point of the program. It allows the user to interact with the graph by choosing from a menu of options:

- `addVertex()`: Prompts the user to enter a vertex value and adds it to the graph.
- `addEdge()`: Prompts the user to enter source and destination vertex values along with the weight, and adds an edge between them in the graph.
- `printGraph()`: Prints the graph, showing vertices and their associated edges.
- `BreadthFirstSearch()`: Prompts the user to enter a starting vertex value and performs a breadth-first search traversal on the graph.
- `DijkstraSearch()`: Prompts the user to enter a starting vertex value and performs Dijkstra's algorithm traversal on the graph.
- `exit`: Exits the program.

### WeightedGraph.java

The `WeightedGraph` class represents a weighted graph. It contains the following methods:

- `addVertex(Vertex vertex)`: Adds a vertex to the graph.
- `getVertices()`: Returns a set of all vertices in the graph.
- `addEdge(Vertex source, Vertex destination, double weight)`: Adds an edge between two vertices with the given weight.
- `getEdges(Vertex vertex)`: Returns a list of all edges adjacent to the given vertex.
- `printGraph()`: Prints the graph, displaying each vertex and its associated edges.

### Vertex.java

The `Vertex` class represents a vertex in the graph. It has the following methods:

- `Vertex(V data)`: Creates a vertex with the given data.
- `getData()`: Returns the data associated with the vertex.
- `addAdjacentVertex(Vertex<V> destination, double weight)`: Adds an adjacent vertex with the given weight.
- `setAdjacentVertices(Map<Vertex<V>, Double> adjacentVertices)`: Sets the adjacent vertices for the vertex.
- `getAdjacentVertices()`: Returns a map of the adjacent vertices and their weights.
- `toString()`: Returns a string representation of the vertex.

### Test.java

The `Test` class provides a sample usage of the `WeightedGraph` class. It creates a graph, adds vertices, adds edges, and prints the graph.

### Search.java

The `Search` interface defines the contract for different graph traversal algorithms. It contains a single method `traverse(WeightedGraph<V> graph, V start)`.

### Edge.java

The `Edge` class represents an edge between two vertices with a weight. It has the following methods:

- `Edge(V sourceVertex, V destinationVertex, double weight)`: Creates an edge with the given source vertex, destination vertex, and weight.
- `getSourceVertex()`: Returns the source vertex of the edge.
- `setSourceVertex(V sourceVertex)`: Sets the source vertex of the edge.
- `getDestinationVertex()`: Returns the destination vertex of the edge.
- `setDestinationVertex(V destinationVertex)`: Sets the destination vertex of the edge.
- `getWeight()`: Returns the weight of the edge.
- `setWeight(double weight)`: Sets the weight of the edge.
- `toString()`: Returns a string representation of the edge.

### DijkstraSearch.java

The `DijkstraSearch` class implements the `Search` interface and provides an implementation of Dijkstra's
