public class Cliente{

	int codigoCliente;
	String nombreCliente;
	String apellidoCliente;

	public Cliente(int codigoCliente, String nombreCliente, String apellidoCliente){
		this.codigoCliente=codigoCliente;
		this.nombreCliente=nombreCliente;
		this.apellidoCliente=apellidoCliente;
	}		
	
	public int getCodigoCliente(){
		return codigoCliente;
	}
	
	public String getNombreCliente(){
		return nombreCliente;
	}
	
	public String getApellidoCliente(){
		return apellidoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente){
		this.codigoCliente=codigoCliente;
	}
	
	public void setNombreCliente(String nombreCliente){
		this.nombreCliente=nombreCliente;
	}
	
	public void setApellidoCliente(String apellidoCliente){
		this.apellidoCliente=apellidoCliente;
	}

}