
package br.ufjf.dcc.gmr.core.chunks.jung;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import java.awt.BorderLayout;
import java.awt.Dimension;
import static java.awt.Frame.*;
import javax.swing.*;

public class Jung {
    public static void main(String[] args) {
        DirectedSparseGraph<String, ?> g = new DirectedSparseGraph<String, Object>();
        g.addVertex("ROOT");
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        VisualizationImageServer vv = new VisualizationImageServer(new CircleLayout(g), new Dimension(350, 300));  
        vv.setLayout(new BorderLayout());

        JFrame frame = new JFrame("First step");
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(vv, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
