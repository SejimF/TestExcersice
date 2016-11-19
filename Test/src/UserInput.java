import java.util.Scanner;

public class UserInput
{
	Scanner usIn = new Scanner(System.in);
	
	public String writeString(){
		return usIn.nextLine();
	}
	
	public int intnumb(){
		return usIn.nextInt();
	}
}
