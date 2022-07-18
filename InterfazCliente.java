public class InterfazCliente{
	
	
	ControlCliente cC=new ControlCliente();
	ObtenerDato oD=new ObtenerDato();
	int op1,op2;
	
	public int menuCliente(){
		
		instrucciones();
		op1=oD.numeros();
		do{
			switch(op1){
				case 1:
				cC.agregarCliente();
				cC.mostrarTodo();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 2:
				cC.busquedaCliente();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 3:
				cC.modificarCliente();
				cC.mostrarTodo();
				instrucciones();
				op1=oD.numeros();
				break;
			
				case 4:
				cC.eliminarCliente();
				cC.mostrarTodo();
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
		System.out.println("1...Para agregar un Cliente nuevo");
		System.out.println("2...Para buscar un Cliente");
		System.out.println("3...Para modificar un Cliente");
		System.out.println("4...Para eliminar un Cliente");
		System.out.println("5...Para volver al menu principal");
	}		
	
}