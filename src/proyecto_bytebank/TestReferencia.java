package proyecto_bytebank;

public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(222,333);
		primeraCuenta.deposita(100);
		Cuenta segundaCuenta = primeraCuenta;
		System.out.println(primeraCuenta.getSaldo());
		System.out.println(segundaCuenta.getSaldo());
		segundaCuenta.deposita(400);
		System.out.println(primeraCuenta.getSaldo());
	}

}
