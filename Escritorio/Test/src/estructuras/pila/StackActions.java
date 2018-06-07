/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.pila;
import test.*;
import excepciones.LinkedListEmptyException;
/**
 *
 * @author ncalumno01
 */
public interface StackActions {
    

	public int size();

	public boolean isEmpty();

	public void push(Object objectToPush);

	public Object pop() throws LinkedListEmptyException;   

	public Object peek() throws LinkedListEmptyException;

}
