package br.ufjf.dcc.gmr.core.chunks.antlr4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JCheckBox;

public class CheckBoxMouseListener extends MouseAdapter{
    
    private JCheckBox checkBox;
    private List<JCheckBox> checkBoxList;
    
    public CheckBoxMouseListener(JCheckBox checkBox, List<JCheckBox> checkBoxList){
        this.checkBox = checkBox;
        this.checkBoxList = checkBoxList;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.checkBox.isSelected()){
            for (JCheckBox jCheckBox : checkBoxList) {
                jCheckBox.setSelected(true);
            }
        }else{
            for (JCheckBox jCheckBox : checkBoxList) {
                jCheckBox.setSelected(false);
            }
        }
    }

    /**
     * @return the checkBox
     */
    public JCheckBox getCheckBox() {
        return checkBox;
    }

    /**
     * @return the checkBoxList
     */
    public List<JCheckBox> getCheckBoxList() {
        return checkBoxList;
    }

    /**
     * @param checkBox the checkBox to set
     */
    public void setCheckBox(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }

    /**
     * @param checkBoxList the checkBoxList to set
     */
    public void setCheckBoxList(List<JCheckBox> checkBoxList) {
        this.checkBoxList = checkBoxList;
    }
    
}
