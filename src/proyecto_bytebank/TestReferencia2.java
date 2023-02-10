package proyecto_bytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cuenta CuentaDeMarcela = new Cuenta();

		CuentaDeMarcela.setTitular(new Cliente()); 

		CuentaDeMarcela.getTitular().setNombre("marcela");
		System.out.println(CuentaDeMarcela.getTitular().getNombre());
		
	}
}
