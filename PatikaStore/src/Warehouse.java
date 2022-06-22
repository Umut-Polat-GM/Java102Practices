import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Warehouse {

    public static final List<Brand> brands = new LinkedList<>();
    public static final Map<Long, Phone> phones = new HashMap<>();
    public static final Map<Long, Notebook> notebooks = new HashMap<>();

    static {
        Brand samsung = new Brand("Samsung");
        Brand lenovo = new Brand("Lenovo");
        Brand apple = new Brand("Apple");
        Brand huawei = new Brand("Huawei");
        Brand casper = new Brand("Casper");
        Brand asus = new Brand("Asus");
        Brand hp = new Brand("HP");
        Brand xiaomi = new Brand("Xiaomi");
        Brand monster = new Brand("Monster");

        brands.add(samsung);
        brands.add(lenovo);
        brands.add(apple);
        brands.add(huawei);
        brands.add(casper);
        brands.add(asus);
        brands.add(hp);
        brands.add(xiaomi);
        brands.add(monster);

        brands.sort((Brand b1, Brand b2) -> b1.getTitle().toLowerCase().compareTo(b2.getTitle().toLowerCase())); // sort by lexicographical
    }

    public static void addPhone(Phone p) {
        phones.put(p.getId(), p);
    }

    public static void addNotebook(Notebook nb) {
        notebooks.put(nb.getId(), nb);
    }

    public static Notebook deleteNotebookById(long id) {
        return notebooks.remove(id);
    }

    public static Phone deletePhoneById(long id) {
        return phones.remove(id);
    }

    public static void listBrands() {
        int i = 0;
        for (Brand b : brands) {
            System.out.println(i + " - " + b.getTitle());
            i++;
        }
    }

    public static void listPhones() {
        printPhoneTableTemplate();

        for (Phone p : phones.values()) {
            System.out.format("%15s %10s %10s %10s %8s %10s %10s %10s %15s", p.getId(), p.getTitle(), p.getPrice(), p.getBrand().getTitle(), p.getMemory(), p.getScreenSize(), p.getBatteryPower(), p.getRam(), p.getColor() + "\n");
        }
    }

    public static void listNotebooks() {
        printNotebookTableTemplate();

        for (Notebook nb : notebooks.values()) {
            System.out.format("%15s %10s %10s %8s %10s %10s %10s", nb.getId(), nb.getTitle(), nb.getPrice(), nb.getBrand().getTitle(), nb.getMemory(), nb.getScreenSize(), nb.getRam() + "\n");
        }

    }

    public static Notebook getNotebookById(long id) {
        Notebook nb = notebooks.get(id);
        printNotebookTableTemplate();
        System.out.format("%15s %10s %10s %8s %20s %17s %17s", nb.getId(), nb.getTitle(), nb.getPrice(), nb.getBrand().getTitle(), nb.getMemory(), nb.getScreenSize(), nb.getRam() + "\n");
        return notebooks.get(id);
    }

    public static Phone getPhoneById(long id) {
        Phone p = phones.get(id);
        printPhoneTableTemplate();
        System.out.format("%17s %14s %7s %5s %5s %5s %5s %5s %5s", p.getId(), p.getTitle(), p.getPrice(), p.getBrand().getTitle(), p.getMemory(), p.getScreenSize(), p.getBatteryPower(), p.getRam(), p.getColor() + "\n");
        return phones.get(id);
    }

    public static void listNotebookByBrand(String brand) {
        printNotebookTableTemplate();

        for (Notebook nb : notebooks.values()) {
            if (nb.getBrand().getTitle().equals(brand)) {
                System.out.format("%15s %10s %10s %8s %10s %10s %10s", nb.getId(), nb.getTitle(), nb.getPrice(), nb.getBrand().getTitle(), nb.getMemory(), nb.getScreenSize(), nb.getRam() + "\n");
            }
        }
    }

    public static void listPhoneByBrand(String brand) {
        printPhoneTableTemplate();

        for (Phone p : phones.values()) {
            if (p.getBrand().getTitle().equals(brand)) {
                System.out.format("%17s %14s %7s %5s %5s %5s %5s %5s %5s", p.getId(), p.getTitle(), p.getPrice(), p.getBrand().getTitle(), p.getMemory(), p.getScreenSize(), p.getBatteryPower(), p.getRam(), p.getColor() + "\n");
            }
        }
    }

    private static void printNotebookTableTemplate() {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%15s %10s %10s %8s %10s %10s %10s", "PRODUCT ID", "TITLE", "PRICE", "BRAND", "MEMORY", "SCREEN", "RAM");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    private static void printPhoneTableTemplate() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %10s %10s %8s %10s %10s %12s %10s %12s", "PRODUCT ID", "TITLE", "PRICE", "BRAND", "MEMORY", "SCREEN", "BATTERY", "RAM", "COLOR");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
    }

}
