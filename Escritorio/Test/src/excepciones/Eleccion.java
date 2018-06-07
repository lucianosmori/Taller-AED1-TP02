/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
import test.*;
/**
 *
 * @author ncalumno01
 */

public class Eleccion {
	
	int opcionIngresada;
	
	public Eleccion(){
		
	}
	
	public Eleccion(int opcionIngresada) throws EleccionException{
		if(opcionIngresada < 1 || opcionIngresada > 2){
			throw new EleccionException("Error");
		}	else{
			this.opcionIngresada = opcionIngresada;
		}
	}
        
    }