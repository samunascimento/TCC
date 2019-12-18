package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author Ian Couto
 */
public class IsOutsideRepository extends Exception{
    public IsOutsideRepository(String message){
        super(message);
    }
}
