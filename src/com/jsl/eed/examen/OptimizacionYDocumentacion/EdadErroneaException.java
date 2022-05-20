package com.jsl.eed.examen.OptimizacionYDocumentacion;

public class EdadErroneaException extends Exception {
    /**
     * Se lanza si la edad es menor a cero con un mensaje de error
     * @param message Mensaje de error
     */
	public EdadErroneaException(String message) {
		super(message);
	}
}
