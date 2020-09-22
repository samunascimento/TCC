package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.ArrayList;
import java.util.*;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main {

    private static GlobalEnviroment globalEnviroment;
    private static Set<String> paths;

    public Main(GlobalEnviroment globalEnviroment, Set paths) {
        Main.globalEnviroment = globalEnviroment;
        Main.paths = paths;
    }

    public static void main(String[] args) {
        Graph<Vertex, Edge> graph = new DirectedSparseMultigraph<>();
        addGraphVertices(graph);
        JFrame frame = new JFrame();

        frame.setLayout(new BorderLayout());
        VisualizationImageServer visualizationImageServer = new VisualizationImageServer(new CircleLayout(graph), new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 40), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 40));
        visualizationImageServer.setLayout(new BorderLayout());
        frame.getContentPane().add(visualizationImageServer, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }

    private static void addGraphVertices(Graph graph) {

        for (String path : Main.paths) {
            graph.addVertex(new Vertex(path, Main.globalEnviroment.getEnviroment().get(path)));
        }

    }

    private static void addEdges(Graph graph) {

        List<Vertex> vertices = (List<Vertex>) graph.getVertices();
        for (Vertex vertice : vertices) {

        }

    }

    public static GlobalEnviroment getGlobalEnviroment() {
        return globalEnviroment;
    }

    public static void setGlobalEnviroment(GlobalEnviroment aGlobalEnviroment) {
        globalEnviroment = aGlobalEnviroment;
    }

    public static Set<String> getPaths() {
        return paths;
    }

    public static void setPaths(Set<String> aPaths) {
        paths = aPaths;
    }
}
