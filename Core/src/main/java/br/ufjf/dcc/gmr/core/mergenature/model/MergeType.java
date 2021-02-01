package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Enum for types of merge
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public enum MergeType {

    CONFLICTED_MERGE, NOT_CONFLICTED_MERGE, OCTOPUS_MERGE, 
    CONFLICTED_MERGE_OF_UNRELATED_HISTORIES, NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES, OCTOPUS_MERGE_OF_UNRELATED_HISTORIES;

    public static MergeType getEnumFromInt(int value) {
        switch (value) {
            case 1: {
                return MergeType.CONFLICTED_MERGE;
            }
            case 2: {
                return MergeType.NOT_CONFLICTED_MERGE;
            }
            case 3: {
                return MergeType.OCTOPUS_MERGE;
            }
            case 4: {
                return MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES;
            }
            case 5: {
                return MergeType.NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES;
            }
            case 6: {
                return MergeType.OCTOPUS_MERGE_OF_UNRELATED_HISTORIES;
            }
            default: {
                return null;
            }
        }
    }

    public static MergeType getEnemFromString(String value) {
        switch (value) {
            case "CONFLICTED_MERGE": {
                return MergeType.CONFLICTED_MERGE;
            }
            case "NOT_CONFLICTED_MERGE": {
                return MergeType.NOT_CONFLICTED_MERGE;
            }
            case "OCTOPUS_MERGE": {
                return MergeType.OCTOPUS_MERGE;
            }
            case "CONFLICTED_MERGE_OF_UNRELATED_HISTORIES": {
                return MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES;
            }
            case "NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES": {
                return MergeType.NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES;
            }
            case "OCTOPUS_MERGE_OF_UNRELATED_HISTORIES": {
                return MergeType.OCTOPUS_MERGE_OF_UNRELATED_HISTORIES;
            }
            default: {
                return null;
            }
        }
    }
}
