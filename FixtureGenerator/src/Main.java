import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenerbahce");
        list.add("Gaziantepspor");
        list.add("Galatasaray");
        list.add("Besiktas");
        list.add("Trabzonspor");
        list.add("Bursaspor");
        FixtureGenerator fixtureGenerator = new FixtureGenerator();
        List<List<Match>> all= fixtureGenerator.getFixtures(list);
        fixtureGenerator.print(all);

    }
}
