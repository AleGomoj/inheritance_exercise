package fp.bibliotecas;

public class TestMedio {
public static void main(String[] args) {
		Medio m1 = new MedioImpl("La vida de willyrex", "27-5-2000", 25.5, TipoPrestamo.SEMANAL);
		Medio m2 = new MedioImpl("Tepeins", "12-2-2000", 92.2, TipoPrestamo.DIARIO);
		System.out.println(m1.toString());
		System.out.println(m1.getTitulo());
		System.out.println(m1.getFechaAdquisicion());
		System.out.println(m1.getPrecioEnEuros());
		System.out.println(m1.getTipoPrestamo());
	}
}
