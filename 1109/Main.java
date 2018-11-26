import java.util.*;
import framework.*;
//アカウント名 id パスワード

public class Main{
	public static void main(String[] args) {
		int id = 100;
		Factory factory = new AccountFactory();
		Product account1 = factory.create("hoge",id++,"password");
		Product account2 = factory.create("fuga",id++,"12345678");
		Product account3 = factory.create("John",id++,"qwerty");
		Product account4 = factory.create("piyo",id++,"abc123");
		
		account1.use();
		account2.use();
		account3.use();
		account4.use();
	}
}
