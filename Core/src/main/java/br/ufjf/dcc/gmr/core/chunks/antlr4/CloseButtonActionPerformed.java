package br.ufjf.dcc.gmr.core.chunks.antlr4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CloseButtonActionPerformed implements ActionListener{

    private List<JCheckBox> checkBoxList;
    private List<Boolean> booleanReturnList;
    private JFrame frame;
    private boolean reachEnd;
    
    public CloseButtonActionPerformed(List<JCheckBox> checkBoxList, List<Boolean> booleanReturnList, JFrame frame, boolean reachEnd){
        this.checkBoxList = checkBoxList;
        this.booleanReturnList = booleanReturnList;
        this.frame = frame;
        this.reachEnd = reachEnd;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        for (JCheckBox jCheckBox : checkBoxList) {
            if(jCheckBox.isSelected()){
                booleanReturnList.add(true);
            }else{
                booleanReturnList.add(false);
            }
        }
        this.reachEnd = true;
        ParserJava.setReachedEnd(true);
        this.frame.dispose();
        
    }

    /**
     * @return the booleanReturnList
     */
    public List<Boolean> getBooleanList() {
        return booleanReturnList;
    }

    /**
     * @return the returnList
     */
    public List<JCheckBox> getReturnList() {
        return checkBoxList;
    }

    /**
     * @param booleanList the booleanReturnList to set
     */
    public void setBooleanList(List<Boolean> booleanList) {
        this.booleanReturnList = booleanList;
    }

    /**
     * @param returnList the returnList to set
     */
    public void setReturnList(List<JCheckBox> returnList) {
        this.checkBoxList = returnList;
    }

    /**
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * @return the reachEnd
     */
    public boolean isReachEnd() {
        return reachEnd;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * @param reachEnd the reachEnd to set
     */
    public void setReachEnd(boolean reachEnd) {
        this.reachEnd = reachEnd;
    }
    
}
