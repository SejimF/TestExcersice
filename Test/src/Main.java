import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		DataBase db = new DataBase();
		UserInput uin = new UserInput();
		
		db.NewPerson();
		
		System.out.println("Enter id: ");
		try{
		db.getPersonName(uin.intnumb());
		}catch(Exception e){
			
		}
		
	}
}
