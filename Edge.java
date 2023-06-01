public class Edge<V> {
    private V sourceVertex;
    private V destinationVertex;
    private double weight;

    public Edge(V sourceVertex, V destinationVertex, double weight) {
        this.sourceVertex = sourceVertex;
        this.destinationVertex = destinationVertex;
        this.weight = weight;
    }

    public V getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(V sourceVertex) {
        this.sourceVertex = sourceVertex;
    }

    public V getDestinationVertex() {
        return destinationVertex;
    }

    public void setDestinationVertex(V destinationVertex) {
        this.destinationVertex = destinationVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + sourceVertex + " -> " + destinationVertex + ", weight: " + weight + ")";
    }
}
