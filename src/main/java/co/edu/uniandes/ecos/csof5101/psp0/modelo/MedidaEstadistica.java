/**
 * MedidaEstadistica.java
 * PSP Program 1
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp0.modelo;

/**
 * MedidaEstadistica.
 * 
 * @author Javier Mesa <mailto:jh.mesa@uniandes.edu.co />
 * @version
 * @see
 * @since 04/02/2017 05:34:29 PM 2017
 */
public class MedidaEstadistica {

	private double media;
	private double desviacionEstandar;
	private double suma;

	/**
	 * Constructor público.
	 * @param dato objeto de tipo Dato con el cual se inicializa los atributos del objeto
	 */
	public MedidaEstadistica(Dato dato){
		calcularSuma(dato);
		calcularMedia(dato);
		calcularDesviacionEstandar(dato);
	}
	
	/**
	 * Método que obtiene el atributo media.
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * Método que obtiene el atributo desviacionEstandar.
	 */
	public double getDesviacionEstandar() {
		return desviacionEstandar;
	}
	
	/**
	 * Método que calcula la media de los datos ingresados en el archivo.
	 * @param dato objeto de tipo Dato que contiene los datos
	 */
	public void calcularMedia(Dato dato){
		this.media = getSuma()/dato.getNumDatos(); 
	}
	
	/**
	 * Método que obtiene el atributo suma.
	 */
	public double getSuma() {
		return suma;
	}
	
	/**
	 * Método que calcula la sumatoria de los datos ingresados en el archivo.
	 * @param dato objeto de tipo Dato que contiene los datos
	 */
	public void calcularSuma(Dato dato){
		double suma = 0.0;
		for (Float num : dato.getDatoList()) {
			suma += num;
		}
		this.suma = suma;
	}
	
	/**
	 * Método que calcula la desviación estandar de los datos ingresados en el archivo.
	 * @param dato objeto de tipo Dato que contiene los datos
	 */
	public void calcularDesviacionEstandar(Dato dato){
		double suma= 0.0;
		for (Float num : dato.getDatoList()) {
			suma += Math.pow(num - getMedia(), 2);
		}
		this.desviacionEstandar = Math.sqrt(suma /(dato.getNumDatos()-1));
		
	}

}