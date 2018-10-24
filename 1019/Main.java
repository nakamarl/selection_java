import java.util.*;
import java.util.Iterator;

class Main{
	public static void main(String[] args) {
		int index = 0;
		ArrayList<String> books = new ArrayList<>();
		books.add("80日間世界一周");
		books.add("聖書");
		books.add("シンデレラ");
		books.add("あしながおじさん");
		books.add("あしながおじさん");
		Iterator<String> itr = books.iterator();
		while(itr.hasNext()){
			String book = (String)itr.next();
			System.out.printf("%s\n",book);
		}
	}
}
