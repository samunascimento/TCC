package br.ufjf.dcc.gmr.core.chunks.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import javax.swing.*;

public class Frames {

    private JFrame mainFrame;
    private JPanel contentPane;

    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;

    public Frames() {
        this.mainFrame = new JFrame();
        this.contentPane = new JPanel();
        this.contentPane.setBackground(Color.cyan);
        this.leftPanel = new JPanel();
        this.rightPanel = new JPanel();
        this.topPanel = new JPanel();
        this.bottomPanel = new JPanel();
    }

    private void paintPanel() {
        //setting atributs
        getTopPanel().setPreferredSize(new Dimension((int) getContentPane().getPreferredSize().getWidth() - 20, 30));
        getTopPanel().setBackground(Color.red);

        getBottomPanel().setPreferredSize(new Dimension((int) getContentPane().getPreferredSize().getWidth() - 20, 50));
        getBottomPanel().setBackground(Color.blue);

        getLeftPanel().setPreferredSize(new Dimension(300, (int) getContentPane().getPreferredSize().getHeight()
                - (int) getTopPanel().getPreferredSize().getHeight() - (int) getBottomPanel().getPreferredSize().
                getHeight() - 85));
        getLeftPanel().setBackground(Color.green);

        getRightPanel().setPreferredSize(new Dimension(((int) getContentPane().getPreferredSize().getWidth()
                - (int) getLeftPanel().getPreferredSize().getWidth())- 20, (int) getLeftPanel().getPreferredSize().
                getHeight()));
        getRightPanel().setBackground(Color.yellow);

        //adding panels to contentPane
        getContentPane().add(getTopPanel(), BorderLayout.PAGE_START);
        getContentPane().add(getBottomPanel(), BorderLayout.PAGE_END);
        getContentPane().add(getLeftPanel(), BorderLayout.WEST);
        getContentPane().add(getRightPanel(), BorderLayout.EAST);

    }

    public static void main(String[] args) {
        Frames frames = new Frames();
        JFrame mainFrame = frames.getMainFrame();
        JPanel contentPanel = frames.getContentPane();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(MAXIMIZED_BOTH);
        mainFrame.setContentPane(contentPanel);
        mainFrame.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        contentPanel.setPreferredSize(mainFrame.getPreferredSize());
        frames.paintPanel();
        mainFrame.setVisible(true);
    }

    /**
     * @return the mainFrame
     */
    public JFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * @param mainFrame the mainFrame to set
     */
    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    /**
     * @return the contentPane
     */
    public JPanel getContentPane() {
        return contentPane;
    }

    /**
     * @param contentPane the contentPane to set
     */
    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }

    /**
     * @return the bottomPanel
     */
    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    /**
     * @return the leftPanel
     */
    public JPanel getLeftPanel() {
        return leftPanel;
    }

    /**
     * @return the rightPanel
     */
    public JPanel getRightPanel() {
        return rightPanel;
    }

    /**
     * @return the topPanel
     */
    public JPanel getTopPanel() {
        return topPanel;
    }

    /**
     * @param bottomPanel the bottomPanel to set
     */
    public void setBottomPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
    }

    /**
     * @param leftPanel the leftPanel to set
     */
    public void setLeftPanel(JPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    /**
     * @param rightPanel the rightPanel to set
     */
    public void setRightPanel(JPanel rightPanel) {
        this.rightPanel = rightPanel;
    }

    /**
     * @param topPanel the topPanel to set
     */
    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }
}
