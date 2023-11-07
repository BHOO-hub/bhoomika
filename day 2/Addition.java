// Java program to demonstrate working of method 
// overloading in Java 
public class Addition { 
    // Overloaded Addition(). This sum takes two int parameters 
    public int Addition(int x, int y) { return (x + y); } 
  
    // Overloaded Addition(). This sum takes three int parameters 
    public int Addition(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    // Overloaded Addition(). This sum takes two double 
    // parameters 
    public double Addition(double x, double y) 
    { 
        return (x + y); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Addition s = new Addition(); 
        System.out.println(s.Addition(10, 20)); 
        System.out.println(s.Addition(10, 20, 30)); 
        System.out.println(s.Addition(10.5, 20.5)); 
    } 
}
