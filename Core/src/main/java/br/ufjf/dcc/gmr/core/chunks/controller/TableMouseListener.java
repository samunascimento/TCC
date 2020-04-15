package br.ufjf.dcc.gmr.core.chunks.controller;

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
        Version version = getView().getProject().getVersions().get(row);
        getView().paintTree(version);

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
