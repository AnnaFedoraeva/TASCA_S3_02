package observer;

import java.util.List;

public class Agencia implements Observador {

	private String evento;

	public void update(String evento) {
		if (evento.equalsIgnoreCase("baja")) {
			System.out.println("La bolsa ha bajado");
		} else if (evento.equalsIgnoreCase("sube")) {
			System.out.println("La bolsa ha subido");
		}
	}
}