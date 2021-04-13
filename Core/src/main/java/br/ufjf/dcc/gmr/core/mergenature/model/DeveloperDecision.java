package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 *
 * @author joao_lima
 */
public enum DeveloperDecision {

    VERSION1, VERSION2, CONCATENATION, COMBINATION, NEWCODE, NONE, IMPRECISE, FILE_DELETED, POSTPONED, DIFF_PROBLEM;

    public static int getIntFromEnum(DeveloperDecision developerDecision) {
        switch (developerDecision) {
            case VERSION1: {
                return 1;
            }
            case VERSION2: {
                return 2;
            }
            case CONCATENATION: {
                return 3;
            }
            case COMBINATION: {
                return 4;
            }
            case NEWCODE: {
                return 5;
            }
            case NONE: {
                return 6;
            }
            case IMPRECISE: {
                return 7;
            }
            case FILE_DELETED: {
                return 8;
            }
            case POSTPONED: {
                return 9;
            }
            case DIFF_PROBLEM: {
                return 10;
            }
            default: {
                return -1;
            }
        }
    }

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
            case "FILE_DELETED": {
                return FILE_DELETED;
            }
            case "POSTPONED": {
                return POSTPONED;
            }
            case "DIFF_PROBLEM": {
                return DIFF_PROBLEM;
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
                return FILE_DELETED;
            }
            case 9: {
                return POSTPONED;
            }
            case 10: {
                return DIFF_PROBLEM;
            }
            default: {
                return null;
            }

        }
    }

}
