
package colecciones_poo_colecciones1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones_POO_Colecciones1 {

    public static void main(String[] args) {
        
        //Set
        //HashSet
        Set<String> conjunto1 = new HashSet<String>(); 
        conjunto1.add("Hello my fella");
        conjunto1.add("Adios");
        
        
        //List
        //ArrayList
        //LinkedList     
        List<Libro>conjunto2 = new ArrayList<Libro>();
        Libro e = new Libro();
        conjunto2.add(e);
        conjunto2.add(1, e);
        
        
        //Map
        //HashMap
        //TriMap
        //LinkedHashMap     
        Map<String, Libro>conjunto3 = new HashMap<String, Libro>();
        conjunto3.put("elemento1", e);
        conjunto3.getClass();
        
    }
    
}
