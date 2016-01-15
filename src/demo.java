import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int demo=sc.nextInt();
		switch(demo)
		{
		case 1: System.out.println("monday");
		          break;
		case 2: System.out.println("tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 4: System.out.println("thrusday");
		break;
		case 5: System.out.println("friday");
		break;
		case 6: System.out.println("saturday");
		break;
		case 7: System.out.println("sunday");
		break;
		
		default: System.out.println("default value");
		break;
		}

	}

}
