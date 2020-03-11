package br.ufjf.dcc.gmr.core.JFrame;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Beatr
 */
public class View extends JFrame {

    JPanel tableChooserPanel;
    JPanel textPanel;
    JScrollPane tableChooserScrollPane;
    JTable table;
    private JTextArea textArea;
    JFileChooser chooser;
    JProgressBar progressBar;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem submenu;
    InitProject initProject;
    Project project;

    View() {
        tableChooserPanel = new JPanel();
        textPanel = new JPanel();
        chooser = new JFileChooser();
        menuBar = new JMenuBar();
        menu = new JMenu();
        table = new JTable();
        textArea = new JTextArea();
        progressBar = new JProgressBar();
        tableChooserScrollPane = new JScrollPane();
        submenu = new JMenuItem();
        initProject = new InitProject();
        project = new Project();
    }

    private void setTableChooserPanel() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableChooserPanel.setLayout(new BorderLayout());
        tableChooserPanel.setBorder(BorderFactory.createTitledBorder("CHOOSER & TABLE"));
        tableChooserPanel.setPreferredSize(new Dimension(350, Short.MAX_VALUE));

    }

    private void setTextPanel() {
        textPanel.setLayout(new BorderLayout());
        textPanel.setBorder(BorderFactory.createTitledBorder("TEXT"));
    }

    private void setChooser() {
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File(""));
        chooser.setRequestFocusEnabled(false);
        chooser.addActionListener(this::chooserActionPerformed);
        chooser.setVisible(false);
        tableChooserPanel.add(chooser, BorderLayout.NORTH);
    }

    private void setTable() {
        table.setAutoCreateRowSorter(true);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn("sha");
        model.addColumn("status");
        for (int i = 30, j = 0; i >= 0; i--, j++) {
            model.insertRow(0, new Object[]{i, j});
        }
        table.setModel(model);
    }

    private void setMenuBar() {
        submenu.addActionListener(this::openRepository);
        submenu.setText("Open Repository");
        menu.add(submenu);
        menu.setText("File");
        menuBar.setBorder(BorderFactory.createTitledBorder("MENU BAR"));
        menuBar.add(menu);
    }

    private void setTextArea() {
        getTextArea().setEditable(false);
    }

    private void setProgressBar() {
        progressBar.setPreferredSize(new Dimension(Short.MAX_VALUE, 50));
        progressBar.setBorder(BorderFactory.createTitledBorder("PROGRESS BAR"));
        progressBar.setVisible(false);
        progressBar.setFont(new java.awt.Font("Verdana", 0, 12) {
        });
        progressBar.setStringPainted(true);
    }

    private void showPanel() {
        this.add(tableChooserPanel, BorderLayout.WEST);
        this.add(textPanel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(progressBar, BorderLayout.SOUTH);
        tableChooserPanel.add(tableChooserScrollPane, BorderLayout.CENTER);
        tableChooserScrollPane.setViewportView(table);
        textPanel.add(getTextArea(), BorderLayout.CENTER);
        this.setVisible(true);
    }

    private void setMainPanel() {
        setTextPanel();
        setTableChooserPanel();
        setMenuBar();
        setChooser();
        setTable();
        setTextArea();
        setProgressBar();
        showPanel();
    }

    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {
        String filePath = chooser.getSelectedFile().getAbsoluteFile().toString();

        
        //Verificar essa solução....
        try {
            project = initProject.project(filePath, filePath);
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LocalRepositoryNotAGitRepository ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (OptionNotExist ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RepositoryNotFound ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CheckoutError ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoRemoteForTheCurrentBranch ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ThereIsNoMergeInProgress ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotSomethingWeCanMerge ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ThereIsNoMergeToAbort ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyUpToDate ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

        progressBar.setVisible(true);
        Thread run = new Thread(new ProgressBarAction(progressBar));
        chooser.setVisible(false);
        run.start();
    }

    private void openRepository(java.awt.event.ActionEvent evt) {
        chooser.setVisible(true);
    }

    public static void main(String[] args) {
        View frame = new View();
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setMainPanel();
        frame.setVisible(true);
    }

    /**
     * @return the textArea
     */
    public JTextArea getTextArea() {
        return textArea;
    }

    /**
     * @param textArea the textArea to set
     */
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

}
