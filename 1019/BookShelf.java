import java.util.*;

public class BookShelf implements Aggregate{
	List<String> books = new ArrayList<>();
	
	public BookShelf(){
		this.books = books;
	}
	
	//任意の位置のbookの取得
	public String getBookAt(int index){
		return books.get(index);
	}
	
	//本の追加
	public void appendBook(String book){
		books.add(book);
	}
	
	//現在の本の数を返す
	public int getLength(){
		return books.size();
	}
	
	//イテレータを返す
	@Override
	public Iterator iterator(){
		return new BookShelfIterator();
	}
}
