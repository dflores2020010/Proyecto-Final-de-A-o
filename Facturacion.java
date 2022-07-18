import java.util.ArrayList;
public class Facturacion{

	ControlCliente cC=new ControlCliente();
	ControlProducto cP=new ControlProducto();
	ObtenerDato oD=new ObtenerDato();
	ArrayList<ArrayList> arregloFacturaCliente=new ArrayList<ArrayList>();
	ArrayList<ArrayList> arregloFacturaProducto=new ArrayList<ArrayList>();
	
	String op1;
	int cantidad;
	double subtotal, total, precio;
	
	public void facturar(){
		cC.mostrarTodo();
		cC.identificarCliente();
		System.out.println("///////////////////////////////////////////");
		do{
			total=parteProducto();
			System.out.println("El cliente llevara otro producto?");
			op1=oD.textos();
		}while(op1.equalsIgnoreCase("si"));
	}	
	
	
	
	public double parteProducto(){
		cP.mostrarTodo();
		precio=cP.identificarProducto();
		System.out.println("Cuantas unidades lleva del producto?");
		cantidad=oD.numeros();
		subtotal=precio*cantidad;
		System.out.println("El monto del producto es: Q"+subtotal);
		return subtotal;
	}
	
	
		
		
	
	
	
	
	

}