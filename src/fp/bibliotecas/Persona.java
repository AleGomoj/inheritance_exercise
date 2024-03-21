package fp.bibliotecas;

public interface Persona {
	String getDni();
	void setDni(String dni);
	
	String getNombre();

	void setNombre(String nombre);

	String getApellidos();

	void setApellidos(String apellidos);

	String getFechaNacimiento();

	void setFechaNacimiento(String fechaNacimiento);

	Integer getEdad();

	void setEdad(Integer edad);

	String getEmail();

	void setEmail(String email);

}
