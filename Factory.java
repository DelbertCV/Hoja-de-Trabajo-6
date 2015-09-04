import java.util.*;

public class Factory{

public Set<String> Factor (int opcion){
    
    if (opcion == 1){ 
        return new HashSet<String>();
    }
    
    if (opcion == 2){ 
        return new TreeSet<String>();
    }
    if (opcion == 3){ 
        return new LinkedHashSet<String>();
    }        
    return null; 
}
public Set<String> getterOrden(){
	return new TreeSet<String>();
}
}