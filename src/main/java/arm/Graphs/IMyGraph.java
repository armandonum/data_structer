package arm.Graphs;
import arm.Graphs.GEdges;
import arm.Graphs.GNode;

public interface IMyGraph {

    int getNumberOfVertices();

    GNode[] getVertices();

    int getNumberOfEdges();

    GEdges[] getEdges();

    GEdges getEdge(GNode source, GNode destination);

    int outDegree(GNode node);

    int inDegree(GNode node);

    GEdges[] outgoingEdges(GNode node);

    GEdges[] incomingEdges(GNode node);

    GNode[] adjacentVertices(GNode node);

    GEdges[] insertEdge(GNode source, GNode destination, int weight);

    void removeVertex(GNode node);

    void removeEdge(GEdges edge);

    void insertNode(GNode node);
}