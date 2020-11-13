package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 *
 * @author joao_lima
 */
public enum DeveloperDecision {

    VERSION1, VERSION2, CONCATENATION, COMBINATION, NEWCODE, NONE, IMPRECISE, DELETED, POSTPONED;

    public static DeveloperDecision getEnumFromString(String value) {
        switch (value) {
            case "VERSION1": {
                return VERSION1;
            }
            case "VERSION2": {
                return VERSION2;
            }
            case "CONCATENATION": {
                return CONCATENATION;
            }
            case "COMBINATION": {
                return COMBINATION;
            }
            case "NEWCODE": {
                return NEWCODE;
            }
            case "NONE": {
                return NONE;
            }
            case "IMPRECISE": {
                return IMPRECISE;
            }
            case "DELETED": {
                return DELETED;
            }
            case "POSTPONED": {
                return POSTPONED;
            }
            default: {
                return null;
            }

        }
    }

    public static DeveloperDecision getEnumFromInt(int value) {
        switch (value) {
            case 1: {
                return VERSION1;
            }
            case 2: {
                return VERSION2;
            }
            case 3: {
                return CONCATENATION;
            }
            case 4: {
                return COMBINATION;
            }
            case 5: {
                return NEWCODE;
            }
            case 6: {
                return NONE;
            }
            case 7: {
                return IMPRECISE;
            }
            case 8: {
                return DELETED;
            }
            case 9: {
                return POSTPONED;
            }
            default: {
                return null;
            }

        }
    }

}
