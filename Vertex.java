import java.util.HashMap;
import java.util.Map;

public class Vertex<V> {
    private Map<Vertex<V>, Double> adjacentVertices;
    private V data;
    
    public Vertex(V data) {
      this.data = data;
      this.adjacentVertices = new HashMap<>();
  }

  public V getData() {
      return data;
  }

  public void addAdjacentVertex(Vertex<V> destination, double weight) {
      adjacentVertices.put(destination, weight);
  }

  public void setAdjacentVertices(Map<Vertex<V>, Double> adjacentVertices) {
      this.adjacentVertices = adjacentVertices;
  }

  public Map<Vertex<V>, Double> getAdjacentVertices() {
      return adjacentVertices;
  }

  @Override
  public String toString() {
      return data.toString();
  }
