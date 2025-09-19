
    package lec10.absstractclass.nonabstractmethod.book;
    import java.util.*;
    public class Booklist {
        ArrayList<Book> booklist = new ArrayList<>();
        public void addBook(Book book){
            book.addBook();
            booklist.add(book);
            System.out.println("Da them");
        }
        public void updateBook(String ID){
            int index=-1;
            for(int i=0;i<booklist.size();i++){
                if(booklist.get(i).getId().equals(ID)){
                    index = i;
                    break;
                }
            }
            if(index!=-1){
                booklist.get(index).updateBook();
                System.out.println("Da cap nhat thanh cong!");
            }
            else{
                System.out.println("Khong tim thay ID!");
            }
        }
        public void deleteBookById(String ID){
            int index = -1;
            for(int i=0;i<booklist.size();i++){
                if(booklist.get(i).getId().equals(ID)){
                    index = i;
                    break;
                }
            }
            if(index!=-1){
                booklist.remove(index);
                System.out.println("Da xoa thanh cong!");
            }
            else{
                System.out.println("Khong tim thay ID!");
            }
        }
        public void  findBookById(String ID){
            int index = -1;

            for(int i=0;i<booklist.size();i++){
                if(booklist.get(i).getId().equals(ID)){
                    index = i;
                    break;
                }
            }
            if(index !=-1){
                booklist.get(index).displayDetails();
                System.out.println("Tim thay sach!");
            }
            else{
                System.out.println("Khong tim thay ID!");
            }
        }
        public void displayAllDetails(){
            for(int i = 0;i<booklist.size();i++){
                booklist.get(i).displayDetails();
            }
        }
        public void findMostExpensiveBook(){
            double max = 0;
            for(int i = 0; i < booklist.size();i++){
                if(booklist.get(i).calculatePrice()>max){
                    max = booklist.get(i).calculatePrice();
                }
            }
            for(int i = 0;i<booklist.size();i++){
                if(max == booklist.get(i).calculatePrice()){
                    booklist.get(i).displayDetails();
                }
            }
            System.out.println("-> Find most enxpénive book success");
        }
        public void countBook(){
            int countT=0;
            int countR=0;
            for(int i =0;i<booklist.size();i++){
                if(booklist.get(i) instanceof TextBook) countT++;
                else if(booklist.get(i) instanceof ReferenceBook) countR++;
            }
            System.out.println("Text Book: "+countT);
            System.out.println("Reference Book: "+countR);
            System.out.println("Book: "+booklist.size());
            System.out.println("Count Book sucess");
        }
    }
