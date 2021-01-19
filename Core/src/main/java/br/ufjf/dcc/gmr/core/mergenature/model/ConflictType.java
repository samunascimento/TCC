package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Enum for type of conflicts
 *
 * @author João Pedro Lima
 * @since 09-11-2020
 */
public enum ConflictType {
    
    CONTENT, COINCIDENCE_ADDING, FILE_RENAME, 
    DIRECTORY_RENAME, MODIFY_DELETE, RENAME_DELETE, 
    P1_RENAMED_P2_ADD, P2_RENAMED_P1_ADD, FILE_LOCATION,
    SUBMODULE, CONTENT_WITH_UNILATERAL_RENAMNING;
    
    public static ConflictType getEnumFromInt(int value) {
        switch (value) {
            case 1: {
                return ConflictType.CONTENT;
            }
            case 2: {
                return ConflictType.COINCIDENCE_ADDING;
            }
            case 3: {
                return ConflictType.FILE_RENAME;
            }
            case 4: {
                return ConflictType.DIRECTORY_RENAME;
            }
            case 5: {
                return ConflictType.MODIFY_DELETE;
            }
            case 6: {
                return ConflictType.RENAME_DELETE;
            }
            case 7: {
                return ConflictType.P1_RENAMED_P2_ADD;
            }
            case 8: {
                return ConflictType.P2_RENAMED_P1_ADD;
            }
            case 9: {
                return ConflictType.FILE_LOCATION;
            }
            case 10: {
                return ConflictType.SUBMODULE;
            }
            case 11: {
                return ConflictType.CONTENT_WITH_UNILATERAL_RENAMNING;
            }
            default: {
                return null;
            }
        }
    }

    public static ConflictType getEnemFromString(String value) {
        switch (value) {
            case "CONTENT": {
                return ConflictType.CONTENT;
            }
            case "COINCIDENCE_ADDING": {
                return ConflictType.COINCIDENCE_ADDING;
            }
            case "FILE_RENAME": {
                return ConflictType.FILE_RENAME;
            }
            case "DIRECTORY_RENAME": {
                return ConflictType.DIRECTORY_RENAME;
            }
            case "MODIFY_DELETE": {
                return ConflictType.MODIFY_DELETE;
            }
            case "RENAME_DELETE": {
                return ConflictType.RENAME_DELETE;
            }
            case "P1_RENAMED_P2_ADD": {
                return ConflictType.P1_RENAMED_P2_ADD;
            }
            case "P2_RENAMED_P1_ADD": {
                return ConflictType.P2_RENAMED_P1_ADD;
            }
            case "FILE_LOCATION": {
                return ConflictType.FILE_LOCATION;
            }
            case "SUBMODULE": {
                return ConflictType.SUBMODULE;
            }
            case "CONTENT_WITH_UNILATERAL_RENAMNING": {
                return ConflictType.CONTENT_WITH_UNILATERAL_RENAMNING;
            }
            default: {
                return null;
            }
        }
    }
}
