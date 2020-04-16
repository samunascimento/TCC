/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome.model;

/**
 *
 * @author Principal
 */
public class ClassMethod {
    
    private int classId;
    private int methodId;
    
        /**
     * @return the classId
     */
    public int getClassId() {
        return classId;
    }

    /**
     * @param classId the classId to set
     */
    public void setClassId(int classId) {
        this.classId = classId;
    }

    /**
     * @return the methodId
     */
    public int getMethodId() {
        return methodId;
    }

    /**
     * @param methodId the methodId to set
     */
    public void setMethodId(int methodId) {
        this.methodId = methodId;
    }
}
