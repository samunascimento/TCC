package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.*;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;
import java.awt.BorderLayout;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JFrame;

public class Main {

    private static GlobalEnviroment parent1;
    private static GlobalEnviroment parent2;
    private static List<ConflictChunk> conflictChunkList;
    private static Set<String> paths1;
    private static Set<String> paths2;
    private static DependencyMatrix dependencyMatrix;

    public Main(GlobalEnviroment parent1, GlobalEnviroment parent2, List<ConflictChunk> conflictChunkList, Set paths1, Set paths2) {
        Main.parent1 = parent1;
        Main.parent2 = parent2;
        Main.conflictChunkList = conflictChunkList;
        Main.paths1 = paths1;
        Main.paths2 = paths2;
        Main.dependencyMatrix = new DependencyMatrix(conflictChunkList.size());
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
        List<DependencyType> A, B, C, D;

        int id = 0, line = 0, row = 0;
        for (Vertex verticeA : vertices) {
            for (Vertex verticeB : vertices) {
                
                
                if (!verticeA.equals(verticeB)) {
                    List<DependencyType> concat = new ArrayList<>();
                    //VerticeA's ChunkVersionOne dependencies check with VerticeB Chunks
                    A = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion1(), verticeB.getConflictChunk().getChunkVersion1());
                    B = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion1(), verticeB.getConflictChunk().getChunkVersion2());

                    //VerticeA's ChunkVersionTwo  dependencies check with VerticeB Chunks
                    C = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion2(), verticeB.getConflictChunk().getChunkVersion1());
                    D = verifyChunksDependencies(verticeA.getConflictChunk().getChunkVersion2(), verticeB.getConflictChunk().getChunkVersion2());

                    if (!A.get(0).equals(DependencyType.NO_DEPENDENCY)) {
                        concat = A;
                    }
                    if (!B.get(0).equals(DependencyType.NO_DEPENDENCY) && concat.size() < 3) {
                        for (DependencyType dependencyType : B) {
                            if (!concat.contains(dependencyType)) {
                                concat.add(dependencyType);
                            }
                        }
                    }

                    if (!C.get(0).equals(DependencyType.NO_DEPENDENCY) && concat.size() < 3) {
                        for (DependencyType dependencyType : C) {
                            if (!concat.contains(dependencyType)) {
                                concat.add(dependencyType);
                            }
                        }
                    }

                    if (!D.get(0).equals(DependencyType.NO_DEPENDENCY) && concat.size() < 3) {
                        for (DependencyType dependencyType : D) {
                            if (!concat.contains(dependencyType)) {
                                concat.add(dependencyType);
                            }
                        }
                    }

                    //if last one versionChunk are dependencies with verticeB versionchunks, we create a edge between both
                    if (!A.get(0).equals(DependencyType.NO_DEPENDENCY)
                            || !B.get(0).equals(DependencyType.NO_DEPENDENCY)
                            || !C.get(0).equals(DependencyType.NO_DEPENDENCY)
                            || !D.get(0).equals(DependencyType.NO_DEPENDENCY)) {
                        Edge edge = new Edge();
                        edge.setId(id);
                        id++;
                        graph.addEdge(edge, verticeA, verticeB, EdgeType.DIRECTED);
                        dependencyMatrix.getMatrix()[row][line] = concat;
                    }

                }
                line++;
            }
            row++;
            line=0;
        }
        System.out.println(dependencyMatrix);
    }

    public static List<DependencyType> verifyChunksDependencies(Chunk chunkA, Chunk chunkB) {

        List<BaseBinding> sourceBinding = new ArrayList<>();
        List<BaseBinding> targetBinding = new ArrayList<>();
        List<DependencyType> list = new ArrayList<>();
        sourceBinding = chunkA.getLanguageConstruct();
        targetBinding = chunkB.getLanguageConstruct();

        if (Dependencies.atributeDependsOn(sourceBinding, targetBinding).equals(DependencyType.ATRIBUTE_USAGE_DECLARATION)) {
            list.add(DependencyType.ATRIBUTE_USAGE_DECLARATION);
        }
        if (Dependencies.methodDependsOn(sourceBinding, targetBinding).equals(DependencyType.METHOD_CALL_DECLARATION)) {
            list.add(DependencyType.METHOD_CALL_DECLARATION);
        }
        if (Dependencies.variableDependsOn(sourceBinding, targetBinding).equals(DependencyType.VARIABLE_USAGE_DECLARATION)) {
            list.add(DependencyType.VARIABLE_USAGE_DECLARATION);
        }
        if (list.isEmpty()) {
            list.add(DependencyType.NO_DEPENDENCY);
        }
        return list;
    }
}
