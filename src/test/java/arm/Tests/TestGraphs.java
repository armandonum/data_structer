package arm.Tests;

import arm.Graphs.MyGraph;
import arm.Graphs.GNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestGraphs {

    @Test
    public void testGetNumberOfVertices() {
        MyGraph graph = new MyGraph();
        Assertions.assertEquals(0, graph.getNumberOfVertices(), "Error in getNumberOfVertices()");
    }

    @Test
    public void testGetNumberOfEdges() {
        MyGraph graph = new MyGraph();
        Assertions.assertEquals(0, graph.getNumberOfEdges(), "Error in getNumberOfEdges()");
    }

    @Test
    public void testGetVertices() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(node1, graph.getVertices()[0], "Error in getVertices()");
    }

    @Test
    public void testInsertNode() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(1, graph.getNumberOfVertices(), "Error in insertNode()");
    }

    @Test
    public void testInsertEdge() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        graph.insertNode(node1);
        graph.insertNode(node2);
        graph.insertEdge(node1, node2, 1);
        Assertions.assertEquals(1, graph.getNumberOfEdges(), "Error in insertEdge()");
    }

    @Test
    public void testGetEdge() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        graph.insertNode(node1);
        graph.insertNode(node2);
        graph.insertEdge(node1, node2, 1);
        assertNotNull(graph.getEdge(node1, node2), "Error in getEdge()");
    }

    @Test
    public void testOutDegree() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(0, graph.outDegree(node1), "Error in outDegree()");
    }

    @Test
    public void testInDegree() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(0, graph.inDegree(node1), "Error in inDegree()");
    }

    @Test
    public void testOutgoingEdges() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(0, graph.outgoingEdges(node1).length, "Error in outgoingEdges()");
    }

    @Test
    public void testIncomingEdges() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(0, graph.incomingEdges(node1).length, "Error in incomingEdges()");
    }

    @Test
    public void testAdjacentVertices() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        Assertions.assertEquals(0, graph.adjacentVertices(node1).length, "Error in adjacentVertices()");
    }

    @Test
    public void testRemoveVertex() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        graph.insertNode(node1);
        graph.removeVertex(node1);
        Assertions.assertEquals(0, graph.getNumberOfVertices(), "Error in removeVertex()");
    }

    @Test
    public void testRemoveEdge() {
        MyGraph graph = new MyGraph();
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        graph.insertNode(node1);
        graph.insertNode(node2);
        graph.insertEdge(node1, node2, 1);
        graph.removeEdge(graph.getEdge(node1, node2));
        Assertions.assertEquals(0, graph.getNumberOfEdges(), "Error in removeEdge()");
    }
}