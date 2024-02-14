package arm.Graphs;

public class GEdges {
    private String name;
    private GNode source;
    private GNode destination;
    private int weight;

    public GEdges(String name) {
        this.name = name;
    }

    public GEdges(GNode source, GNode destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public GNode getDestination() {
        return destination;
    }

    public GNode getSource() {
        return source;
    }

    public int getWeight() {
        return weight;
    }
}