public class InterfazProducto{

	ControlProducto cP=new ControlProducto();
	ObtenerDato oD=new ObtenerDato();
	int op1,op2;
	
	public int menuProducto(){
		
		instrucciones();
		op1=oD.numeros();
		do{
			switch(op1){
				case 1:
				cP.agregarProducto();
				cP.mostrarTodo();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 2:
				cP.busquedaProducto();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 3:
				cP.modificarProducto();
				cP.mostrarTodo();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 4:
				cP.eliminarProducto();
				cP.mostrarTodo();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 5:
				break;
				
				default:
				System.out.println("Esta no es opcion valida");
				break;
			}
			
		}while(op1!=5);
		return op1;
	}

	public void instrucciones(){
		System.out.println("Elige cualquiera de las opciones:");
		System.out.println("1...Para agregar un Producto nuevo");
		System.out.println("2...Para buscar un Producto");
		System.out.println("3...Para modificar un Producto");
		System.out.println("4...Para eliminar un Producto");
		System.out.println("5...Para volver al menu principal");
	}
}