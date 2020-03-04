/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.utils;

/**
 *
 * @author gleiph
 */
public class Log {
    
    public static boolean PRINT = true;
    
    public static void print(String message){
        
        if(PRINT)
            System.out.println(message);
        
    }
    
}
