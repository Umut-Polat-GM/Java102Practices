import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            array.add(i);
        }

        ThreadsRace thread = new ThreadsRace(array);
        pool.execute(thread);

    }

}