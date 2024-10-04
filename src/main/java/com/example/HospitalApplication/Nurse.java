package com.example.HospitalApplication;

public class Nurse {
	String nombre;
	int edad;
	String seccion;
	int modulo;
  public Nurse(String nombre,int edad, String seccion, int modulo) {
	 
	 this.nombre = nombre;
	 this.edad= edad;
	 this.seccion = seccion;
	 this.modulo = modulo;
  }

    public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getSeccion() {
		return seccion;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public int getModulo() {
		return modulo;
	}
	
	public void setModulo(int modulo) {
		this.modulo = modulo;
	}
 
	@Override
	public String toString() {
	    return "Nurse{" +
	            "Name='" + nombre + '\'' +      ", Age=" + edad +    ", section='" + seccion + '\'' +   ", unit=" + modulo +  '}';
	}

 
}

