/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author ncalumno01
 */
public class LinkedListEmptyException extends Exception {
    public LinkedListEmptyException (){
        super("Lista vacia");
    }
}
