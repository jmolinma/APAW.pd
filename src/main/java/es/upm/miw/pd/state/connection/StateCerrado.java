package es.upm.miw.pd.state.connection;

public class StateCerrado extends State {

	@Override
	public void abrir(Conexion context) {
		context.setState(new StatePreparado());
	}

	@Override
	public void cerrar(Conexion context) {
	}

	@Override
	public void parar(Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msj, Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta, Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public Estado getEstado(){
		return Estado.CERRADO;
	}

}
