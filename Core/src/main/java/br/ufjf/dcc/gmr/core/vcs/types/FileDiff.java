/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.List;

/**
 *
 * @author gleiph
 */

public class FileDiff {
    
    String filePathSource;
    String filePathTarget;
    List<String> added;
    List<String> removed;

    
}