public class DataBase
{
	
	UserInput usIn = new UserInput();
	
	String [] name = new String[10];
	String [] job = new String[10];
	int [] age = new int[10];
	
	public void NewPerson (){
		int x = 0;
		System.out.println("Enter user name: "); name [x] = usIn.writeString();
		System.out.println("Enter user job: "); job[x] = usIn.writeString();
		System.out.println("Enter user age: "); age [x] = usIn.intnumb();
		x++;
	}
	
	public void getPersonName(int a){
		System.out.println("Name: " + name [a]);
		System.out.println("Job: " + job[a]);
		System.out.println("Age: " + age[a]);
	}
}
