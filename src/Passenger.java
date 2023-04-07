//Called this class as a main class extend
public class Passenger extends Main {

    public void ACQ(String fname, String lname, String vehi, double liters){//First checking which queue is fewer customers
        int choice_que = 0;
        if(Pump1.size() == Pump2.size() && Pump2.size() == Pump3.size() && Pump3.size() == Pump4.size() && Pump4.size() == Pump5.size() && Pump1.size() < 6){
            choice_que = 1;
        } else if(Pump1.size() > Pump2.size() &&  Pump2.size() < 6){
            choice_que = 2;
        } else if(Pump2.size() > Pump3.size() && Pump3.size() < 6) {
            choice_que = 3;
        } else if(Pump3.size() > Pump4.size() && Pump4.size() < 6) {
            choice_que = 4;
        } else if(Pump4.size() > Pump5.size() && Pump5.size() < 6) {
            choice_que = 5;
        }
        if(choice_que == 1) {
            Pump1.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);//Adding first, second names and vehicle number to the one queue
            Fuel1.add(liters);//Adding liters that customer want to a another liter queue
            System.out.println("Successfully you add to the queue 1");
        } else if (choice_que == 2) {
            Pump2.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel2.add(liters);
            System.out.println("Successfully you add to the queue 2");
        } else if (choice_que == 3) {
            Pump3.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel3.add(liters);
            System.out.println("Successfully you add to the queue 3");
        } else if (choice_que == 4) {
            Pump4.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel4.add(liters);
            System.out.println("Successfully you add to the queue 4");
        } else if (choice_que == 5) {
            Pump5.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel5.add(liters);
            System.out.println("Successfully you add to the queue 5");
        } else{
            System.out.println("All the queue are full fill");
            Wait.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            System.out.println("Successfully you add to the waiting list");
        }
    }
}

