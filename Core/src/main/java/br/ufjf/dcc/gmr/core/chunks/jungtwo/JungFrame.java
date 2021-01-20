 
package br.ufjf.dcc.gmr.core.chunks.jungtwo;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import java.util.*;
import javax.swing.JFrame;


public class JungFrame {
    
        private Graph<Vertex,Edge> graph;
        private List<ConflictChunk> conflictChunk;
        
        public JungFrame(){
            this.graph = new DirectedSparseMultigraph<Vertex, Edge>();
            this.conflictChunk = new ArrayList<>();
        }
        
        public void paintJung(){
            Layout< Vertex, Edge > layout = new FRLayout<Vertex, Edge>(this.graph);
            layout.setSize(new Dimension(300,300)); 
            BasicVisualizationServer<Vertex, Edge> visualization = new BasicVisualizationServer<>(layout);
            addVertex();
            
            if(conflictChunk.size()<=6)
                visualization.setPreferredSize(new Dimension(750,350)); 
            else if(conflictChunk.size()>6&&conflictChunk.size()<=20)
                visualization.setPreferredSize(new Dimension(750,750));
            else
                 visualization.setPreferredSize(new Dimension(1000,1000));
            
            visualization.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
            visualization.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
            JFrame frame = new JFrame("Simple Graph View");
            frame.getContentPane().add(visualization);
            frame.pack();
            frame.setVisible(true);
        }
        
        public void addVertex(){
            for (ConflictChunk conflictChunk : this.conflictChunk) {
                graph.addVertex(new Vertex(conflictChunk.getLabel()));
            }

        }
    
        public static void main(String[] args) {
             
              System.out.println("executando");
        }
}