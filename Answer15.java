 package answer15;

 
public class Answer15 {

    
    public static void main(String[] args) {
 double a, b, c, root1, root2;
        a = 1;
        b = 8;
        c = 4;
        root1 = (-b - (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
        root2 = (-b + (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
          
        System.out.println("the value of root1 = " + root1);
        
        System.out.println("the value of root2 = " + root2);
    }
    
}
