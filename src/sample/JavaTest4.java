package sample;

public class UserInfo {
	public static void main(String[] args) {
	UserInfo original = new UserInfo();
	original.setId(2);
	original.setName("山田 太郎");
	original.setAge(30);
	UserInfo copied = original;
	copied.setAge(31);
	System.out.println(original.getAge());
	}
	

}
