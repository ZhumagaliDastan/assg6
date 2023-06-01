import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        WeightedGraph<Vertex<Integer>> graph = new WeightedGraph<>();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
      
        while (!exit) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add vertex\n2. Add edge\n3. Print graph\n4. Breadth-First Search\n5. Dijkstra's Algorithm");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter vertex value:");
                    int vertexValue = scanner.nextInt();
                    Vertex<Integer> vertex = new Vertex<>(vertexValue);
                    graph.addVertex(vertex);
                    System.out.println("Vertex added.");
                    break;

                case 2:
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
                    break;

                case 3:
                    System.out.println("Graph:");
                    graph.printGraph();
                    break;

                case 4:
                    System.out.println("Enter starting vertex value for Breadth-First Search:");
                    int startBFSValue = scanner.nextInt();
                    Vertex<Integer> startBFS = new Vertex<>(startBFSValue);
                    BreadthFirstSearch<Vertex<Integer>> bfs = new BreadthFirstSearch<>();
                    System.out.println("Breadth-First Search traversal:");
                    System.out.println(bfs.traverse(graph, startBFS));
                    break;

                case 5:
                    System.out.println("Enter starting vertex value for Dijkstra's Algorithm:");
                    int startDijkstraValue = scanner.nextInt();
                    Vertex<Integer> startDijkstra = new Vertex<>(startDijkstraValue);
                    DijkstraSearch<Vertex<Integer>> dijkstra = new DijkstraSearch<>();
                    System.out.println("Dijkstra's Algorithm traversal:");
                    System.out.println(dijkstra.traverse(graph, startDijkstra));
                    break;

                case 6:
                    exit = true;
                    break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println();
    }

    System.out.println("Goodbye!");
}
