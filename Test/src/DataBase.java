public class DataBase
{
	
	UserInput usIn = new UserInput();
	UserInfo ui = new UserInfo();
	
	public void person (){
		System.out.println("Enter user name: "); ui.setName(usIn.writeString());
		System.out.println("Enter user job: "); ui.setJob(usIn.writeString());
		System.out.println("Enter user age: "); ui.setAge(usIn.intnumb());
	}
}
