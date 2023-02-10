package proyecto_bytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cuenta CuentaDeMarcela = new Cuenta(555,666);

		CuentaDeMarcela.setTitular(new Cliente()); 

		CuentaDeMarcela.getTitular().setNombre("marcela");
		System.out.println(CuentaDeMarcela.getTitular().getNombre());
		
	}
}
