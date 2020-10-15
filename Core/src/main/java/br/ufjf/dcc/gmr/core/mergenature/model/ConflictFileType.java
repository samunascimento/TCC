package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Enum for conflict file types
 *
 * @author João Pedro Lima
 * @since 14-10-2020
 */
public enum ConflictFileType {
    BOTH_ADDED, BOTH_DELETED, BOTH_MODIFIED, ADDED_BY_US, DELETED_BY_US, ADDED_BY_THEM, DELETED_BY_THEM, UNTRACKED, IGNORED;
    
    public static ConflictFileType getEnumFromInt(int value) {
        switch (value) {
            case 1: {
                return ConflictFileType.BOTH_ADDED;
            }
            case 2: {
                return ConflictFileType.BOTH_DELETED;
            }
            case 3: {
                return ConflictFileType.BOTH_MODIFIED;
            }
            case 4: {
                return ConflictFileType.ADDED_BY_US;
            }
            case 5: {
                return ConflictFileType.DELETED_BY_US;
            }
            case 6: {
                return ConflictFileType.ADDED_BY_THEM;
            }
            case 7: {
                return ConflictFileType.DELETED_BY_THEM;
            }
            case 8: {
                return ConflictFileType.UNTRACKED;
            }
            case 9: {
                return ConflictFileType.IGNORED;
            }
            default: {
                return null;
            }
        }
    }
    
    public static ConflictFileType getEnumFromInt(String value) {
        switch (value) {
            case "BOTH_ADDED": {
                return ConflictFileType.BOTH_ADDED;
            }
            case "BOTH_DELETED": {
                return ConflictFileType.BOTH_DELETED;
            }
            case "BOTH_MODIFIED": {
                return ConflictFileType.BOTH_MODIFIED;
            }
            case "ADDED_BY_US": {
                return ConflictFileType.ADDED_BY_US;
            }
            case "DELETED_BY_US": {
                return ConflictFileType.DELETED_BY_US;
            }
            case "ADDED_BY_THEM": {
                return ConflictFileType.ADDED_BY_THEM;
            }
            case "DELETED_BY_THEM": {
                return ConflictFileType.DELETED_BY_THEM;
            }
            case "UNTRACKED": {
                return ConflictFileType.UNTRACKED;
            }
            case "IGNORED": {
                return ConflictFileType.IGNORED;
            }
            default: {
                return null;
            }
        }
    }
    
}
