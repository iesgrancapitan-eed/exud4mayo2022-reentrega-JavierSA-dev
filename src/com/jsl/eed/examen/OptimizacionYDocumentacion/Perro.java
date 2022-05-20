package com.jsl.eed.examen.OptimizacionYDocumentacion;
/**
 * <p>
 * Representa un perro que tiene una edad, nombre y un ladrido
 * @author Javier Sánchez López
 */
public class Perro extends Mascota {
  /**
   * <p>
   * Ladrido del perro
   */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	 * Edad del perro
	 */
    private int age;
    /**
     * <p>
     * Crea el objeto pasándole un nombre y una edad
     * @param name Nombre del perro
     * @param age Edad del perro
     * @throws EdadErroneaException Se lanza si la edad es erronea
     */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
    setAge(age);
		this.name = name;
	}
	/**
	 * <p>
	 * Cambia la edad del perro por el parámetro
	 * @param age Edad del perro
     * @throws EdadErroneaException Se lanza si la edad es menor a cero
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}
	/**
	 * <p>
	 * Devuelve la edad del perro
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	/**
	 * <p>
	 * Devuelve el ladrido del perro
	 * @return
	 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
