import java.util.ArrayList;
public class ControlCliente{
	
	public static ArrayList<Cliente>arregloCliente=new ArrayList<Cliente>();
	Cliente cl;
	ObtenerDato oD=new ObtenerDato();
	int codigo;
	int codigoDelCliente;
	String nombre;
	String apellido;
	
	
	
	//Metodo para mostrar todos los datos
	public void mostrarTodo(){
		for(int i=0;i<ControlCliente.arregloCliente.size();i++){
			System.out.println(arregloCliente.get(i).getCodigoCliente()+" "+arregloCliente.get(i).getNombreCliente()+" "+
			arregloCliente.get(i).getApellidoCliente());
		}
	}
	
	//Con este metodo se introducen los datos de un cliente al sistema pero no al array
	public void datosCliente(){
		System.out.println("Ingrese el nombre del Cliente");
		nombre=oD.textos();
		System.out.println("Ingrese el apellido del Cliente");
		apellido=oD.textos();
	}
	
	//Metodo encargado de repetir los demas metodos la cantidad de veces que el usuario desee
	public String repetirMetodo(){
		String op1;
		op1=oD.textos();
		return op1;
	}
	
	//Metodo que ingresa los datos al array
	public void agregarCliente(){
		do{
			codigo++;
			datosCliente();
			ControlCliente.arregloCliente.add(new Cliente(codigo,nombre,apellido));
			System.out.println("Desea agregar otro Cliente?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
		
	}

	//Metodo para buscar clientes
	public void busquedaCliente(){
		do{
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Cliente");
			codigoDelCliente=oD.numeros();
			for(int i=0;i<ControlCliente.arregloCliente.size();i++){
				if(i==(codigoDelCliente-1)){
					System.out.println(ControlCliente.arregloCliente.get(i).getCodigoCliente()+" "+ControlCliente.arregloCliente.get(i).
					getNombreCliente()+" "+ControlCliente.arregloCliente.get(i).getApellidoCliente());
				}else{
					contador++;
				}
			}
			if(contador==ControlCliente.arregloCliente.size()){
				System.out.println("Este cliente no existe");
			}
			
			System.out.println("Desea buscar otro Cliente?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
	}
	
	//Metodo para modificar clientes
	public void modificarCliente(){
		do{
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Cliente a modificar");
			codigoDelCliente=oD.numeros();
			for(int i=0;i<ControlCliente.arregloCliente.size();i++){
				if(i==(codigoDelCliente-1)){
					System.out.println(ControlCliente.arregloCliente.get(i).getCodigoCliente()+" "+ControlCliente.arregloCliente.get(i).
					getNombreCliente()+" "+ControlCliente.arregloCliente.get(i).getApellidoCliente());
					datosCliente();
					ControlCliente.arregloCliente.set((i), new Cliente(codigo=arregloCliente.get(i).getCodigoCliente(),nombre, apellido));
				}else{
					contador++;
				}
			}
			if(contador==ControlCliente.arregloCliente.size()){
				System.out.println("Este cliente no existe");
			}
			System.out.println("Desea modificar otro Cliente?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
	}
	
	//Metodo para eliminar un cliente
	public void eliminarCliente(){
		do{
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Cliente a eliminar");
			codigoDelCliente=oD.numeros();
			for(int i=0;i<ControlCliente.arregloCliente.size();i++){
				if(i==(codigoDelCliente-1)){
					System.out.println(ControlCliente.arregloCliente.get(i).getCodigoCliente()+" "+ControlCliente.arregloCliente.get(i).
					getNombreCliente()+" "+ControlCliente.arregloCliente.get(i).getApellidoCliente());
					ControlCliente.arregloCliente.remove(i);
					System.out.println("Eliminado Exitosamente");
					break;
				}else{
					contador++;
				}
			}
			if(contador==(ControlCliente.arregloCliente.size()+1)){
				System.out.println("Este cliente no existe");
			}
			System.out.println("Desea eliminar otro Cliente?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
	}
	
	public void identificarCliente(){
		int contador=0;
		System.out.println("Por favor ingrese el codigo del Cliente");
		codigoDelCliente=oD.numeros();
		for(int i=0;i<ControlCliente.arregloCliente.size();i++){
			if(i==(codigoDelCliente-1)){
				System.out.println(ControlCliente.arregloCliente.get(i).getCodigoCliente()+" "+ControlCliente.arregloCliente.get(i).
				getNombreCliente()+" "+ControlCliente.arregloCliente.get(i).getApellidoCliente());
			}else{
				contador++;
			}
		}
		if(contador==ControlCliente.arregloCliente.size()){
			System.out.println("Este cliente no existe, consumidor final");
		}
	}

}