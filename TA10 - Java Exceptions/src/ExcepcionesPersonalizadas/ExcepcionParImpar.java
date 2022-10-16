package ExcepcionesPersonalizadas;

public class ExcepcionParImpar extends Exception{
	public int numeroRan;
	
	public ExcepcionParImpar(int numeroRan) {
		this.numeroRan = numeroRan;
	}

	//Sobreescribimos el método que retorna el mensaje y le añadimos una condición sobre si es par o impar
		@Override
		public String getMessage() {
			if ((numeroRan % 2) ==0) {
				return "Número PAR.";
			}
			return "Número IMPAR.";
		}
}
