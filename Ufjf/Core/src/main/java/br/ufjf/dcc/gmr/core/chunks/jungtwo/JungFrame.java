/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.jungtwo;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import javax.swing.JFrame;


public class JungFrame {
    
        private Graph<Vertex,Edge> graph;
        
        public JungFrame(){
            this.graph = new DirectedSparseMultigraph<Vertex, Edge>();
        }
        
        public void paintJung(){
            Layout< Vertex, Edge > layout = new FRLayout<Vertex, Edge>(this.graph);
            layout.setSize(new Dimension(300,300)); 

            BasicVisualizationServer<Vertex, Edge> visualization = new BasicVisualizationServer<>(layout);
            visualization.setPreferredSize(new Dimension(750,350)); 

            visualization.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
            visualization.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
            addVertex();
            JFrame frame = new JFrame("Simple Graph View");
            frame.getContentPane().add(visualization);
            frame.pack();
            frame.setVisible(true);
        }
        
        public void addVertex(){
            for(int i=0;i<7;i++){
                graph.addVertex(new Vertex("test"));
            }
        }
    
        public static void main(String[] args) {
             
              
        }
}
