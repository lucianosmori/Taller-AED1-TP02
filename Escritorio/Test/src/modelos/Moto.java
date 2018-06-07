/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import test.*;

/**
 *
 * @author ncalumno01
 */
public class Moto extends Vehiculo{
	private String encendidoElectronico;
	
	 public String toString(){
	        return super.toString();
	    }	
	 public Moto (String vin, float motorLitros, int motorCilindradas,String contenido){
		 super(vin,motorLitros,motorCilindradas);
	     this.setContenido(contenido);
	 }
	public String getContenido() {
		return encendidoElectronico;
	}
	public void setContenido(String contenido) {
		this.encendidoElectronico = contenido;
	}
}
