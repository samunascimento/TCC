/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

/**
 *
 * @author antonio henrique
 */
public class PackageMetrics {
    private int Abstractness;
    private int classCategoricalRelationalCohesion;
    private int afferentCoupling;
    private int efferentCoupling;
    private int numberClasses;
    private int numberInterfacesAbstracClasses;
    private int packageRelativeSystemComplexity;
    private int packageTotalSystemComplexity;
    private int totalLinesCode;

    public int getAbstractness() {
        return Abstractness;
    }

    public void setAbstractness(int Abstractness) {
        this.Abstractness = Abstractness;
    }

    public int getClassCategoricalRelationalCohesion() {
        return classCategoricalRelationalCohesion;
    }

    public void setClassCategoricalRelationalCohesion(int classCategoricalRelationalCohesion) {
        this.classCategoricalRelationalCohesion = classCategoricalRelationalCohesion;
    }

    public int getAfferentCoupling() {
        return afferentCoupling;
    }

    public void setAfferentCoupling(int afferentCoupling) {
        this.afferentCoupling = afferentCoupling;
    }

    public int getEfferentCoupling() {
        return efferentCoupling;
    }

    public void setEfferentCoupling(int efferentCoupling) {
        this.efferentCoupling = efferentCoupling;
    }

    public int getNumberClasses() {
        return numberClasses;
    }

    public void setNumberClasses(int numberClasses) {
        this.numberClasses = numberClasses;
    }

    public int getNumberInterfacesAbstracClasses() {
        return numberInterfacesAbstracClasses;
    }

    public void setNumberInterfacesAbstracClasses(int numberInterfacesAbstracClasses) {
        this.numberInterfacesAbstracClasses = numberInterfacesAbstracClasses;
    }

    public int getPackageRelativeSystemComplexity() {
        return packageRelativeSystemComplexity;
    }

    public void setPackageRelativeSystemComplexity(int packageRelativeSystemComplexity) {
        this.packageRelativeSystemComplexity = packageRelativeSystemComplexity;
    }

    public int getPackageTotalSystemComplexity() {
        return packageTotalSystemComplexity;
    }

    public void setPackageTotalSystemComplexity(int packageTotalSystemComplexity) {
        this.packageTotalSystemComplexity = packageTotalSystemComplexity;
    }

    public int getTotalLinesCode() {
        return totalLinesCode;
    }

    public void setTotalLinesCode(int totalLinesCode) {
        this.totalLinesCode = totalLinesCode;
    }
    
    
    
}
