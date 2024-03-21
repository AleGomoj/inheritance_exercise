package fp.bibliotecas;

public interface Libro extends Medio {
    String getIsbn();

    String getNombreAutor();

    Integer getNumeroPaginas();

    String getFechaAdquisicion();

    Integer getEstimacionCopiasVendidas();

    void setEstimacionCopiasVendidas(Integer estimacion);

    boolean isBestSeller();

    Integer getDiasPrestamo(TipoPrestamo tipoPrestamo);

    public Object clone() throws CloneNotSupportedException;
}
