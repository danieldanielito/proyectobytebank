package proyecto_bytebank;

public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 100;
		Cuenta segundaCuenta = primeraCuenta;
		System.out.println(primeraCuenta.saldo);
		System.out.println(segundaCuenta.saldo);
		segundaCuenta.saldo+=400;
		System.out.println(primeraCuenta.saldo);
	}

}
