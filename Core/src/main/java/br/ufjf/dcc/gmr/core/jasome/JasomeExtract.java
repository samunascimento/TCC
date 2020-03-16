/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import java.util.List;

/**
 *
 * @author Principal
 */
public class JasomeExtract {
    
    
    public void extractMetricClass(ProjectMetrics projectMetrics, List<PackageMetrics> listPackage) {
        boolean contemClass = false;
        for (int j = 0; j < listPackage.size(); j++) {
            for (int y = 0; y < listPackage.get(j).getListClassMetrics().size(); y++) {
                if (projectMetrics.getListClassMetrics().size() == 0) {
                    projectMetrics.getListClassMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                    //System.out.println(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                } else {
                    for (int w = 0; w < projectMetrics.getListClassMetrics().size(); w++) {
                        if (projectMetrics.getListClassMetrics().get(w).equals(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()))) {
                            contemClass = true;
                        }
                    }
                    if (contemClass == false) {
                        projectMetrics.getListClassMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                    }
                    //System.out.println(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                }
            }
        }
    }

    public void extractMetricPackage(ProjectMetrics projectMetrics, List<PackageMetrics> listPackage) {
        boolean contemPackage = false;
        for (int j = 0; j < listPackage.size(); j++) {
            if (projectMetrics.getListPackageMetrics().size() == 0) {
                projectMetrics.getListPackageMetrics().add(listPackage.get(j).getName());
            } else {
                for (int y = 0; y < projectMetrics.getListPackageMetrics().size(); y++) {
                    if (projectMetrics.getListPackageMetrics().get(y).equals(listPackage.get(j).getName())) {
                        contemPackage = true;
                    }
                }
                if (contemPackage == false) {
                    projectMetrics.getListPackageMetrics().add(listPackage.get(j).getName()); //está acessando espaço de memoria inválido
                }
            }
        }
    }

    public void extractMetricMethod(ProjectMetrics projectMetrics, List<PackageMetrics> listPackage) {
        boolean contemMetodo = false;
        for (int j = 0; j < listPackage.size(); j++) {
            for (int y = 0; y < listPackage.get(j).getListClassMetrics().size(); y++) {
                for (int w = 0; w < listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().size(); w++) {
                    if (projectMetrics.getListMethodMetrics().size() == 0) {
                        projectMetrics.getListMethodMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()));
                    } else {
                        for (int x = 0; x < projectMetrics.getListMethodMetrics().size(); x++) {
                            if (projectMetrics.getListMethodMetrics().get(x).equals(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()))) {
                                contemMetodo = true;
                            }
                        }
                        if (contemMetodo == false) {
                            projectMetrics.getListMethodMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()));
                        }
                    }
                }
            }
        }
    }
    
}
