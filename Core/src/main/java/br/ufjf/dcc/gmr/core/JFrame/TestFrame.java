package br.ufjf.dcc.gmr.core.JFrame;


import com.sun.jmx.mbeanserver.JmxMBeanServer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class TestFrame extends JFrame{
    JPanel mainPanel;
    JFileChooser chooser; 
    JMenuBar menuBar;
    private void panelConfig() {
        this.setSize(1400, 800);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
    }
    
    private void Chooser(){
        JPanel chooserPanel = new JPanel();
        chooser = new JFileChooser();
        chooserPanel.setSize(500,250);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File("C:\\Users\\Beatr\\Desktop"));
        chooser.setRequestFocusEnabled(false);
        chooserPanel.add(chooser, BorderLayout.NORTH);
        mainPanel.add(chooserPanel, BorderLayout.WEST);
        this.add(mainPanel);
        this.setVisible(true);
    }
    private void MenuBar(){
        JPanel menuPanel = new JPanel();
        menuBar = new JMenuBar();
        menuBar.setSize(100,100);
        menuPanel.add(menuBar, BorderLayout.NORTH);
        mainPanel.add(menuPanel, BorderLayout.WEST);
        this.add(mainPanel);
        this.setVisible(true);
    }
    
   
    public void setPanel(){
        panelConfig();
        MenuBar();
        Chooser();
    }
    
    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {
        File file = chooser.getSelectedFile().getAbsoluteFile();
       
    }
    public static void main(String[] args) {
        TestFrame frame = new TestFrame();
        frame.setPanel();
        frame.setVisible(true);
    }   
    
}   
