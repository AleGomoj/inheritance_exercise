package fp.bibliotecas;

public class PrestamoImpl implements Prestamo {
	// ATRIBUTOS
	private Persona usuario;
	private Libro libro;
	private String fechaPrestamo;
	private String fechaDevolucion;
	// CONSTRUCTORES
	public PrestamoImpl(Persona usuario, Libro libro, String fechaPrestamo, String fechaDevolucion) {
		this.usuario = usuario;
		this.libro = libro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	// METODOS
	public Persona getUsuario() {
		return usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String toString() {
		return getLibro().getTitulo() + "(usuario: " + getUsuario().getDni() + ", fecha prestamo: " + getFechaPrestamo()
				+ ", fecha devolución: " + getFechaDevolucion() + ")";
	}

}
