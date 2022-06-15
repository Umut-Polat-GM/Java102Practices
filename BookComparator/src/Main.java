import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Lord of the Rings","J.R.R. Tolkien",520,1954);
        Book b2 = new Book("Suc ve Ceza","Fyodor Dostoyevski",352,1949);
        Book b3 = new Book("Cezmi","Namık Kemal",328,1880);
        Book b4 = new Book("Araba Sevdasi","Recaizade Mahmud Ekrem",320,1898);
        Book b5=new Book("Taht Oyunlari","George Martin",850,2014);

        TreeSet<Book> books = new TreeSet<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("--Ada Gore Siralama-- ");
        for(Book book:books){

            System.out.println("Kitap Adi : "+book.getName()+
                    ",\t\t\t Yazar : "+book.getPageNum()+
                    ",\t\t Sayfa Sayisi : "+book.getAuthor()+
                    ",\t\t Yayın Tarihi : "+ book.getPublishDate());
        }


        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()-o2.getPageNum();
            }
        });
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);

        System.out.println("********************");

        System.out.println("--Sayfa Sayisina Gore Siralama-- ");

        for (Book b:books2){
            System.out.println("Kitap adi : " + b.getName() +
                    ",\t\t\t Sayfa Sayisi : " + b.getPageNum() +
                    ",\t\t Yazarin İsmi : " + b.getAuthor() +
                    ",\t\t Yayin Tarihi : " + b.getPublishDate());
        }

    }
}
