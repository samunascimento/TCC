/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *Type created to control if the string is beeing added or removed on diff
 * 
 * @author gleiph
 */
public enum LineType {
    ADDED, REMOVED,MODIFIED, UNTRACKED, RENAMED, DELETED, COPIED, UNMERGED, UNMODIFIED, IGNORED;
}
