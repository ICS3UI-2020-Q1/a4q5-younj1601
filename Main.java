import java.util.Scanner;
/**
 *Takes interger and prints hailstone sequence
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get positive interger
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int num = input.nextInt();

    while(num > 1){
      if((num % 2) = 0){
        num = num/2;
        System.out.println(num);
      }
    }
    
  }
}
