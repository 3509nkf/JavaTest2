package sample;


public class UserInfo {
	int id;
	String name;
	int age;
	
	void setId(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	public static void main(String[] args) {
		
		UserInfo original = new UserInfo();
		original.setId(2);
		original.setName("山田　太郎");
		original.setAge(30);
		UserInfo copied = original;
		copied.setAge(31);
		System.out.println(original.getAge());
		}
}
	


