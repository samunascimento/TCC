package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.ConflictChunk;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.graph.util.EdgeType;
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
    private static List<ConflictChunk> chunks;
    private static Set<String> paths;

    public Main(GlobalEnviroment globalEnviroment, List<ConflictChunk> chunks, Set paths) {
        Main.globalEnviroment = globalEnviroment;
        this.chunks = chunks;
        Main.paths = paths;
    }

    public static void main(String[] args) {
        Graph<Vertex, Edge> graph = new DirectedSparseMultigraph<>();
        addGraphVertices(graph);
        addEdges(graph);
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

        for (ConflictChunk chunk : chunks) {
            graph.addVertex(new Vertex(chunk.getFilePath(), Main.globalEnviroment.getEnviroment().get(chunk.getFilePath()), chunk));
        }

    }

    private static void addEdges(Graph graph) {

        Collection<Vertex> vertices = graph.getVertices();
        List<BaseBinding> sourceBinding = new ArrayList<>();
        List<BaseBinding> targetBinding = new ArrayList<>();;
        int id = 0;
        for (Vertex verticeA : vertices) {
            for (Vertex verticeB : vertices) {
                if (!verticeA.equals(verticeB)) {
                    
                    sourceBinding = verticeA.getConflictChunk().getLanguageConstructBindings();
                    targetBinding = verticeB.getConflictChunk().getLanguageConstructBindings();
                    
                    if(Dependencies.atributeDependsOn(sourceBinding, targetBinding) || Dependencies.methodDependsOn(sourceBinding, targetBinding) || Dependencies.variableDependsOn(sourceBinding, targetBinding)){
                        Edge edge = new Edge();
                        edge.setId(id);
                        id++;                        
                        graph.addEdge(edge, verticeA, verticeB, EdgeType.DIRECTED);
                    }

                }
            }
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
