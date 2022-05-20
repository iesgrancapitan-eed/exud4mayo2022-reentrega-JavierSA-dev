package com.jsl.eed.examen.OptimizacionYDocumentacion;
/**
 * Se lanza si la edad es menor a cero 
 * @param message Mensaje de error
 */
public class EdadErroneaException extends Exception {
    /**
     * Crea la exepción con un mensaje de error 
     * @param message Mensaje de error
     */
	public EdadErroneaException(String message) {
		super(message);
	}
}
