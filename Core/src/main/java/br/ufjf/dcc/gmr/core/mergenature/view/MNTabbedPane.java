package br.ufjf.dcc.gmr.core.mergenature.view;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JTabbedPane;

/**
 * Custom JTabbedPane
 *
 * @author João Pedro Lima
 * @since 05-01-2021
 */
public class MNTabbedPane extends JTabbedPane {

    public MNTabbedPane() {

    }
    
    public void addRemovableTab(String title, Icon icon, Component component, String tip){
        this.addTab(title, icon, component, tip);
        this.setTabComponentAt(this.indexOfComponent(component), new RemovableTabTitle(this, component, title));
    }
    
}
