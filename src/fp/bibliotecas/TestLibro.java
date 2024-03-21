package fp.bibliotecas;

public class TestLibro {
public static void main(String[] args) throws CloneNotSupportedException {
		Libro l1 = new LibroImpl("Ventepen", "12-12-12", 12.50, TipoPrestamo.SEMANAL, "123-23456", "Raul Noriega", 150, 120000);
	/*	System.out.println(l1.toString());
		System.out.println(l1.getTitulo());
		System.out.println(l1.getFechaAdquisicion());
		System.out.println(l1.getIsbn());
		System.out.println(l1.getNombreAutor());
		System.out.println(l1.getTipoPrestamo());
		System.out.println(l1.getDiasPrestamo(TipoPrestamo.SEMANAL));
		System.out.println(l1.isBestSeller());
		System.out.println(l1.getEstimacionCopiasVendidas());
		System.out.println(l1.getNumeroPaginas());
		System.out.println(l1.getPrecioEnEuros());
		*/
		Libro l1Clonado = (Libro) l1.clone();
		System.out.println(l1);
		System.out.println(l1Clonado);
		l1.setTitulo("Fernandito");
		System.out.println(l1);
		
	}
}
