package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Enum for outside alteration
 *
 * @author João Pedro Lima
 * @since 26-06-2020
 */
public enum HasOutsideAlterations {
    
    YES, NO, NO_IGNORING_FORMATTING;
    
    public static int getIntFromEnum(HasOutsideAlterations mergeType) {
        switch (mergeType) {
            case YES: {
                return 1;
            }
            case NO: {
                return 2;
            }
            case NO_IGNORING_FORMATTING: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }

    public static HasOutsideAlterations getEnumFromInt(int value) {
        switch (value) {
            case 1: {
                return HasOutsideAlterations.YES;
            }
            case 2: {
                return HasOutsideAlterations.NO;
            }
            case 3: {
                return HasOutsideAlterations.NO_IGNORING_FORMATTING;
            }
            default: {
                return null;
            }
        }
    }

    public static HasOutsideAlterations getEnemFromString(String value) {
        switch (value) {
            case "YES": {
                return HasOutsideAlterations.YES;
            }
            case "NO": {
                return HasOutsideAlterations.NO;
            }
            case "NO_IGNORING_FORMATTING": {
                return HasOutsideAlterations.NO_IGNORING_FORMATTING;
            }
            default: {
                return null;
            }
        }
    }
    
}
