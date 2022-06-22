import java.util.Scanner;

public class Menu {

    public static void run() {
        int selection;
        Scanner s = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        do {

            System.out.println("****************** PATIKA STORE PRODUCT MANAGEMENT PANEL ******************");
            System.out.println("1 - Notebook Operations");
            System.out.println("2 - Phone Operations");
            System.out.println("3 - List Brands ");
            System.out.println("0 - Exit ");
            System.out.print("Selection :  ");
            selection = s.nextInt();

            switch (selection) {

                // NOTEBOOK OPERATIONS
                case 1 -> {
                    do {
                        printProductOperationsTemplate("Notebook");
                        selection = s.nextInt();

                        switch (selection) {
                            case 1 -> {
                                System.out.println("--- Brands ---");
                                Warehouse.listBrands();
                                System.out.print("Select a brand : ");
                                int brandNum = st.nextInt();
                                st.nextLine();
                                System.out.println("Enter values leaving space between them (Title, Price, Discount Rate, Quantity, Memory, Screen Size, Ram)");
                                String values = st.nextLine();
                                String arr[] = values.split(" ");
                                Warehouse.addNotebook(new Notebook(
                                        Double.valueOf(arr[1]),
                                        Double.valueOf(arr[2]),
                                        Integer.valueOf(arr[3]),
                                        arr[0],
                                        Warehouse.brands.get(brandNum),
                                        Integer.valueOf(arr[4]),
                                        Double.valueOf(arr[5]),
                                        Integer.valueOf(arr[6])
                                ));

                            }

                            case 2 -> {
                                System.out.println("****************************** DELETE BY ID ******************************");
                                System.out.print("Enter the unique product id : ");
                                Long id = Long.valueOf(st.nextLine());
                                Warehouse.deleteNotebookById(id);
                            }

                            case 3 -> {
                                Warehouse.listNotebooks();
                            }

                            case 4 -> {
                                System.out.println("****************************** GET BY ID ******************************");
                                System.out.print("Enter the unique product id : ");
                                Long id = Long.valueOf(st.nextLine());
                                Warehouse.getNotebookById(id);
                            }

                            case 5 -> {
                                System.out.println("****************************** LIST BY BRAND ******************************");
                                System.out.print("Enter the Brand : ");
                                String brand = st.nextLine();
                                Warehouse.listNotebookByBrand(brand);
                            }

                        }

                    } while (selection != 6);

                }

                //PHONE OPERATIONS
                case 2 -> {
                    do {
                        printProductOperationsTemplate("Phone");
                        selection = s.nextInt();

                        switch (selection) {
                            case 1 -> {
                                System.out.println("--- Brands ---");
                                Warehouse.listBrands();
                                System.out.print("Select a brand : ");
                                int brandNum = st.nextInt();
                                st.nextLine();
                                System.out.println("Enter values leaving space between them (Title, Price, Discount Rate, Quantity, Memory, Screen Size, Ram , Battery, Color)");
                                String values = st.nextLine();
                                String arr[] = values.split(" ");
                                Warehouse.addPhone(new Phone(
                                        Integer.valueOf(arr[7]),
                                        Double.valueOf(arr[1]),
                                        Double.valueOf(arr[2]),
                                        Integer.valueOf(arr[3]),
                                        arr[0],
                                        Warehouse.brands.get(brandNum),
                                        Integer.valueOf(arr[4]),
                                        Double.valueOf(arr[5]),
                                        Integer.valueOf(arr[6]),
                                        arr[8]
                                ));
                            }

                            case 2 -> {
                                System.out.println("****************************** DELETE BY ID ******************************");
                                System.out.print("Enter the unique product id : ");
                                Long id = Long.valueOf(st.nextLine());
                                Warehouse.deletePhoneById(id);
                            }

                            case 3 -> {
                                Warehouse.listPhones();
                            }

                            case 4 -> {
                                System.out.println("****************************** GET BY ID ******************************");
                                System.out.print("Enter the unique product id : ");
                                Long id = Long.valueOf(st.nextLine());
                                Warehouse.getPhoneById(id);
                            }

                            case 5 -> {
                                System.out.println("****************************** LIST BY BRAND ******************************");
                                System.out.print("Enter the Brand : ");
                                String brand = st.nextLine();
                                Warehouse.listPhoneByBrand(brand);
                            }

                        }

                    } while (selection != 6);
                }

                case 3 -> {
                    System.out.println("**************** BRANDS ****************");
                    Warehouse.listBrands();
                }

            }

        } while (selection != 0);
    }

    public static void printProductOperationsTemplate(String productName) {
        System.out.println("----------------" + productName + " Management ----------------");
        System.out.println("1 - Add " + productName);
        System.out.println("2 - Delete " + productName + " by Id");
        System.out.println("3 - List " + productName);
        System.out.println("4 - Get " + productName + " by Id");
        System.out.println("5 - List " + productName + " by Brand");
        System.out.println("6 - Return Main Menu ");
        System.out.print("Selection :  ");
    }
}