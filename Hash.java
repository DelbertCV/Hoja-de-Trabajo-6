import java.util.*;

/**
 * @author Delbert Custodio
 * @author Yasmin Valdez
 * 
 * Esta clase se encarga de generar las intersecciones, sumas y la realizacion de 
 * subconjuntos
 *
 */
public class Hash {
	

	Factory generador = new Factory();
	private Set<String> conjunto1;
	private Set<String> conjunto2;
	private String ConM;
	
	/**
	 * @param seleccion, que hace que el factory haga su trabajo
	 */
	public Hash(String seleccion){
		
		conjunto1 = generador.Factor(seleccion);
		conjunto2 = generador.Factor(seleccion);
		
	}
	
	
	/**
	 * @param e, elemento que se agrega
	 */
	public void Agregar(String e){//setter op
		
		conjunto1.add(e);
		
	}
	
	
	/**
	 * @return el conjunto entero que se pida
	 */
	public Set<String> Obtener(){//getterc
		return conjunto1;
	}
	
	
	
	/**
	 * @param a, conjunto 1
	 * @param b, conjunto 2
	 * @param c, conjunto 3
	 * @return la interseccion de conjuntos
	 */
	public Set<String> Intersectar( Set<String> a, Set<String> b, Set<String> c ){
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.retainAll(b);
		conjunto2.retainAll(c);
		return conjunto2;
	}
	
	
	/**
	 * @param a, conjunto 1
	 * @param b, conjunto 2
	 * @return union de conjuntos
	 */
	public Set<String> Incluir(Set<String> a, Set<String> b){
		
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.removeAll(b);
		return conjunto2;
		
	}
	
	
	/**
	 * @param a, conjunto 1
	 * @param b, conjunto 2
	 * @return interseccion de 2 conjuntos
	 */
	public Set<String> Intersectar2(Set<String> a, Set<String> b){
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.retainAll(b);
		return conjunto2;
	}
	
	
	/**
	 * @param a, conjunto 1
	 * @param b, conjunto 2
	 * @return suma de conjuntos
	 */
	public Set<String> Sumar(Set<String> a,Set<String> b){
		conjunto2.clear();
		conjunto2.addAll(a);
		return conjunto2;
	}
	
	
	/**
	 * @param a, conjunto 1
	 * @param b, conjunto 2
	 * @return si un conjunto es subconjunto del otro
	 */
	public boolean subconjunto(Set<String> a, Set<String> b){
		
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.retainAll(b);
		return conjunto2.size() == a.size();
				
	}
	
	
	
	/**
	 * @param a, conjunto 1
	 * @param b, conjunto 2
	 * @param c, conjunto 3
	 * @return el conjunto mas grande
	 */
	public Set<String> MayorC(Set<String> a, Set<String> b, Set<String> c){
		
		conjunto2.clear();
		
		if (a.size() >= b.size()){
			conjunto2.addAll(a);
			ConM = "Desarrolladores de Java";
		}
			
		else{
			conjunto2.addAll(b);
			ConM = "Desarrolladores Web";
		}
		
		if (conjunto2.size()>=c.size()){
			return conjunto2;
		}
		else{
			ConM = "Desarrolladores de Celular";
			return c;
		}
	}
	
	
	public String getConM(){
		return ConM;
	}
	
	public void setConM(String a){
		ConM = a;
	}
	

	public String GetS(Set<String> a){
		return a.toString();
	}
	
	
	
	
	
	
}