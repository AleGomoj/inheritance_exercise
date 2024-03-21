package fp.bibliotecas;
public class MedioAudiovisualImpl implements MedioAudiovisual {
	private String codigo;
	private String titulo;
	private Integer duracion;
	private String fechaAdquisicion;
	private Double precio;
	private TipoAudiovisual tipoAudiovisual;
	private Integer numeroDiscos;
	private TipoPrestamo tipoPrestamo;

	// ATRIBUTOS
	public MedioAudiovisualImpl(String codigo, String titulo, Integer duracion, String fechaAdquisicion, Double precio,
			TipoAudiovisual tipoAudiovisual, Integer numeroDiscos, TipoPrestamo tipoPrestamo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.duracion = duracion;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precio = precio;
		this.tipoAudiovisual = tipoAudiovisual;
		this.numeroDiscos = numeroDiscos;
		this.tipoPrestamo = tipoPrestamo;
	}
	// CONSTRUCTORES

	// METODOS
	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public Double getPrecioEnEuros() {
		return precio;
	}

	public TipoAudiovisual getTipoAudiovisual() {
		return tipoAudiovisual;
	}

	public Integer getNumeroDiscos() {
		return numeroDiscos;
	}

	public TipoPrestamo getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
		this.tipoPrestamo = tipoPrestamo;
		
	}
	public String tipodemedio() {
		String res = "";
		if (getTipoAudiovisual().equals(TipoAudiovisual.VIDEO)) {
			res = "DVD";
		} else {
			res = "CD";
		}
		
		return res;
	}
	public String toString() {
		return getTitulo()+"(" +tipodemedio() +" "+ getCodigo()+")";
	}

	@Override
	public void setTitulo(String titulo) {
	    this.titulo = titulo;
	    
	}

}
