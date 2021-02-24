package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr4.ParserJava;
import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        Version version = new Version();
        String SHA = this.view.getTable().getModel().getValueAt(row, 0).toString();
        for (Version aux : getView().getProject().getVersions()) {
            if(aux.getSHA().equals(SHA)){
                version = aux;
                break;
            }
        }
        
        getView().paintTree(version);
        this.view.getTree().setVisible(true);
        
        ParserJava parserJava = new ParserJava(version, this.view.getProject().getPath());
        String[] args = null;
        try {
            parserJava.main(args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
