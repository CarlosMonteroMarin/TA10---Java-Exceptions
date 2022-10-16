package ExcepcionesPersonalizadas;

public class ExcepcionPersonalizada extends Exception {
	
	public ExcepcionPersonalizada() {
		super();
	}


	@Override
	public String getMessage() {

		return "Excepción capturada con mensaje; Esto es un objeto Exception.";
	}
}
