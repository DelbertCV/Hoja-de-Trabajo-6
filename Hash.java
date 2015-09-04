import java.util.*;

public class Hash {
	
	
	Factory generador = new Factory();
	private Set<String> conjunto1;
	private Set<String> conjunto2;
	private String ConM;
	
	public Hash(int seleccion){
		
		conjunto1 = generador.Factor(seleccion);
		conjunto2 = generador.Factor(seleccion);
		
	}
	
	
	public void Agregar(String e){
		
		conjunto1.add(e);
		
	}
	
	
	public Set<String> Obtener(){
		return conjunto1;
	}
	
	
	
	public Set<String> Intersectar( Set<String> a, Set<String> b, Set<String> c ){
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.retainAll(b);
		conjunto2.retainAll(c);
		return conjunto2;
	}
	
	public Set<String> Almacenar(Set<String> a, Set<String> b){
		
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.retainAll(b);
		return conjunto2;
		
	}
	
	
	public Set<String> Sumar(Set<String> a,Set<String> b){
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.addAll(b);
		return conjunto2;
	}
	
	public boolean subconjunto(Set<String> a, Set<String> b){
		
		conjunto2.clear();
		conjunto2.addAll(a);
		conjunto2.retainAll(b);
		return conjunto2.size() == a.size();
				
	}
	
	public Set<String> MayorC(Set<String> a, Set<String> b, Set<String> c){
		
		conjunto2.clear();
		
		if (a.size() >= b.size()){
			conjunto2.addAll(a);
			ConM = "Desarrolladores de Java";
			
			if (a.size()>=c.size()){
		           return a;
		       }
			else{
				ConM = "Desarrolladores de Celulares";
				return c;
			}
		}
			
		else{
			conjunto2.addAll(b);
			ConM = "Desarrolladores Web";
			
			if (b.size()>=c.size()){
		           return a;
		       }
			else{
				ConM = "Desarrolladores de Celulares";
				return c;
			}
		}
	}
	
	
	public String getConM(){
		return ConM;
	}
	
	public void setConM(String a){
		ConM = a;
	}
	
	
	
	
	
	
}