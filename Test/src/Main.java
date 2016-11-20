import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		DataBase db = new DataBase();
		UserInput uin = new UserInput();
		
		db.NewPerson();
		try{
		System.out.println("Enter id: ");
		}catch(Exception e){
			System.out.println("Enter number");
		}
		db.getPersonName(uin.intnumb());
		
		
	}
}
