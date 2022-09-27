import java.util.ArrayList;

public class Venta {
	/*
	 * Esta clase tiene por atributos 
	 * una colección de productos 
	 * y el precio total de la venta.
	 */
	
		/* Crearemos una colección de tipo List. En este caso un ArrayList.
	    Para crear este objeto, lo haremos de forma en la que previamente
	    sabremos el tipo de datos que se van a almacenar en la colección.
	    */
	
	    ArrayList<Producto> productos = new ArrayList<Producto> ();
	    double precioTotalVenta;
		public ArrayList<Producto> coleccionproductos(){    

	    
	      
	    // Mostramos todo el contenido con return
		return productos;	
		}
		/*La clase "Venta", tiene un método llamado calcularTotal() que lanza 
		 * la excepción personalizada VentaBuidaException y muestra por pantalla 
		 * "Para hacer una venta primero debes añadir productos" si la colección 
		 * de productos está vacía.
		 */
		
		public void calcularTotal() throws ventaBuidaException{
				if(productos.size() == 0) {		
					throw new ventaBuidaException("Para hacer una venta primero debes añadir productos");
							
		}
				
			}
			

	 
	}



