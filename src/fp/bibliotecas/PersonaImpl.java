package fp.bibliotecas;

public class PersonaImpl implements Persona {

//ATRIBUTOS
	private String dni;
	private String apellidos;
	private String nombre;
	private String fechaNacimiento;
	private Integer edad;
	private String email;

	// CONSTRUCTORES
	
	 	 //Por defecto
	public PersonaImpl(String dni, String apellidos, String nombre, String fechaNacimiento, Integer edad, String email) {
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.email = email;
	}
	public PersonaImpl(String dni, String apellidos, String nombre, String fechaNacimiento, Integer edad) {
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.email = null;
	}
		

	// METODOS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {

		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {

		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;

	}
	public String toString() {
		return getDni() + " - "+ getApellidos() + ", " + getNombre() + " - "+ getFechaNacimiento();
	}

}
