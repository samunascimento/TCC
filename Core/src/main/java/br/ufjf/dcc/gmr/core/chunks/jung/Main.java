package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.ConflictChunk;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Paint;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.*;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;

public class Main {

    private static GlobalEnviroment globalEnviroment;
    private static List<ConflictChunk> conflictChunkList;
    private static Set<String> paths;

    public Main(GlobalEnviroment globalEnviroment, List<ConflictChunk> conflictChunkList, Set paths) {
        Main.globalEnviroment = globalEnviroment;
        this.conflictChunkList = conflictChunkList;
        Main.paths = paths;
    }

    public static void main(String[] args) {
        Graph<Vertex, Edge> graph = new DirectedSparseMultigraph<>();
        addGraphVertices(graph);
        addEdges(graph);
        JFrame frame = new JFrame();

        frame.setLayout(new BorderLayout());
        VisualizationViewer vv = new VisualizationViewer(new CircleLayout(graph), new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 40), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 40));

        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());

        DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);

        vv.getRenderer().getVertexLabelRenderer().setPosition(Position.S);

        frame.getContentPane().add(vv, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);

    }

    private static void addGraphVertices(Graph graph) {

        for (ConflictChunk conflictChunk : conflictChunkList) {
            graph.addVertex(new Vertex(conflictChunk));
        }

    }

    private static void addEdges(Graph graph) {

        Collection<Vertex> vertices = graph.getVertices();
        boolean A,B,C,D;
        
        int id = 0;
        for (Vertex verticeA : vertices) {
            for (Vertex verticeB : vertices) {
                if (!verticeA.equals(verticeB)) {

                    //VerticeA's ChunkVersionOne dependencies check with VerticeB Chunks
                    A = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion1(),verticeB.getConflictChunk().getChunkVersion1());
                    B = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion1(),verticeB.getConflictChunk().getChunkVersion2());
                    
                    //VerticeA's ChunkVersionTwo  dependencies check with VerticeB Chunks
                    C = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion2(),verticeB.getConflictChunk().getChunkVersion1());
                    D = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion2(),verticeB.getConflictChunk().getChunkVersion2());
                    
                    //if last one versionChunk are dependencies with verticeB versionchunks, we create a edge between both
                    if ( A || B || C || D) {
                        Edge edge = new Edge();
                        edge.setId(id);
                        id++;
                        graph.addEdge(edge, verticeA, verticeB, EdgeType.DIRECTED);
                    }

                }
            }
        }

    }

    public static boolean verifyChunksDependencies(Chunk chunkA, Chunk chunkB) {

        List<BaseBinding> sourceBinding = new ArrayList<>();
        List<BaseBinding> targetBinding = new ArrayList<>();

        sourceBinding = chunkA.getLanguageConstruct();
        targetBinding = chunkB.getLanguageConstruct();

        if(Dependencies.atributeDependsOn(sourceBinding, targetBinding)||
            Dependencies.methodDependsOn(sourceBinding, targetBinding) ||
                Dependencies.variableDependsOn(sourceBinding, targetBinding)){
            return true;
        }

        return false;

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
