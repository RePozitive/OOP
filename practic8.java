import java.util.Stack;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String s;
		Stack<String> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4;i++){
		    s=sc.nextLine();
		    stack.push(s);
		}
		for(int i=0; i<4;i++){
		   System.out.println(stack.pop());
		}
	}
}
