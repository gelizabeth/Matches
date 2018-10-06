
package matches;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Liza
 * The countMatches method gets input number as an argument and
 * calculates the number of matches needed. The squares must form a rectangle that 
 * is the most closest in shape to a square. So width will be square root of number of squares 
 * and length - number of squares / width. And for the rectangle it's needed width*(length+1)+ length*(width+1) matches.
 * Also it's needed to count squares that are not in rectangle 
 * by counting number of squares - area of a reactangle (width*length). And then just count matches left = 2*leftSquares+1.
 */
public class Matches {
  
    public static int countMatches(int n){
        int width, length, leftSquares, matches;
        
        width = (int)Math.sqrt(n);
        length = n/width;
        matches = width*(length+1)+ length*(width+1);
        leftSquares = n - width*length;
        if(leftSquares!=0){
            matches += 2*leftSquares+1;
        } 
        return matches;
    }
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of squares between 1 and 1000000000: ");
        int n = in.nextInt();
        
        if(n<1||
           n>1000000000){
            System.err.println("Oops.. The number of squares must be between 1 and 1000000000. Please, try again!");
        } else 
            System.out.println("The number of matches is: "
                                +countMatches(n));
    }
    
}
