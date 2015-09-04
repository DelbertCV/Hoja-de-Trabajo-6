import java.util.*;

/**
 * @author Yasmin Valdez
 * @author Delbert Custodio
 * Clase que instancia segun la opcion seleccionada
 *
 */
public class Factory{

/**
 * @param opcion, el objeto que se va a instanciar
 * @return el objeto isntanciado
 */
public Set<String> Factor (String opcion){
    
    if (opcion.equals("1")){ 
        return new HashSet<String>();
    }
    
    if (opcion.equals("2")){ 
        return new TreeSet<String>();
    }
    
    return new LinkedHashSet<String>();      
}

}