package br.ufjf.dcc.gmr.core.jasome;

import java.util.List;

/**
 *
 * @author anton
 */
//Ainda não sei se essa é a melhor maneira de fazer as filtragens
public class Filtrate {
    List<PackageMetrics> listPackageMetrics;
    List<ClassMetrics> listClassMetrics;
    List<MethodMetrics> listMethodMetrics;

    //Criando um construtor para filtrar apenas os Pacotes.
    //Sendo assim, todas as clssses e métodos entrariam.
    public Filtrate(List<PackageMetrics> listPackageMetrics) {
        this.listPackageMetrics = listPackageMetrics;
    }
    //Construtor com a filtragem dos pacotes e classes
    //A filtragem das classes de cada pacote é feita dentro da lista de Pacotes
    //Seguindo a estrutura já desenvolvida
    //ListPack -> ListClss -> ListMeth
    //A lista de Classes será um complemento para reunir todas
    //todas as classes independente dos pacotes
    public Filtrate(List<PackageMetrics> listPackageMetrics, List<ClassMetrics> listClassMetrics) {
        this.listPackageMetrics = listPackageMetrics;
        this.listClassMetrics = listClassMetrics;
    }

    //Seguindo a mesma lógica dos demais construtores
    public Filtrate(List<PackageMetrics> listPackageMetrics, List<ClassMetrics> listClassMetrics, List<MethodMetrics> listMethodMetrics) {
        this.listPackageMetrics = listPackageMetrics;
        this.listClassMetrics = listClassMetrics;
        this.listMethodMetrics = listMethodMetrics;
    }
}
