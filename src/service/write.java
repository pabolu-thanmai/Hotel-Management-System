package service;

import java.io.*;

public class write implements Runnable {
    holder hotel_ob;

    public write(holder hotel_ob) {
        this.hotel_ob = hotel_ob;
    }

    public void run() {
        try {
            FileOutputStream fout = new FileOutputStream("backup");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(hotel_ob);
            oos.close();
            fout.close();
        } catch (Exception e) {
            System.out.println("Error in writing " + e);
        }
    }
}
