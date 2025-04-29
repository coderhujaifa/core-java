package JavaCollectionFramework;

//import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {
    public static void main(String[] args) {
//        LinkedList<String> name = new LinkedList<String>(); 
    	Stack<String> name=new Stack<>(); //LIFO
//        name.add("Waqas");
//        name.add("Sohel");
//        name.add("Subhan");
    	 name.push("Waqas");
         name.push("Sohel");
         name.push("Subhan");

        System.out.println(name);
//        
//        name.addFirst("Zaid");  //First Name
//        System.out.println(name);
        
//        name.addLast("Zaid"); //Last Name
//        System.out.println(name);
        
//        name.add(2,"Zaid"); //Midil Name
//        System.out.println(name);
        
//        for(String str:name)
//        {
//        	System.out.println (str);
//        }
    }
}