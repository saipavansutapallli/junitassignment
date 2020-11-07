package junitas;

public class Book {
	 private int id;
	    private String bookname;
	    private String author;
	    private int NoOfpages;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNameOfTheBook() {
			return bookname;
		}
		public void setNameOfTheBook(String bookname) {
			this.bookname = bookname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getNoOfpages() {
			return NoOfpages;
		}
		public void setNoOfpages(int noOfpages) {
			NoOfpages = noOfpages;
		}
		public Book(int id, String bookname, String author, int noOfpages) {
			super();
			this.id = id;
			this.bookname = bookname;
			this.author = author;
			NoOfpages = noOfpages;
		}
		public Book() {
			super();
		}
		@Override
		public String toString() {
			return "JunitAssignmentBook [id=" + id + ", bookname=" + bookname + ", author=" + author
					+ ", NoOfpages=" + NoOfpages + "]";
		}
	   
	
		
}