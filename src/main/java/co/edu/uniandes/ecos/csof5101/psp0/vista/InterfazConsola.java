/**
 * InterfazConsola.java
 * PSP Program 1
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp0.vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import co.edu.uniandes.ecos.csof5101.psp0.modelo.Dato;
import co.edu.uniandes.ecos.csof5101.psp0.modelo.MedidaEstadistica;

/**
 * InterfazConsola.
 * 
 * @author Javier Mesa <mailto:jh.mesa@uniandes.edu.co />
 * @version
 * @see
 * @since 04/02/2017 05:34:29 PM 2017
 */

public class InterfazConsola {
	
	private Dato dato = new Dato();
	private MedidaEstadistica medida;
	
	/**
	 * Método que obtiene los datos del archivo y los almacena en la lista.
	 * @param ruta ubicación del archivo que contiene los datos
	 */
	public void leerArchivo(String ruta) {
		if(null == ruta || ruta.equalsIgnoreCase("")){
			System.out.println("La ruta esta vacia!!");
		}else{
			try {
				BufferedReader br =  new BufferedReader(new FileReader(ruta));
				String line = br.readLine();
				while (null != line) {
					Float num = Float.parseFloat(line);
					dato.getDatoList().add(num);
					line = br.readLine();
				}
				dato.setNumDatos(dato.getDatoList().size());
				br.close();
			} catch (IOException e) {
				System.out.println("Hay un error obteniendo el archivo:" + ruta);
			}
		}
	}

	/**
	 * Método que renderiza en consola las medidas estadisticas de los datos suministrados en el archivo.
	 */
	public void mostrarEstadisticas() {
		if(!dato.getDatoList().isEmpty()){
			System.out.println("Para los siguientes datos: ");
			for (Float num : dato.getDatoList()) {
				System.out.println(num);
			}
			medida = new MedidaEstadistica(dato);
			System.out.println("----------------------------------------");
			System.out.println("La Media es: " + medida.getMedia());
			System.out.println("La Desviación Estandar es: " + medida.getDesviacionEstandar());
		}
		
	}
}
