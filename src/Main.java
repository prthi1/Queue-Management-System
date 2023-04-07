import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    //Static variables used in whole programme
    //Whole queues used in this program
    static LinkedList<String> Pump1 = new LinkedList<>();
    static LinkedList<String> Pump2 = new LinkedList<>();
    static LinkedList<String> Pump3 = new LinkedList<>();
    static LinkedList<String> Pump4 = new LinkedList<>();
    static LinkedList<String> Pump5 = new LinkedList<>();
    static LinkedList<String> Wait = new LinkedList<>();
    //Whole Fuel liters shown queue used in this program
    static LinkedList<Double> Fuel1 = new LinkedList<>();
    static LinkedList<Double> Fuel2 = new LinkedList<>();
    static LinkedList<Double> Fuel3 = new LinkedList<>();
    static LinkedList<Double> Fuel4 = new LinkedList<>();
    static LinkedList<Double> Fuel5 = new LinkedList<>();
    //Other main int values used in this program
    static Double Fuel_Stock = 0.0;
    static Double Income = 0.0;
    static Double Price = 430.0;

    public static void main(String[] args) throws IOException, InterruptedException {
        //Menu
        System.out.println("_________FUEL MENU________");

        // scanner object variable
        Scanner sc = new Scanner(System.in);
        //Connect this class with other two sub classes
        FuelQueue obj1 = new FuelQueue();
        Passenger obj2 = new Passenger();
        while(true) {
            System.out.println("""
                     100 or VFQ: View all Fuel Queues.
                     101 or VEQ: View all Empty Queues.
                     102 or ACQ: Add customer to a Queue.
                     103 or RCQ: Remove a customer from a Queue.(Before identify the customer index number)
                     104 or PCQ: Remove a served customer.
                     105 or VCS: View Customers Sorted in alphabetical order.
                     106 or SPD: Store Program Data into file.
                     107 or LPD: Load Program Data from file.
                     108 or STK: View Remaining Fuel Stock.
                     109 or AFS: Add Fuel Stock.
                     110 or IFS: Print the Income.
                     999 or EXT: Exit the Program.""");
            System.out.println("Enter your option: ");
            String option = sc.nextLine();
            if(option.equals("100") || option.equalsIgnoreCase("VFQ")) {
                obj1.VFQ();

            }else if(option.equals("101") || option.equalsIgnoreCase("VEQ")){
                obj1.VEQ();

            }else if(option.equals("102") || option.equalsIgnoreCase("ACQ")) {
                try {
                    System.out.print("Enter customer first name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter customer second name: ");
                    String lname = sc.nextLine();
                    System.out.print("Enter customer vehicle No: ");
                    String vehi = sc.nextLine();
                    try {
                        System.out.print("Enter No. of liters customer want: ");
                        double liters = sc.nextDouble();
                        obj2.ACQ(fname, lname, vehi, liters);

                    } catch (Exception e) {
                        System.out.println("Please enter a integer value");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter only String values");
                }
            }else if(option.equals("103") || option.equalsIgnoreCase("RCQ")) {
                obj1.RCQ();

            }else if(option.equals("104") || option.equalsIgnoreCase("PCQ")) {
                obj1.PCQ();

            }else if(option.equals("105") || option.equalsIgnoreCase("VCS")) {
                    obj1.VCS();

            }else if(option.equals("106") || option.equalsIgnoreCase("SPD")) {
                    obj1.SPD();

            }else if(option.equals("107") || option.equalsIgnoreCase("LPD")) {
                    obj1.LPD();
            }else if(option.equals("108") || option.equalsIgnoreCase("STK")) {
                    obj1.STK();
            }else if(option.equals("109") || option.equalsIgnoreCase("AFS")) {
                    try {
                        System.out.print("Enter the new stock amount(liters): ");
                        Double new_stock = sc.nextDouble();
                        obj1.AFS(new_stock);
                    } catch (Exception e) {
                        System.out.println("Please enter a integer value");
                    }

            }else if(option.equals("110") || option.equalsIgnoreCase("IFS")) {
                    obj1.IFS();

            }else if(option.equals("999") || option.equalsIgnoreCase("EXT")) {
                System.out.println("Exit the Program");
                break;
            }else
                System.out.println("Invalid, Enter again ");

            }
        }


}

