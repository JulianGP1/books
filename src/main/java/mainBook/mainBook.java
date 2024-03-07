
package mainBook;
import com.mycompany.book.Book;


public class mainBook {
    
    public static void main(String[] args) {
        
        Book book_one = new Book("los de abajo","Mariano Azuela","Fantasia","1907","DISPONIBLE","1",3,"","","");
        Book book_two = new Book("la republica","platon","politico","VII","DISPONIBLE","1",3,"","","");
        Book book_three = new Book("El principito"," Saint-Exupéry.","Literatura infantil","1943","DISPONIBLE","1",3,"","",""); 
        Book book_four = new Book("cronica de una muerte anunciada","Gabriel G. Marquez","Fantastico","1913","DISPONIBLE","1",3,"","","");
        Book book_five = new Book("La Odisea","HOMERO","Epico","VII","DISPONIBLE","1",3,"","","");
        
       
        book_one.lendBook();
        book_one.printBook();
       
   
        
    }
    
}
