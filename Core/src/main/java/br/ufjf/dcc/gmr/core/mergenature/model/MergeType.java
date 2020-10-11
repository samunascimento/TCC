package br.ufjf.dcc.gmr.core.mergenature.model;

/** Enum for types of merge
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public enum MergeType {

    NOT_CONFLICTED_MERGE, CONFLICTED_MERGE, OCTOPUS_MERGE;

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
            default: {
                return null;
            }
        }
    }
}
