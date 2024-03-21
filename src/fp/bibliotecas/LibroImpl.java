package fp.bibliotecas;

public class LibroImpl extends MedioImpl implements Libro, Cloneable {

    // ATRIBUTOS
    private String isbn;
    private String nombreAutor;
    private Integer numeroPaginas;
    private Integer copiasVendidas;

    // CONSTANTES
    private final Integer copiasBestSeller = 500000;

    // CONSTRUCTORES
    public LibroImpl(String titulo, String fechaAdquisicion, Double precioEnEuros, TipoPrestamo tipoPrestamo,
	    String isbn, String nombreAutor, Integer numeroPaginas, Integer copiasVendidas) {
	super(titulo, fechaAdquisicion, precioEnEuros, tipoPrestamo);
	this.isbn = isbn;
	this.nombreAutor = nombreAutor;
	this.numeroPaginas = numeroPaginas;
	this.copiasVendidas = copiasVendidas;
    }
    // METODOS

    public String getIsbn() {
	return isbn;
    }

    public String getNombreAutor() {
	return nombreAutor;
    }

    public Integer getNumeroPaginas() {
	return numeroPaginas;
    }

    public Integer getEstimacionCopiasVendidas() {
	return copiasVendidas;
    }

    public void setEstimacionCopiasVendidas(Integer estimacion) {
	this.copiasVendidas = estimacion;
    }

    public boolean isBestSeller() {
	boolean res = false;
	if (getEstimacionCopiasVendidas() >= copiasBestSeller) {
	    res = true;
	}
	return res;
    }

    public Integer getDiasPrestamo(TipoPrestamo tipoPrestamo) {
	int resultado = 0;
	if (tipoPrestamo.equals(TipoPrestamo.DIARIO)) {
	    resultado = 1;
	} else if (tipoPrestamo.equals(TipoPrestamo.SEMANAL)) {
	    resultado = 7;
	} else {
	    resultado = 30;
	}

	return resultado;
    }

    public String toString() {
	return getTitulo() + " (ISBN: " + getIsbn() + ")";

    }
    
   

    public Object clone() throws CloneNotSupportedException {
	return super.clone();
    }
}
