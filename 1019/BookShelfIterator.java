import java.util.*;

public class BookShelfIterator implements Iterator{
	private List<String> books = new ArrayList<>();
	private int index;
	
	BookShelfIterator(){
		this.books = books;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext(){
		if(index < books.size()){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public Object next(){
		String book = books.get(index);
		index++;
		return book;
	}
}
