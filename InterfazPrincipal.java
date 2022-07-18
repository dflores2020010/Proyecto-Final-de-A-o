public class InterfazPrincipal{
	
	InterfazProducto iP=new InterfazProducto();
	InterfazCliente iC=new InterfazCliente();
	Facturacion fac=new Facturacion();
	ObtenerDato oD=new ObtenerDato();
	int op1,op2;
	public void menuPrincipal(){
		do{
			System.out.println("Bienvenido, que desea hacer?");
			System.out.println("1...Para ingresar al menu de los Clientes");
			System.out.println("2...Para ingresar al menu de los Productos");
			System.out.println("3...Para Facturar");
			System.out.println("4...Para salir del programa");
			op1=oD.numeros();
			switch(op1){
			
				case 1:
				op2=iC.menuCliente();
				break;
			
				case 2:
				op2=iP.menuProducto();
				break;
			
				case 3:
				fac.facturar();
				System.out.println("Gracias por su compra. Vuelva Pronto");
				op2=0;
				break;
				
				case 4:
				op2=0;
				break;
			
				default:
				System.out.println("Esta no es una opcion valida");
				break;
			}
		}while(op2==5);
		
	}

}