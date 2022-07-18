public class Producto{

	int codigoProducto;
	String nombreProducto;
	double precio;
	
	public Producto(int codigoProducto, String nombreProducto, double precio){
		this.codigoProducto=codigoProducto;
		this.nombreProducto=nombreProducto;
		this.precio=precio;
	}
	
	public int getCodigoProducto(){
		return codigoProducto;
	}
	
	public String getNombreProducto(){
		return nombreProducto;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void setCodigoProducto(int codigoProducto){
		this.codigoProducto=codigoProducto;
	}
	
	public void setNombreProducto(String nombreProducto){
		this.nombreProducto=nombreProducto;
	}
	
	public void setPrecio(double precio){
		this.precio=precio;
	}

}