package lec10.absstractclass.nonabstractmethod.room;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int choice;
        do {

            System.out.println("\nMenu");
            System.out.println("0. Exit");
            System.out.println("1.add");
            System.out.println("2.update");
            System.out.println("3. xoa");
            System.out.println("4. tim");
            System.out.println("5. hien thi");
            System.out.println("6. Tim gia lon nhat");
            System.out.println("7. dem");
            System.out.print("chon nhanh con me may len");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    System.out.println("Bien");
                    break;
                case 1:
                    System.out.print("chon: 1.meet/2.bed: ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    if (choice2 == 1) {
                        MeetingRoom meetingRoom = new MeetingRoom();
                        roomList.addRoom(meetingRoom);
                    } else if (choice2 == 2) {
                        BedRoom bedRoom = new BedRoom();
                        roomList.addRoom(bedRoom);
                    } else {
                        System.out.println("Doc lai de di ngu");
                    }
                    break;
                case 2:
                    System.out.print("Update: ");
                    roomList.updateRoomById(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Xoa: ");
                    roomList.deleteRoomById(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("tim: ");
                    roomList.findRoomById(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Hien thi");
                    roomList.displayAllRoom();
                    break;
                case 6:
                    System.out.println("Lon nhat: ");
                    roomList.findMostExpensiveRoom();
                    break;
                case 7:
                    System.out.println("Dem");
                    roomList.countRoom();
                    break;
                default:
                    System.out.println("sai rui");
                    break;
            }
            System.out.println("Tiep k?1co 2k");
            int choice3 = Integer.parseInt(scanner.nextLine());
        } while (choice != 0);
    }
}
