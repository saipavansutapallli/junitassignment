package junitas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tester {
	private Book bookAssign;
	private BookDao bookDao;
	@Before
	public void setUp() throws Exception {
		bookDao=new BookImpl();
		bookAssign=new Book(1, "c", "hello", 110);
	}
	@Test
	public void getAllBookstest() {
		int k=bookDao.getAllBooks().size();
		Assert.assertEquals(1, k);
	
		
	}
	@Test
	public void upBooktest() {
		Assert.assertNotNull(bookDao.updateBook(1, 100));
		
	}

	@Test
	public void delBooktest() {
		Assert.assertNotNull(bookDao.deleteBook(1));
		
	}

	@Test
	public void addBooktest() {
		bookDao.addBook(bookAssign);
		int k=bookDao.getAllBooks().size();
		Assert.assertEquals(2, k);
		
	}

}