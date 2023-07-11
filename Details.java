package Books;
import java.util.*;
class Library{
	private int bkid;
	String title;
	int year;
	public int getId() {
		return bkid;
		
	}
	public void setId(int id) {
		bkid=id;
	}
	void title(String title) {
		System.out.println(title);
	}
	void year(int year) {
		System.out.println(year);
	}
}
	
	
class Book extends Library{
      void author(String author) {
    	  System.out.println(author);
      }
		
	}

class Magazine extends Library{
	void issue(int issue) {
		System.out.println(issue);
	}
}
public class Details extends Magazine{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine m=new Magazine();
		m.setId(118);
		System.out.println(m.getId());
		m.title("legend");
		m.year(1978);
		m.issue(1979);
		System.out.println("====================================================");
		Book b=new Book();
		b.setId(203);
		System.out.println(b.getId());
		b.title("prince");
		b.year(1989);
		b.author("robert");
	
		
		
		

	}
}

	