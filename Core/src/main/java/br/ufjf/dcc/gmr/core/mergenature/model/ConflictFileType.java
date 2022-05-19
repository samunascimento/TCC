package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Enum for type of conflicts
 *
 * @author João Pedro Lima
 * @since 09-11-2020
 */
public enum ConflictFileType {

    CONTENT, COINCIDENCE_ADDING, FILE_RENAME,
    DIRECTORY_RENAME, MODIFY_DELETE, RENAME_DELETE,
    P1_RENAMED_P2_ADD, P2_RENAMED_P1_ADD, FILE_LOCATION,
    SUBMODULE, CONTENT_WITH_UNILATERAL_RENAMNING, DIRECTORY_RENAME_SPLIT;

    public static int getIntFromEnum(ConflictFileType conflictType) {
        switch (conflictType) {
            case CONTENT: {
                return 1;
            }
            case COINCIDENCE_ADDING: {
                return 2;
            }
            case FILE_RENAME: {
                return 3;
            }
            case DIRECTORY_RENAME: {
                return 4;
            }
            case MODIFY_DELETE: {
                return 5;
            }
            case RENAME_DELETE: {
                return 6;
            }
            case P1_RENAMED_P2_ADD: {
                return 7;
            }
            case P2_RENAMED_P1_ADD: {
                return 8;
            }
            case FILE_LOCATION: {
                return 9;
            }
            case SUBMODULE: {
                return 10;
            }
            case CONTENT_WITH_UNILATERAL_RENAMNING: {
                return 11;
            }
            case DIRECTORY_RENAME_SPLIT: {
                return 12;
            }
            default: {
                return -1;
            }
        }
    }

    public static ConflictFileType getEnumFromInt(int value) {
        switch (value) {
            case 1: {
                return ConflictFileType.CONTENT;
            }
            case 2: {
                return ConflictFileType.COINCIDENCE_ADDING;
            }
            case 3: {
                return ConflictFileType.FILE_RENAME;
            }
            case 4: {
                return ConflictFileType.DIRECTORY_RENAME;
            }
            case 5: {
                return ConflictFileType.MODIFY_DELETE;
            }
            case 6: {
                return ConflictFileType.RENAME_DELETE;
            }
            case 7: {
                return ConflictFileType.P1_RENAMED_P2_ADD;
            }
            case 8: {
                return ConflictFileType.P2_RENAMED_P1_ADD;
            }
            case 9: {
                return ConflictFileType.FILE_LOCATION;
            }
            case 10: {
                return ConflictFileType.SUBMODULE;
            }
            case 11: {
                return ConflictFileType.CONTENT_WITH_UNILATERAL_RENAMNING;
            }
            case 12: {
                return ConflictFileType.DIRECTORY_RENAME_SPLIT;
            }
            default: {
                return null;
            }
        }
    }

    public static ConflictFileType getEnumFromString(String value) {
        switch (value) {
            case "CONTENT": {
                return ConflictFileType.CONTENT;
            }
            case "COINCIDENCE_ADDING": {
                return ConflictFileType.COINCIDENCE_ADDING;
            }
            case "FILE_RENAME": {
                return ConflictFileType.FILE_RENAME;
            }
            case "DIRECTORY_RENAME": {
                return ConflictFileType.DIRECTORY_RENAME;
            }
            case "MODIFY_DELETE": {
                return ConflictFileType.MODIFY_DELETE;
            }
            case "RENAME_DELETE": {
                return ConflictFileType.RENAME_DELETE;
            }
            case "P1_RENAMED_P2_ADD": {
                return ConflictFileType.P1_RENAMED_P2_ADD;
            }
            case "P2_RENAMED_P1_ADD": {
                return ConflictFileType.P2_RENAMED_P1_ADD;
            }
            case "FILE_LOCATION": {
                return ConflictFileType.FILE_LOCATION;
            }
            case "SUBMODULE": {
                return ConflictFileType.SUBMODULE;
            }
            case "CONTENT_WITH_UNILATERAL_RENAMNING": {
                return ConflictFileType.CONTENT_WITH_UNILATERAL_RENAMNING;
            }
            case "DIRECTORY_RENAME_SPLIT": {
                return ConflictFileType.DIRECTORY_RENAME_SPLIT;
            }
            default: {
                return null;
            }
        }
    }
}
