import java.io.*;
import java.util.*;
import java.util.Arrays;
//Called this class as a Passenger class extend
public class FuelQueue extends Main {

    Scanner sc = new Scanner(System.in);

    public void VFQ(){
        //View all queues
        System.out.println("This is queue 1 " + Pump1);
        System.out.println("This is queue 2 " + Pump2);
        System.out.println("This is queue 3 " + Pump3);
        System.out.println("This is queue 4 " + Pump4);
        System.out.println("This is queue 5 " + Pump5);

    }
    public void VEQ(){
        //View only empty queues
        //Checking queue size
        if(Pump1.size()==0 || Pump2.size()==0 || Pump3.size()==0 || Pump4.size()==0 || Pump5.size()==0) {
            if (Pump1.size()==0) {
                System.out.println("This is queue 1 " + Pump1);
            }
            if (Pump2.size()==0) {
                System.out.println("This is queue 2 " + Pump2);
            }
            if (Pump3.size()==0) {
                System.out.println("This is queue 3 " + Pump3);
            }
            if (Pump4.size()==0) {
                System.out.println("This is queue 4 " + Pump4);
            }
            if (Pump5.size()==0) {
                System.out.println("This is queue 5 " + Pump5);
            }

        }else{
            System.out.println("No empty Queues");
        }
    }
    public void RCQ(){
        //Delete specific customer from a queue
        System.out.println("This is queue 1 " + Pump1);
        System.out.println("This is queue 2 " + Pump2);
        System.out.println("This is queue 3 " + Pump3);
        System.out.println("This is queue 4 " + Pump4);
        System.out.println("This is queue 5 " + Pump5);
        System.out.print("The customer do you want delete in which queue:(1/2/3/4/5) ");
        String del_queue = sc.nextLine();
        if(Objects.equals(del_queue, "1")){
            System.out.println("This is queue 1 " + Pump1);
            System.out.print("What is the index place of that customer starting from 1-6: ");//Getting queue number
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                    Pump1.remove(index_place - 1);//Remove name in queue
                    Fuel1.remove(index_place - 1);//Remove liter value in queue
                    System.out.println("You successfully remove that customer");
                    if (Wait.size() != 0) {
                        String pass = Wait.poll();//Empty slot in that replacing by waiting list one
                        Pump1.add(pass);
                    }

                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "2")) {
            System.out.println("This is queue 2 " + Pump2);
            System.out.print("What is the index place of that customer starting from 1-6: ");//Getting queue number
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                    Pump2.remove(index_place-1);//Remove name in queue
                    Fuel2.remove(index_place-1);//Remove liter value in queue
                    System.out.println("You successfully remove that customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();//Empty slot in that replacing by waiting list one
                        Pump2.add(pass);
                    }

                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "3")) {
            System.out.println("This is queue 3 " + Pump3);
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                    Pump3.remove(index_place-1);
                    Fuel3.remove(index_place-1);
                    System.out.println("You successfully remove that customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump3.add(pass);
                    }

                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "4")) {
            System.out.println("This is queue 4 " + Pump4);
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                    Pump4.remove(index_place-1);
                    Fuel4.remove(index_place-1);
                    System.out.println("You successfully remove that customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump4.add(pass);
                    }

                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "5")) {
            System.out.println("This is queue 5 " + Pump5);
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                    Pump5.remove(index_place-1);
                    Fuel5.remove(index_place-1);
                    System.out.println("You successfully remove that customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump5.add(pass);
                    }

                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else {
            System.out.println("Please select a right queue number");
        }
    }
    public void PCQ(){
        //Delete served customer from a queue
        System.out.println("This is queue 1 " + Pump1);
        System.out.println("This is queue 2 " + Pump2);
        System.out.println("This is queue 3 " + Pump3);
        System.out.println("This is queue 4 " + Pump4);
        System.out.println("This is queue 5 " + Pump5);
        System.out.print("The customer do want delete in which queue:(1/2/3/4/5) ");
        String del_served = sc.nextLine();
        if (Objects.equals(del_served, "1")) {
            try {
                double liters = Fuel1.poll();
                if (Fuel_Stock >= liters) {
                    Fuel_Stock -= liters;//Getting Fuel liter of customer want and decrease that from Fuel stock
                    Income += liters * Price;
                    if (Fuel_Stock <= 500) {
                        System.out.println("Warning! there are low fuel amount in stock");//If Fuel stock is less warn a message
                    }

                    Pump1.remove();
                    System.out.println("You successfully remove first customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();//Remove that queue position and adding waiting list one to that queue
                        Pump1.add(pass);
                    }
                } else {
                    System.out.println("Not enough Fuel Stock");
                }
            }catch (Exception e){
                System.out.println("Queue already is empty");
            }
        } else if (Objects.equals(del_served, "2")) {
            try {
                double liters = Fuel2.poll();
                if (Fuel_Stock >= liters) {
                    Fuel_Stock -= liters;
                    Income += liters * Price;
                    if (Fuel_Stock <= 500) {
                        System.out.println("Warning! there are low fuel amount in stock");
                    }

                    Pump2.remove();
                    System.out.println("You successfully remove first customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump2.add(pass);
                    }
                } else {
                    System.out.println("Not enough Fuel Stock");
                }
            }catch (Exception e){
                System.out.println("Queue already is empty");
            }
        } else if (Objects.equals(del_served, "3")) {
            try {
                double liters = Fuel3.poll();
                if (Fuel_Stock >= liters) {
                    Fuel_Stock -= liters;
                    Income += liters * Price;
                    if (Fuel_Stock <= 500) {
                        System.out.println("Warning! there are low fuel amount in stock");
                    }

                    Pump3.remove();
                    System.out.println("You successfully remove first customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump3.add(pass);
                    }
                } else {
                    System.out.println("Not enough Fuel Stock");
                }
            }catch (Exception e){
                System.out.println("Queue already is empty");
            }
        } else if (Objects.equals(del_served, "4")) {
            try {
                double liters = Fuel4.poll();
                if (Fuel_Stock >= liters){
                    Fuel_Stock -= liters;
                    Income += liters*Price;
                    if(Fuel_Stock <= 500){
                        System.out.println("Warning! there are low fuel amount in stock");
                    }

                    Pump4.remove();
                    System.out.println("You successfully remove first customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump4.add(pass);
                    }
                } else {
                    System.out.println("Not enough Fuel Stock");
                }
            }catch (Exception e){
                System.out.println("Queue already is empty");
            }
        } else if (Objects.equals(del_served, "5")) {
            try {
                double liters = Fuel5.poll();
                if (Fuel_Stock >= liters) {
                    Fuel_Stock -= liters;
                    Income += liters * Price;
                    if (Fuel_Stock <= 500) {
                        System.out.println("Warning! there are low fuel amount in stock");
                    }

                    Pump5.remove();
                    System.out.println("You successfully remove first customer");
                    if(Wait.size()!=0) {
                        String pass = Wait.poll();
                        Pump5.add(pass);
                    }
                } else {
                    System.out.println("Not enough Fuel Stock");
                }
            }catch (Exception e){
                System.out.println("Queue already is empty");
            }
        }
        else {
            System.out.println("Please select a right queue number");
        }
    }
    public void VCS(){
        //Sorting the queue as alphabetical order
        if(Pump1.size() != 0) {
            String[] q1 = new String[Pump1.size()];//Queue implement from a list
            int a1 = 0;
            for (String i1 : Pump1) {
                q1[a1] = i1;
                a1++;
            }
            Arrays.sort(q1, String.CASE_INSENSITIVE_ORDER);//Print that list
            System.out.println("This is queue 1: " + Arrays.toString(q1));
        }
        else{
            System.out.println("The queue 1 is empty");
        }
        if(Pump2.size() != 0) {
            String[] q2 = new String[Pump2.size()];
            int a2 = 0;
            for (String i2 : Pump2){
                q2[a2] = i2;
                a2++;
            }
            Arrays.sort(q2, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 2: " + Arrays.toString(q2));
        }
        else{
            System.out.println("The queue 2 is empty");
        }
        if(Pump3.size() != 0) {
            String[] q3 = new String[Pump3.size()];
            int a3 = 0;
            for (String i3 : Pump3){
                q3[a3] = i3;
                a3++;
            }
            Arrays.sort(q3, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 3: " + Arrays.toString(q3));
        }
        else{
            System.out.println("The queue 3 is empty");
        }
        if(Pump4.size() != 0) {
            String[] q4 = new String[Pump4.size()];
            int a4 = 0;
            for (String i4 : Pump4){
                q4[a4] = i4;
                a4++;
            }
            Arrays.sort(q4, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 4: " + Arrays.toString(q4));
        }
        else{
            System.out.println("The queue 4 is empty");
        }
        if(Pump5.size() != 0) {
            String[] q5 = new String[Pump5.size()];
            int a5 = 0;
            for (String i5 : Pump5){
                q5[a5] = i5;
                a5++;
            }
            Arrays.sort(q5, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 5: " + Arrays.toString(q5));
        }
        else{
            System.out.println("The queue 5 is empty");
        }
        if(Wait.size() != 0) {
            String[] qw = new String[Wait.size()];
            int aw = 0;
            for (String iw : Wait){
                qw[aw] = iw;
                aw++;
            }
            Arrays.sort(qw, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is waiting list: " + Arrays.toString(qw));
        }

    }
    public void SPD() throws FileNotFoundException {
        //Store that queue and other data to a files
        PrintWriter out1 = new PrintWriter("Data1.txt");
        PrintWriter out2 = new PrintWriter("Data2.txt");
        PrintWriter out3 = new PrintWriter("Data3.txt");
        PrintWriter out4 = new PrintWriter("Data4.txt");
        PrintWriter out5 = new PrintWriter("Data5.txt");
        PrintWriter outW = new PrintWriter("DataW.txt");
        PrintWriter outF = new PrintWriter("DataF.txt");
        for(String i1: Pump1){
            out1.println(i1);//Write values into the file
        }
        for(String i2: Pump2){
            out2.println(i2);
        }
        for(String i3: Pump3){
            out3.println(i3);
        }
        for(String i4: Pump4){
            out4.println(i4);
        }
        for(String i5:Pump5){
            out5.println(i5);
        }

        outF.println(Fuel_Stock);
        out1.flush();
        out2.flush();
        out3.flush();
        out4.flush();
        out5.flush();
        outW.flush();
        outF.flush();
        out1.close();
        out2.close();
        out3.close();
        out4.close();
        out5.close();
        outW.close();
        outF.close();
        System.out.println("You successfully stored the program data into file");

    }
    public void LPD() throws IOException {
        //Retrieve that queue and other data from a file
        BufferedReader in1 = new BufferedReader(new FileReader("Data1.txt"));
        String line1 = in1.readLine();
        while (line1 != null) {
            Pump1.add(line1);//Read values from files
            line1 = in1.readLine();
        }
        System.out.println("This is queue 1 " + Pump1);
        BufferedReader in2 = new BufferedReader(new FileReader("Data2.txt"));
        String line2 = in2.readLine();
        while (line2 != null) {
            Pump2.add(line2);
            line2 = in2.readLine();
        }
        System.out.println("This is queue 2 " + Pump2);
        BufferedReader in3 = new BufferedReader(new FileReader("Data3.txt"));
        String line3 = in3.readLine();
        while (line3 != null) {
            Pump3.add(line3);
            line3 = in3.readLine();
        }
        System.out.println("This is queue 3 " + Pump3);
        BufferedReader in4 = new BufferedReader(new FileReader("Data4.txt"));
        String line4 = in4.readLine();
        while (line4 != null) {
            Pump4.add(line4);
            line4 = in4.readLine();
        }
        System.out.println("This is queue 4 " + Pump4);
        BufferedReader in5 = new BufferedReader(new FileReader("Data5.txt"));
        String line5 = in5.readLine();
        while (line5 != null) {
            Pump5.add(line5);
            line5 = in5.readLine();
        }
        System.out.println("This is queue 5 " + Pump5);
        BufferedReader inW = new BufferedReader(new FileReader("DataW.txt"));

        BufferedReader inF = new BufferedReader(new FileReader("DataF.txt"));
        Fuel_Stock = Double.parseDouble(inF.readLine());
        System.out.println("This is remaining Fuel Stock " + Fuel_Stock);
        in1.close();
        in2.close();
        in3.close();
        in4.close();
        in5.close();
        inW.close();
        inF.close();
        System.out.println("You successfully loaded the program data from file");
    }
    public void STK(){
        //View remaining fuel stock
        System.out.println("Remaining fuel stock is " + Fuel_Stock + " liters");
    }
    public void AFS(Double new_Stock){
        //Add fuel stock
        if(Fuel_Stock + new_Stock > 6600){//Checking over the limit of stock
            System.out.println("Your fuel stock gone over than 6600 liters");
        } else if (Fuel_Stock + new_Stock <= 6600) {
            Fuel_Stock += new_Stock;
            System.out.println("You successfully added the new stock to fuel stock");
        }
    }
    public void IFS(){
        //View fuel station income
        System.out.println("The income is Rs." + Income);
    }
}
