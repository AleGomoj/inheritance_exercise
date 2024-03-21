package fp.bibliotecas;

public class MedioImpl implements Medio {
    private String titulo;
    private String fechaAdquisicion;
    private Double precioEnEuros;
    private TipoPrestamo tipoPrestamo;

    public MedioImpl(String titulo, String fechaAdquisicion, Double precioEnEuros, TipoPrestamo tipoPrestamo) {
	this.titulo = titulo;
	this.fechaAdquisicion = fechaAdquisicion;
	this.precioEnEuros = precioEnEuros;
	this.tipoPrestamo = tipoPrestamo;
    }

    @Override
    public String getTitulo() {
	return titulo;
    }

    @Override
    public String getFechaAdquisicion() {
	return fechaAdquisicion;
    }

    @Override
    public Double getPrecioEnEuros() {
	return precioEnEuros;
    }

    @Override
    public TipoPrestamo getTipoPrestamo() {
	return tipoPrestamo;
    }

    @Override
    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
	this.tipoPrestamo = tipoPrestamo;

    }

    public String toString() {
	return getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
	this.titulo = titulo;

    }
}
