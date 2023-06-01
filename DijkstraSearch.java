import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    private WeightedGraph<V> graph;
    private Map<V, Double> distance;
    private Map<V, V> parentMap;
    private Set<V> visited;

    @Override
    public List<V> traverse(WeightedGraph<V> graph, V start) {
        this.graph = graph;
        distance = new HashMap<>();
        parentMap = new HashMap<>();
        visited = new HashSet<>();

        for (V vertex : graph.getVertices()) {
            distance.put(vertex, Double.POSITIVE_INFINITY);
        }

        distance.put(start, 0.0);
        dijkstra(start);

        return getPath(start);
    }

    private void dijkstra(V current) {
        PriorityQueue<VertexEntry> pq = new PriorityQueue<>();
        pq.offer(new VertexEntry(current, 0.0));

        while (!pq.isEmpty()) {
            VertexEntry entry = pq.poll();
            V vertex = entry.vertex;
            double dist = entry.distance;

            if (visited.contains(vertex)) {
                continue;
            }

            visited.add(vertex);

            List<Edge<V>> edges = graph.getEdges(vertex);
            for (Edge<V> edge : edges) {
                V destination = edge.getDes();
                double newDistance = dist + edge.getWeight();
                if (newDistance < distance.get(destination)) {
                    distance.put(destination, newDistance);
                    parentMap.put(destination, vertex);
                    pq.offer(new VertexEntry(destination, newDistance));
                }
            }
        }
    }

    private List<V> getPath(V start) {
        List<V> path = new ArrayList<>();
        V current = start;

        while (parentMap.containsKey(current)) {
            path.add(current);
            current = parentMap.get(current);
        }

        Collections.reverse(path);
        return path;
    }

    private class VertexEntry implements Comparable<VertexEntry> {
        private V vertex;
        private double distance;

        public VertexEntry(V vertex, double distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(VertexEntry other) {
            return Double.compare(this.distance, other.distance);
        }
    }
}
