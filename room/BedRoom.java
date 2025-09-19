package lec10.absstractclass.nonabstractmethod.room;

import java.util.*;

public class BedRoom extends Room {

    private int numberofbed;
    Scanner scanner = new Scanner(System.in);

    public BedRoom() {
    }

    public BedRoom(int numberofbed, String Id, String name, double baseCost) {
        super(Id, name, baseCost);
        this.numberofbed = numberofbed;
    }

    public int getNumberofbed() {
        return numberofbed;
    }

    public void setNumberofbed(int numberofbed) {
        this.numberofbed = numberofbed;
    }

    public void addRoom() {
        super.addRoom();
        System.out.println("Enter number of bed: ");
        setNumberofbed(Integer.parseInt(scanner.nextLine()));
    }

    public void updateRoom() {
        super.updateRoom();
        System.out.println("Enter number of bed: ");
        setNumberofbed(Integer.parseInt(scanner.nextLine()));
    }

    public void displayDetails() {
        System.out.println(", Number of bed: " + getNumberofbed());
    }

    @Override
    public double calculateCost() {
        if (numberofbed >= 3) {
            return getBaseCost() + getBaseCost() * 0.1;
        } else {
            return getBaseCost();
        }
    }

}
