package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr4.ParserJava;
import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class TableMouseListener extends MouseAdapter {
    
    private View view;

    public TableMouseListener(View view) {
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int row = getView().getTable().getSelectedRow();
        if (row < 0) {
            row = 0;
        }
        Version version = getView().getProject().getVersions().get(row);
        getView().paintTree(version);
        this.view.getTree().setVisible(true);
        
        ParserJava parserJava = new ParserJava(version, this.view.getProject().getPath());
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }
}
