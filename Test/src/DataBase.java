import java.util.InputMismatchException;

public class DataBase
{
	
	UserInput usIn = new UserInput();
	
	String [] name = new String[10];
	String [] job = new String[10];
	int [] age = new int[10];
	
	private String setName(String a){
		int x = 0;
		try{
		return name [x] = usIn.writeString();
		}catch(InputMismatchException e){
			System.out.println("Enter String");
			return name [x] = usIn.writeString();
		}
	}
	
	private String setJob(String a){
		int x = 0;
		try{
		return job [x] = usIn.writeString();
		}catch(InputMismatchException e){
			System.out.println("Enter String");
			return job [x] = usIn.writeString();
		}
		
	}
	
	private int setAge(int a){
		int x = 0;
		try{
		return age [x] = usIn.intnumb();
		}catch(InputMismatchException e){
			System.out.println("Enter number");
			return age [x] = usIn.intnumb();
		}
	}
	
	public void NewPerson (){
		int x = 0;
		System.out.println("Enter user name: "); setName(usIn.writeString());
		System.out.println("Enter user job: "); setJob(usIn.writeString());
		System.out.println("Enter user age: "); setAge(usIn.intnumb());
		x++;
	}
	
	public void getPersonName(int a){
		System.out.println("Name: " + name [a]);
		System.out.println("Job: " + job[a]);
		System.out.println("Age: " + age[a]);
	}
}
