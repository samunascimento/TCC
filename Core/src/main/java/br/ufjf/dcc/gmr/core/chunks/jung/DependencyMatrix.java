package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.DependencyType;
import java.util.ArrayList;
import java.util.List;

public class DependencyMatrix {


    private List<DependencyType>[][] matrix;
    private int size;
    public DependencyMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.matrix[i][j] = new ArrayList<>();
            }
        }
        this.size = size;
    }
    
    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += "| ";
            for (int j = 0; j < size; j++) {
                string += matrix[i][j].toString() + " |";
            }
            string += "\n";
        }
        return string;
    }
    
    public List<DependencyType>[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(List<DependencyType>[][] matrix) {
        this.matrix = matrix;
    }

}
