package observer;


public class Agencia implements Observador {


	public void update(String evento) {
		if (evento.equalsIgnoreCase("baja")) {
			System.out.println("La bolsa ha bajado");
		} else if (evento.equalsIgnoreCase("sube")) {
			System.out.println("La bolsa ha subido");
		}
	}
}