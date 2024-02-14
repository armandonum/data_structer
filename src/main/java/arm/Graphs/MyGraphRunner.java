package arm.Graphs;

import arm.Graphs.GEdges;
import arm.interfaces.IRunner;
import java.util.Scanner;
public class MyGraphRunner implements IRunner {

    @Override
    public void run() {
        MyGraph graph = new MyGraph();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del nodo:");
                    String nodeName = scanner.next();
                    GNode node = new GNode(nodeName);
                    graph.insertNode(node);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del nodo de origen:");
                    String sourceName = scanner.next();
                    System.out.println("Ingrese el nombre del nodo de destino:");
                    String destinationName = scanner.next();
                    System.out.println("Ingrese el peso del borde:");
                    int weight = scanner.nextInt();
                    GNode source = new GNode(sourceName);
                    GNode destination = new GNode(destinationName);
                    graph.insertEdge(source, destination, weight);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del nodo a eliminar:");
                    String nodeNameToRemove = scanner.next();
                    GNode nodeToRemove = new GNode(nodeNameToRemove);
                    graph.removeVertex(nodeToRemove);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del nodo de origen:");
                    String sourceNameToRemove = scanner.next();
                    System.out.println("Ingrese el nombre del nodo de destino:");
                    String destinationNameToRemove = scanner.next();
                    GNode sourceToRemove = new GNode(sourceNameToRemove);
                    GNode destinationToRemove = new GNode(destinationNameToRemove);
                    GEdges edgeToRemove = graph.getEdge(sourceToRemove, destinationToRemove);
                    graph.removeEdge(edgeToRemove);
                    break;
                case 5:
                    System.out.println("Número de vértices: " + graph.getNumberOfVertices());
                    System.out.println("Número de bordes: " + graph.getNumberOfEdges());
                    System.out.println("Lista de nodos:");

                    System.out.println("Lista de bordes:");
                    for (GEdges edge : graph.getEdges()) {
                        System.out.println(edge.getSource().getName() + " -> " + edge.getDestination().getName() + " (Peso: " + edge.getWeight() + ")");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            } while (option != 6);

    }

    @Override
    public void printMenu() {
    System.out.println("1. Insertar nodo");
    System.out.println("2. Insertar borde");
    System.out.println("3. Eliminar nodo");
    System.out.println("4. Eliminar borde");
    System.out.println("5. Imprimir información del grafo");
    System.out.println("6. Salir");

    }
}