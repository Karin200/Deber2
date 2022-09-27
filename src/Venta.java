
public class Venta {
	/*
	 * Esta clase tiene por atributos 
	 * una colección de productos 
	 * y el precio total de la venta.
	 */
		/* Crearemos una colección de tipo List. En este caso un ArrayList.
	    Para crear este objeto, lo haremos de forma en la que previamente
	    sabremos el tipo de datos que se van a almacenar en la colección.*/
		public static List<String> coleccionproductos(){
		ArrayList productos = new ArrayList ();
	     
	    // Agregamos los elementos a la colección con el método add().
	    productos.add("pantalla.");
	    productos.add("teclado.");
	    productos.add("Mouse.");
	    
	      
	    // Mostramos todo el contenido con return
		return productos;	
		
		/*La clase "Venta", tiene un método llamado calcularTotal() que lanza 
		 * la excepción personalizada VentaBuidaException y muestra por pantalla 
		 * "Para hacer una venta primero debes añadir productos" si la colección 
		 * de productos está vacía.
		 */
		
			static final  calcularTotal {
				if(productos )
				
				
					
		}
		
			try {
				calcularTotal();
			}catch (VentaBuidaException e) {
				
			}

	 
	}


}
