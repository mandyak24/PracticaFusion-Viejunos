package paquete1;

public class Mascota {
	private String nombre;
	private int edad;
	private int tipoAnimal;

	public Mascota(String nombre,int edad) {
		this.nombre = nombre;
		this.edad=edad;
		this.tipoAnimal=this.tipoAnimal;

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

	
	public int getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(int tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public void MandarMensaje() {
		System.out.println("Hola equipo! Soy " + this.nombre + " y te voy a contar algo o no y soy " + this.tipoAnimal);
	}

}