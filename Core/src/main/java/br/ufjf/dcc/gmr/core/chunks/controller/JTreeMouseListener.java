package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.vcs.types.Chunk;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

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
        textArea.setText("");
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) view.getTree().getLastSelectedPathComponent();
        Chunk chunk = (Chunk) selectedNode.getUserObject();
        for (String content : chunk.getContent()) {
            textArea.setText(textArea.getText() + content + "\n");
        }
    }
}
