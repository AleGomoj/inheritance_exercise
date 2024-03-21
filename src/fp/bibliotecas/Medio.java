package fp.bibliotecas;

public interface Medio {
	String getTitulo();
	
	void setTitulo(String titulo);

	String getFechaAdquisicion();

	Double getPrecioEnEuros();

	TipoPrestamo getTipoPrestamo();

	void setTipoPrestamo(TipoPrestamo tipoPrestamo);
}
