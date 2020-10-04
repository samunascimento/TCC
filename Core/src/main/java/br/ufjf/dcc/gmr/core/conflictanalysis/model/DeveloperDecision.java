package br.ufjf.dcc.gmr.core.conflictanalysis.model;

/**
 *
 * @author joao_lima
 */
public enum DeveloperDecision {
    
    VERSION1,VERSION2,CONCATENATION,COMBINATION,NEWCODE,NONE,IMPRECISE,DELETED,POSTPONED;
    
    public static DeveloperDecision getEnum(String value){
        switch(value){
            case "VERSION1":{
                return VERSION1;
            }
            case "VERSION2":{
                return VERSION2;
            }
            case "CONCATENATION":{
                return CONCATENATION;
            }
            case "COMBINATION":{
                return COMBINATION;
            }
            case "NEWCODE":{
                return NEWCODE;
            }
            case "NONE":{
                return NONE;
            }
            case "IMPRECISE":{
                return IMPRECISE;
            }
            case "DELETED":{
                return DELETED;
            }
            case "POSTPONED":{
                return POSTPONED;
            }
            default:{
                return null;
            }
            
        }
    }
    
}

