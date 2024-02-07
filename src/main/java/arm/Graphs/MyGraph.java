package arm.Graphs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph implements IMyGraph{
    String name;
    Map<GNode, List<GEdges>> graph;
    public MyGraph(String name){
        this.name = name;
        graph = new HashMap<>();
    }

    @Override
    public int getNumberOfVertices() {
        return 0;
    }

    @Override
    public GNode[] getVertices() {
        return new GNode[0];
    }

    @Override
    public int getNumberOfEdges() {
        return 0;
    }

    @Override
    public GEdges[] getEdges() {
        return new GEdges[0];
    }

    @Override
    public GEdges getEdge(GNode source, GNode destination) {
        return null;
    }

    @Override
    public int outDegree(GNode node) {
        return 0;
    }

    @Override
    public int inDegree(GNode node) {
        return 0;
    }

    @Override
    public GEdges[] outgoingEdges(GNode node) {
        return new GEdges[0];
    }

    @Override
    public GEdges[] incomingEdges(GNode node) {
        return new GEdges[0];
    }

    @Override
    public GNode[] adjacentVertices(GNode node) {
        return new GNode[0];
    }

    @Override
    public GEdges[] insertEdge(GNode source, GNode destination, int weight) {
        return new GEdges[0];
    }

    @Override
    public void removeVertex(GNode node) {

    }

    @Override
    public void removeEdge(GEdges edge) {

    }
}
