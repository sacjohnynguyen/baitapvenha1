package lec10.absstractclass.nonabstractmethod.room;

import java.util.*;

public abstract class Room implements IRoom {

    private String Id;
    private String name;
    private double baseCost;
    Scanner scanner = new Scanner(System.in);

    public Room() {
    }

    public Room(String Id, String name, double baseCost) {
        this.Id = Id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void addRoom() {
        System.out.println("Enter ID: ");
        setId(scanner.nextLine());
        System.out.println("Enter name: ");
        setName(scanner.nextLine());
        System.out.println("Enter Base Cost: ");
        setBaseCost(Integer.parseInt(scanner.nextLine()));
    }

    public void updateRoom() {
        System.out.println("Enter name: ");
        setName(scanner.nextLine());
        System.out.println("Enter Base Cost: ");
        setBaseCost(Integer.parseInt(scanner.nextLine()));
    }

    public void displayDetails() {
        System.out.print("Id=" + getId() + ", name=" + getName() + ", baseCost=" + getBaseCost());
    }

    public abstract double calculateCost();
}
