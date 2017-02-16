/**
 * Dato.java
 * PSP Program 1
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp0.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Dato.
 * 
 * @author Javier Mesa <mailto:jh.mesa@uniandes.edu.co />
 * @version
 * @see
 * @since 04/02/2017 05:34:29 PM 2017
 */
public class Dato {
	
	private int numDatos;
	private List<Float> datoList = new ArrayList<Float>();

	/**
	 * Método que obtiene el atributo numDatos.
	 */
	public int getNumDatos() {
		return numDatos;
	}

	/**
	 * Método que setea el valor del atributo numDatos.
	 * @param numDatos
	 */
	public void setNumDatos(int numDatos) {
		this.numDatos = numDatos;
	}

	/**
	 * Método que obtiene el atributo datoList.
	 */
	public List<Float> getDatoList() {
		return datoList;
	}

	/**
	 * Método que setea el valor del atributo datoList.
	 * @param datoList
	 */
	public void setDatoList(List<Float> datoList) {
		this.datoList = datoList;
	}

}
