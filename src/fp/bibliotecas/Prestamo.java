package fp.bibliotecas;

public interface Prestamo {
	Persona getUsuario();
	
	Libro getLibro();
	
	String getFechaPrestamo();
	
	String getFechaDevolucion();
	
	void setFechaPrestamo(String fechaPrestamo);
	
	
	
	
}
