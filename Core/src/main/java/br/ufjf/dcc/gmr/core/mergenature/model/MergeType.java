package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Enum for types of merge
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public enum MergeType {

    CONFLICTED_MERGE, NOT_CONFLICTED_MERGE, OCTOPUS_MERGE, 
    CONFLICTED_MERGE_OF_UNRELATED_HISTORIES, NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES, OCTOPUS_MERGE_OF_UNRELATED_HISTORIES,
    OUT_OF_MEMORY;
    
    public static int getIntFromEnum(MergeType mergeType){
        switch(mergeType){
            case CONFLICTED_MERGE:{
                return 1;
            }
            case NOT_CONFLICTED_MERGE:{
                return 2;
            }
            case OCTOPUS_MERGE:{
                return 3;
            }
            case CONFLICTED_MERGE_OF_UNRELATED_HISTORIES:{
                return 4;
            }
            case NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES:{
                return 5;
            }
            case OCTOPUS_MERGE_OF_UNRELATED_HISTORIES:{
                return 6;
            }
            case OUT_OF_MEMORY:{
                return 7;
            }
            default:{
                return -1;
            }
            
        }
    }

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
            case 7: {
                return MergeType.OUT_OF_MEMORY;
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
            case "OUT_OF_MEMORY": {
                return MergeType.OUT_OF_MEMORY;
            }
            default: {
                return null;
            }
        }
    }
}
