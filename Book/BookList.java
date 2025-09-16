
package lec10.absstractclass.btvn1.Book;
import java.util.*;
public class BookList {
    ArrayList<Book> booklist = new ArrayList<>();
    public void addBook(Book book){
        book.nhap();
        System.out.println("Them danh sach thanh cong");
    }
    public boolean updateBookById(String Id){
        for(int i = 0; i<booklist.size();i++){
            Book book = booklist.get(i);
            if(book.updateBookById(Id)){
                return true;
            }
        }
        return false;
    }
    public void deleteBookById(String Id){
        for(int i = 0;i<booklist.size();i++){
            if(booklist.get(i).getId().equals(Id)){
                booklist.remove(i);
                System.out.println("Da xoa");
            }
            else {System.out.println("Khong tim thay sach de xoa");}
        }
        
    }
    public Book findBook(String Id){
        if(Id == null){
            return null;
        }
        for(int i = 0;i<booklist.size();i++){
            Book b = booklist.get(i);
            if(Id.equals(b.getId())){
                return b;
            }
        }
        return null;
    }
    public void displayBook(){
        if(booklist.isEmpty()){
            System.out.println("Danh sach trong rong");
        }else{
            for(int i=0;i<booklist.size();i++){
                booklist.get(i).xuat();
            }
        }
    }
    public Book findMax(){
        if(booklist.isEmpty()){
            return null;
        }else{
            Book maxbook = booklist.get(0);
            for(int i=0;i<booklist.size();i++){
                Book b = booklist.get(i);
                if(maxbook.caculatePrice()<b.caculatePrice()){
                    return b;
                }
            }
            return maxbook;
        }
    }
    public void countBook(){
        int tBook=0;
        int rBook=0;
        for(int i=0;i<booklist.size();i++){
            if(booklist.get(i) instanceof TextBook) tBook++;
            else if(booklist.get(i) instanceof ReferenceBook) rBook++;
        }
        System.out.println("So TextBook: "+tBook);
        System.out.println("So ReferenceBook: "+rBook);
        
    }
}
