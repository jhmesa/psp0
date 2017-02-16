/**
 * LanzarProgram1.java
 * PSP Program 1
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp0.controlador;

import co.edu.uniandes.ecos.csof5101.psp0.vista.InterfazConsola;

/**
 * LanzarProgram1.
 * 
 * @author Javier Mesa <mailto:jh.mesa@uniandes.edu.co />
 * @version
 * @see
 * @since 04/02/2017 05:34:29 PM 2017
 */
public class LanzarProgram1 {

	/**
	 * Inicia la aplicación.
	 * @param args argumentos de entrada de la aplicación
	 */
	public static void main(String[] args) {
		InterfazConsola face = new InterfazConsola();
		String ruta = "";
		for (String string : args) {
			ruta += string;
		}
		face.leerArchivo(ruta);
		face.mostrarEstadisticas();
	}

}
