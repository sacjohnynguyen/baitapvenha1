package lec10.absstractclass.nonabstractmethod.room;

import java.util.ArrayList;

public class RoomList {

    ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        room.addRoom();
        roomList.add(room);
        System.out.println("Added sucessfully");
    }

    public boolean updateRoomById(String ID) {
        int index = -1;
        for (int i = 0; i < roomList.size(); i++) {
            if (ID.equals(roomList.get(i).getId())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            roomList.get(index).updateRoom();
            System.out.println("cap nhat thanh cong");
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteRoomById(String ID) {
        int index = -1;
        for (int i = 0; i < roomList.size(); i++) {
            if (ID.equals(roomList.get(i).getId())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            roomList.remove(index);
            System.out.println("Xoa thanh cong");
            return true;
        } else {
            return false;
        }
    }

    public boolean findRoomById(String ID) {
        int index = -1;
        for (int i = 0; i < roomList.size(); i++) {
            if (ID == roomList.get(i).getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            roomList.get(index).displayDetails();
            System.out.println("Tim thay");
            return true;
        } else {
            return false;
        }
    }

    public void displayAllRoom() {
        for (int i = 0; i < roomList.size(); i++) {
            roomList.get(i).displayDetails();

        }
        System.out.println("-> Display success");
    }

    public void findMostExpensiveRoom() {
        double max = 0;
        for (int i = 0; i < roomList.size(); i++) {
            if (max < roomList.get(i).calculateCost()) {
                max = roomList.get(i).calculateCost();
            }
        }
        for (int i = 0; i < roomList.size(); i++) {
            if (max == roomList.get(i).calculateCost()) {
                roomList.get(i).displayDetails();
            }
        }
    }

    public void countRoom() {
        int countM = 0;
        int countB = 0;
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i) instanceof MeetingRoom) {
                countM++;
            } else if (roomList.get(i) instanceof BedRoom) {
                countB++;
            }
        }
        System.out.println("Meeting: " + countM);
        System.out.println("BedRoom: " + countB);
        System.out.println("All Room: " + roomList.size());
        System.out.println("Dem xong roi");
    }
}
