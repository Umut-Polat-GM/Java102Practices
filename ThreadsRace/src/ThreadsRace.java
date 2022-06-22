import java.util.ArrayList;

public class ThreadsRace implements Runnable {

    ArrayList<Integer> numbers;
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();

    public ThreadsRace(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
        printOdd();
        printEven();

    }

    public synchronized void printOdd() {
        System.out.println("Tek sayilar listesi : "+this.odd);

    }

    public synchronized void printEven() {
        System.out.println("Cift sayilar listesi : "+this.even);
    }

}