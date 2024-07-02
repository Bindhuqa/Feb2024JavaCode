package javasessions;

public class Book {
	String title;
	String author;
	int pagecount;
	int totalbooks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bookscount = 0;
		
		Book b1 = new Book();
		b1.title = "Hound of bhaskarville";
		b1.author = "shakesphere";
		b1.pagecount = 200;
		b1.totalbooks = 50;
		System.out.println(b1.title+" "+b1.author+" "+b1.pagecount);
		System.out.println("Total number of books:"+" "+b1.totalbooks);
		bookscount++;
		
		
		Book b2 = new Book();
		b2.title = "Truewords";
		b2.author = "chetanbhagat";
		b2.pagecount = 150;
		b2.totalbooks = 75;
		System.out.println(b2.title+" "+b2.author+" "+b2.pagecount);
		System.out.println("Total number of books:"+" "+b2.totalbooks);
		bookscount++;
		
		
		Book b3 = new Book();
		b3.title = "Holygrail";
		b3.author = "Thomas";
		b3.pagecount = 300;
		b3.totalbooks = 30;
		System.out.println(b3.title+" "+b3.author+" "+b3.pagecount);
		System.out.println("Total number of books:"+" "+b3.totalbooks);
		bookscount++;
		
		b3.pagecount = 270;
		
		System.out.println(b3.title+" "+b3.author+" "+b3.pagecount);
		System.out.println("Total number of books:"+" "+b3.totalbooks);
		
		Book b4 = new Book();
		b4.title = "Significance";
		b4.author = "borris";
		b4.pagecount = 75;
		b4.totalbooks = 120;
		System.out.println(b4.title+" "+b4.author+" "+b4.pagecount);
		System.out.println("Total number of books:"+" "+b4.totalbooks);
		bookscount++;
		
		System.out.println("total number of books"+" "+"="+" "+bookscount);
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
