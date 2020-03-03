package br.ufjf.dcc.gmr.core.JFrame;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class TestFrame extends JFrame{
    JPanel mainPanel;
    JFileChooser chooser; 
    JTable table;
    DefaultTableModel newTable = new DefaultTableModel();
    
    private void Table(){
        JPanel tablePanel = new JPanel();
        newTable.addColumn("Name");
        newTable.addColumn("Status");
        table = new JTable(newTable);
        table.setSize(500, 250);
        tablePanel.add(table, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.EAST);
        this.add(mainPanel);
        this.setVisible(true);  
    }
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
    public void setPanel(){
        panelConfig();
        Chooser();
        Table();
    }
    
    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {
        File file = chooser.getSelectedFile().getAbsoluteFile();
        //JTable.setText(file.getPath());

    }
    public static void main(String[] args) {
        TestFrame frame = new TestFrame();
        frame.setPanel();
        frame.setVisible(true);
    }
}   
