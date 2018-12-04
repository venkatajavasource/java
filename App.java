package com.devjavasource.concurrency.tuples;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is to test created Tuple.
 *
 */
public class App {
	public static void main( String[] args )
    {
        Tuple<String, String> tuple = Tuple.create("first argument", "second argument");
        
        System.out.println( "First Arument is: " + tuple.getFirst() );
        System.out.println( "Second Arument is: " + tuple.getFirst() );
        
        Map<Tuple<String, String>, String> map = new HashMap<>();
        map.put(tuple, "valueInMap");
        
        System.out.println("Value in Map is: " + map.get(tuple));
        
        Tuple<Emp, Emp> empTuple = Tuple.create(new Emp("1", "One"), new Emp("2", "Two"));
        
        System.out.println(empTuple.getFirst().toString());
        System.out.println(empTuple.getSecond().toString());
    }
}
