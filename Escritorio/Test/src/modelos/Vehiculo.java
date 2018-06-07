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
public abstract class Vehiculo {
	private String vin;
	private float motorLitros;
	private int motorCilindradas;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public float getMotorLitros() {
		return motorLitros;
	}
	public void setMotorLitros(float motorLitros) {
		this.motorLitros = motorLitros;
	}
	public int getMotorCilindradas() {
		return motorCilindradas;
	}
	public void setMotorCilindradas(int motorCilindradas) {
		this.motorCilindradas = motorCilindradas;
	}
	
	public Vehiculo(String vin, float motorLitros, int motorCilindradas){
		this.vin = vin;
		this.motorLitros=motorLitros;
		this.motorCilindradas=motorCilindradas;
	}
}