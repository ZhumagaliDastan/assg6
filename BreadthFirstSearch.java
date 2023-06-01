import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch<V> implements Search<V> {
    private List<V> visit;

    @Override
    public List<V> traverse(WeightedGraph<V> graph, V start) {
        visit = new ArrayList<>();
        Set<V> visited = new HashSet<>();
        Queue<V> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);

        bfs(graph, visited, queue);

        return visit;
    }

    private void bfs(WeightedGraph<V> graph, Set<V> visited, Queue<V> queue) {
        while (!queue.isEmpty()) {
            V current = queue.poll();
            visit.add(current);

            List<Edge<V>> edges = graph.getEdges(current);
            for (Edge<V> edge : edges) {
                V des = edge.getDes();
                if (!visited.contains(des)) {
                    visited.add(des);
                    queue.offer(des);
                }
            }
        }
    }
}
