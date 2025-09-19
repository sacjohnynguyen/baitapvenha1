package lec10.absstractclass.nonabstractmethod.room;

import java.util.*;

public class MeetingRoom extends Room {

    private int capicity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capicity, String Id, String name, double baseCost) {
        super(Id, name, baseCost);
        this.capicity = capicity;
    }

    public int getCapicity() {
        return capicity;
    }

    public void setCapicity(int capicity) {
        this.capicity = capicity;
    }

    public void addRoom() {
        super.addRoom();
        System.out.print("Enter capicity: ");
        setCapicity(Integer.parseInt(scanner.nextLine()));
    }

    public void updateRoom() {
        super.updateRoom();
        System.out.println("Enter capicity: ");
        setCapicity(Integer.parseInt(scanner.nextLine()));
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Capicity: " + getCapicity());
    }

    @Override
    public double calculateCost() {
        if (getCapicity() > 50) {
            return getBaseCost() + getBaseCost() * 0.2;
        } else {
            return getBaseCost();
        }
    }

}
