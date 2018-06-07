package estructuras;
import test.*;

public class Nodo {
    
    public Object dato;
    
    public Nodo siguiente;
    
    public Nodo (Object objectToPush, Nodo n){
        dato = objectToPush;
        siguiente = n;
       
        
    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
