package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *Type created to control if the string is beeing added or removed on diff
 * 
 * @author gleiph
 */
public enum LineType {
    ADDED, MODIFIED, UNTRACKED, RENAMED, DELETED, COPIED, UNMERGED, IGNORED;
}
