package junitas;

import java.util.*;
public class BookImpl implements BookDao{
private Map<Integer,Book> Bookmap;
	private int id=0;
	public BookImpl() {
		Bookmap=new HashMap<>();
		Bookmap.put(++id, new Book(id, "c", "hello", 150));
	}
	@Override
	public List<Book> getAllBooks() {
		
		return new ArrayList<Book>(Bookmap.values());
	}

	@Override
	public Book updateBook(int id, int page) {
		if(Bookmap.get(id) != null)
		{
			Bookmap.get(id).setNoOfpages(page);
			return Bookmap.get(id);
		}
		
		return null;
	}

	@Override
	public Book deleteBook(int id) {
		
		return Bookmap.remove(id);
	}

	@Override
	public void addBook(Book book) {
		Bookmap.put(book.getId(), book);
		
		
	}
	
}