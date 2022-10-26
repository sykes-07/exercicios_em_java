import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class Teste {
  public static void main(String[] args) {
    Dictionary<Integer, String> dic = new Hashtable<Integer, String>();
    dic.put(1, "Ramesh");
    dic.put(2, "Suresh");
    dic.put(3, "Kavitha");
    dic.put(4, "Ramya");
    dic.put(5, "Jay");
    
    System.out.println("Size of the dictionary: " + dic.size());
    System.out.println("Value of the key 3: " + dic.get(3));
    
    //Iterate over elements in dictionary
    System.out.println("Iterating using enumeration:");
    Enumeration<String> e = dic.elements(); 
    while(e.hasMoreElements())
      System.out.print(e.nextElement() + " ");
    
    System.out.println("\nDisplay the keys:");
    Enumeration<Integer> ekey = dic.keys();
    while(ekey.hasMoreElements())
      System.out.print(ekey.nextElement() + " ");
    
    dic.remove(4);
    System.out.println("\nValues after removing element at key 4:" + dic);
    //Update value at key 3
    dic.put(3, "Kavya");
    System.out.println("Value at index 3: " + dic.get(3));
    
    System.out.println("Is dictionary empty: " + dic.isEmpty());
  }
  
}