import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (o1.getName()).compareTo(o2.getName());
            }
        });

        books.add(new Book("Lord of the Rings",520,"J.R.R. Tolkien",1954));
        books.add(new Book("Suc ve Ceza",352,"Fyodor Dostoyevski",1949));
        books.add(new Book("Cezmi",328,"Namik Kemal",1880));
        books.add(new Book("Araba Sevdasi",320,"Recaizade Mahmud Ekrem",1898));
        books.add(new Book("Taht Oyunlari",850,"George Martin",2014));

        System.out.println("--Ada Gore Siralama-- ");
        for(Book book:books){

            System.out.println("Kitap Adi : "+book.getName()+
                    ",\t\t\t Yazar ismi: "+book.getPageNum()+
                    ",\t\t Sayfa Sayisi : "+book.getAuthor()+
                    ",\t\t Yayin Tarihi : "+ book.getPublishDate());
        }


        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()-o2.getPageNum();
            }
        });

        books2.add(new Book("Lord of the Rings",520,"J.R.R. Tolkien",1954));
        books2.add(new Book("Suc ve Ceza",352,"Fyodor Dostoyevski",1949));
        books2.add(new Book("Cezmi",328,"Namik Kemal",1880));
        books2.add(new Book("Araba Sevdasi",320,"Recaizade Mahmud Ekrem",1898));
        books2.add(new Book("Taht Oyunlari",850,"George Martin",2014));

        System.out.println("********************");

        System.out.println("--Sayfa Sayisina Gore Siralama-- ");

        for (Book b:books2){
            System.out.println("Kitap adi : " + b.getName() +
                    ",\t\t\t Sayfa Sayisi : " + b.getPageNum() +
                    ",\t\t Yazarin ismi : " + b.getAuthor() +
                    ",\t\t Yayin Tarihi : " + b.getPublishDate());
        }

    }
}
