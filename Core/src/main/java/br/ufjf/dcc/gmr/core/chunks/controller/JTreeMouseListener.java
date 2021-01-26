package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeMouseListener extends MouseAdapter {

    private View view;
    private Version version;
    private JTextArea textArea;

    public JTreeMouseListener(View view, Version version) {
        this.view = view;
        this.version = version;
        this.textArea = view.getTextArea();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        getTextArea().setText("");
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) getView().getTree().getLastSelectedPathComponent();
        if (selectedNode != null) {
            ConflictChunk chunk = null;
            try {
                List<String> afterContext = chunk.getAfterContext().getText();
                List<String> beforeContext = chunk.getBeforeContext().getText();
                chunk = (ConflictChunk) selectedNode.getUserObject();
                for(int i = view.getContextLines(); i > 0; i--){
                    String content = afterContext.get(i);
                    getTextArea().setText(getTextArea().getText() + content + "\n");
                }
                for (String content : chunk.getErrorContent()) {
                    getTextArea().setText(getTextArea().getText() + content + "\n");
                }
                for(int i = 0; i < view.getContextLines(); i++){
                    String content = beforeContext.get(i);
                    getTextArea().setText(getTextArea().getText() + content + "\n");
                }
            } catch (Exception e) {
                //when the selected node is not a chunck
            }

        }
    }

    /**
     * @return the textArea
     */
    public JTextArea getTextArea() {
        return textArea;
    }

    /**
     * @return the version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param textArea the textArea to set
     */
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }
}
