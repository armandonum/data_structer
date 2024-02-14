package arm.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph implements IMyGraph {
    private Map<GNode, List<GEdges>> graph;

    public MyGraph() {
        this.graph = new HashMap<>();
    }

    @Override
    public int getNumberOfVertices() {
        return graph.size();
    }

    @Override
    public GNode[] getVertices() {
        return graph.keySet().toArray(new GNode[0]);
    }

    @Override
    public int getNumberOfEdges() {
        int count = 0;
        for (List<GEdges> edges : graph.values()) {
            count += edges.size();
        }
        return count;
    }

    @Override
    public GEdges[] getEdges() {
        List<GEdges> allEdges = new ArrayList<>();
        for (List<GEdges> edges : graph.values()) {
            allEdges.addAll(edges);
        }
        return allEdges.toArray(new GEdges[0]);
    }

    @Override
    public GEdges getEdge(GNode source, GNode destination) {
        List<GEdges> edges = graph.get(source);
        if (edges != null) {
            for (GEdges edge : edges) {
                if (edge.getDestination().equals(destination)) {
                    return edge;
                }
            }
        }
        return null;
    }

    @Override
    public int outDegree(GNode node) {
        List<GEdges> edges = graph.get(node);
        return edges != null ? edges.size() : 0;
    }

    @Override
    public int inDegree(GNode node) {
        int count = 0;
        for (List<GEdges> edges : graph.values()) {
            for (GEdges edge : edges) {
                if (edge.getDestination().equals(node)) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public GEdges[] outgoingEdges(GNode node) {
        List<GEdges> edges = graph.get(node);
        return edges != null ? edges.toArray(new GEdges[0]) : new GEdges[0];
    }

    @Override
    public GEdges[] incomingEdges(GNode node) {
        List<GEdges> incoming = new ArrayList<>();
        for (Map.Entry<GNode, List<GEdges>> entry : graph.entrySet()) {
            for (GEdges edge : entry.getValue()) {
                if (edge.getDestination().equals(node)) {
                    incoming.add(edge);
                }
            }
        }
        return incoming.toArray(new GEdges[0]);
    }

    @Override
    public GNode[] adjacentVertices(GNode node) {
        List<GNode> adjacentNodes = new ArrayList<>();
        List<GEdges> edges = graph.get(node);
        if (edges != null) {
            for (GEdges edge : edges) {
                adjacentNodes.add(edge.getDestination());
            }
        }
        return adjacentNodes.toArray(new GNode[0]);
    }

    @Override
    public GEdges[] insertEdge(GNode source, GNode destination, int weight) {
        GEdges newEdge = new GEdges(source, destination, weight);
        List<GEdges> edges = graph.getOrDefault(source, new ArrayList<>());
        edges.add(newEdge);
        graph.put(source, edges);
        return edges.toArray(new GEdges[0]);
    }

    @Override
    public void removeVertex(GNode node) {
        graph.remove(node);
        for (List<GEdges> edges : graph.values()) {
            edges.removeIf(edge -> edge.getDestination().equals(node));
        }
    }

    @Override
    public void removeEdge(GEdges edge) {
        List<GEdges> edges = graph.get(edge.getSource());
        if (edges != null) {
            edges.remove(edge);
        }
    }

    @Override
    public void insertNode(GNode node) {
        graph.put(node, new ArrayList<>());
    }
}