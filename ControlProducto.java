import java.util.ArrayList;
public class ControlProducto{

	public static ArrayList<Producto>arregloProducto=new ArrayList<Producto>();
	Producto pr;
	ObtenerDato oD=new ObtenerDato();
	int codigo;
	int codigoDelProducto;
	String nombre;
	double precio;
	
	
	//Metodo para mostrar todos los datos
	public void mostrarTodo(){
		for(int i=0;i<ControlProducto.arregloProducto.size();i++){
			System.out.println(ControlProducto.arregloProducto.get(i).getCodigoProducto()+" "+ControlProducto.arregloProducto.get(i).
			getNombreProducto()+" Q"+ControlProducto.arregloProducto.get(i).getPrecio());
		}
	}
	
	//Con este metodo se introducen los datos de un producto al sistema pero no al array
	public void datosProducto(){
		System.out.println("Ingrese el nombre del Producto");
		nombre=oD.textos();
		System.out.println("Ingrese el precio del Producto");
		precio=oD.decimales();
	}
	
	//Metodo encargado de repetir los demas metodos la cantidad de veces que el usuario desee
	public String repetirMetodo(){
		String op1;
		op1=oD.textos();
		return op1;
	}
	
	//Metodo que ingresa los datos al array
	public void agregarProducto(){
		do{
			codigo++;
			datosProducto();
			ControlProducto.arregloProducto.add(new Producto(codigo,nombre,precio));
			System.out.println("Desea agregar otro Producto?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
		
	}
	
	//Metodo para buscar Productos
	public void busquedaProducto(){
		do{
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Producto");
			codigoDelProducto=oD.numeros();
			for(int i=0;i<ControlProducto.arregloProducto.size();i++){
				if(i==(codigoDelProducto-1)){
					System.out.println(ControlProducto.arregloProducto.get(i).getCodigoProducto()+" "+ControlProducto.arregloProducto.
					get(i).getNombreProducto()+" Q"+ControlProducto.arregloProducto.get(i).getPrecio());
				}else{
					contador++;
				}
			}
			if(contador==ControlProducto.arregloProducto.size()){
				System.out.println("Este Producto no existe");
			}
			
			System.out.println("Desea buscar otro Producto?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
	}
	
	//Metodo para modificar Productos
	public void modificarProducto(){
		do{
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Producto a modificar");
			codigoDelProducto=oD.numeros();
			for(int i=0;i<ControlProducto.arregloProducto.size();i++){
				if(i==(codigoDelProducto-1)){
					System.out.println(ControlProducto.arregloProducto.get(i).getCodigoProducto()+" "+ControlProducto.arregloProducto.
					get(i).getNombreProducto()+" Q"+ControlProducto.arregloProducto.get(i).getPrecio());
					datosProducto();
					ControlProducto.arregloProducto.set((i), new Producto(codigo=arregloProducto.get(i).getCodigoProducto(),nombre, precio));
				}else{
					contador++;
				}
			}
			if(contador==ControlProducto.arregloProducto.size()){
				System.out.println("Este Producto no existe");
			}
			System.out.println("Desea modificar otro Producto?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
	}
	
	
	//Metodo para eliminar un Producto
	public void eliminarProducto(){
		do{
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Producto a eliminar");
			codigoDelProducto=oD.numeros();
			for(int i=0;i<ControlProducto.arregloProducto.size();i++){
				if(i==(codigoDelProducto-1)){
					System.out.println(ControlProducto.arregloProducto.get(i).getCodigoProducto()+" "+ControlProducto.arregloProducto.
					get(i).getNombreProducto()+" Q"+ControlProducto.arregloProducto.get(i).getPrecio());
					ControlProducto.arregloProducto.remove(i);
					System.out.println("Eliminado Exitosamente");
					break;
				}else{
					contador++;
				}
			}
			if(contador==(ControlProducto.arregloProducto.size())+1){
				System.out.println("Este Producto no existe");
			}
			System.out.println("Desea eliminar otro Producto?");
		}while(repetirMetodo().equalsIgnoreCase("si"));
	}

	public double identificarProducto(){
		int num1=0;
		
			int contador=0;
			System.out.println("Por favor ingrese el codigo del Producto");
			codigoDelProducto=oD.numeros();
			for(int i=0;i<ControlProducto.arregloProducto.size();i++){
				if(i==(codigoDelProducto-1)){
					System.out.println(ControlProducto.arregloProducto.get(i).getCodigoProducto()+" "+ControlProducto.arregloProducto.
					get(i).getNombreProducto()+" Q"+ControlProducto.arregloProducto.get(i).getPrecio());
				}else{
					contador++;
				}
				num1=i;
			}
			if(contador==ControlProducto.arregloProducto.size()){
				System.out.println("Este Producto no existe");
			}
		
		return ControlProducto.arregloProducto.get(num1).getPrecio();
	}
}	