import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		Scanner scan;
		int opcion = 0;
		String seleccion = null;
		String nombre = null;
		
		
		//Introduccion
		System.out.println("Universidad del Valle de Guatemala");
		System.out.println("Algoritmos y Estructuras de Datos");
		System.out.println("Seccion 10");
		System.out.println("Yasmin Valdez, #14079");
		System.out.println("Delbert Custodio, 14246");
		
		System.out.println();
		System.out.println();
		
		//Advertencia
		System.out.println("NOTA: \nSi se selecciona una opcion invalida \nel programa lo tomara en cuenta como si selecciono \nla ultima opcion \n");
		
		System.out.println("Por favor, seleccione una opcion:\n 1. HashSet \n 2. TreeSet \n 3. LinkedHashSet");
		System.out.println("Ingrese su opcion: ");
		
		scan = new Scanner(System.in);
		
		//validar las opciones elegidas
		while (opcion == 0){
			seleccion = scan.nextLine();
			
			if ((!seleccion.equals("1"))&&(!seleccion.equals("2"))&&(!seleccion.equals("3"))){
				System.out.println("Por favor, ingrese una opcion valida \n");
			}
			else{
				opcion = 1;
				System.out.println();
				System.out.println();
			}
		}
		
		//Instanciacion de los conjuntos
		Hash a = new Hash(seleccion);
		Hash b = new Hash(seleccion);
		Hash c = new Hash(seleccion);
		
		//Instanciacion de los conjuntos para mantenerlos ordenados
		Hash orden1 = new Hash("2");
		Hash orden2 = new Hash("2");
		Hash orden3 = new Hash("2");
		
		boolean Ingreso = true;
		
		//Ingreso de datos
		while (Ingreso){
			System.out.println("Ingrese el nombre del programador: ");
			nombre = scan.nextLine();
			
			System.out.println();
			System.out.println("Es programador de Java? (S/N)"); 
			seleccion = scan.nextLine();
			
			if (seleccion.toLowerCase().equals("s")){
				a.Agregar(nombre);
				orden1.Agregar(nombre);
			}
			
			System.out.println();
			System.out.println("Es programador Web? (S/N)"); 
			seleccion = scan.nextLine();
			System.out.println();
			
			if (seleccion.toLowerCase().equals("s")){
				b.Agregar(nombre);
				orden2.Agregar(nombre);
			}
			
			System.out.println();
			System.out.println("Es programador para celulares? (S/N)"); 
			seleccion = scan.nextLine();
			System.out.println();
			
			if (seleccion.toLowerCase().equals("s")){
				c.Agregar(nombre);
				orden3.Agregar(nombre);
			}
			
			System.out.println();
			System.out.println("Desea ingresar otro desarrollador? (S/N)"); 
			seleccion = scan.nextLine();
			System.out.println();
			
			if (seleccion.toLowerCase().equals("n")){
				Ingreso = false;
			}
		}
		
		//Termina ingreso
		
		
		//Impresion de resultados
		System.out.println("\n---------------------------------");
		
		System.out.println("Programadores de Java: "+a.Obtener());
		System.out.println("Programadores Web: "+b.Obtener());
		System.out.println("Programadores de Celular: "+c.Obtener());
		
		Set d1 = a.Obtener();
		Set d2 = b.Obtener();
		Set d3 = c.Obtener();
		
		System.out.println("---------------------------------\n");
		System.out.println("1.	Desarrolladores de Java, Web y de Celulares: "+a.Intersectar(d1, d2, d3));
		System.out.println("2.	Desarrolladores que saben de Java pero no de desarrollo Web: "+a.Incluir(d1, d2));
		System.out.println("3.	Desarrolladores Web y de celulares, sin experiencia en Java: "+a.Incluir(b.Intersectar2(d2,d3),d1));
		System.out.println("4.	Desarrolladores Web o de celulares, sin experiencia en Java: "+a.Incluir(b.Sumar(d2, d3), d1));
		
		//Subconjunto o no?
		if (a.subconjunto(d1, d3) == true ){
			System.out.println("5.	Java es un subconjunto de los desarrolladores Web");
		}
		else{
			System.out.println("5.	Java no es un subconjunto de los desarrolladores Web");
		}
		
		
		System.out.println("6.	El conjunto mas grande es "+a.MayorC(d1, d2, d3) +" que es el de "+a.getConM());
		System.out.println("7.	Lista en orden alfabetico del grupo mas grande: "+orden1.MayorC(orden1.Obtener(), orden2.Obtener(), orden3.Obtener()));
		
		
		
		
		
		
		
	}	
}
