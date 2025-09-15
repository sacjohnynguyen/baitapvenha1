
package lec10.absstractclass.btvn1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class Human {
    private String name;
    private Date date;
    private String sex;
    private int id;

    public Human(String name, Date date, String sex, int id) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.id = id;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Thong Tin:");
        System.out.print("Nhap ho va ten "+name);
        setName(scanner.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Nhap ngay sinh: ");
        String dateString = scanner.nextLine();
        try {
            setDate(sdf.parse(dateString));
        } catch (ParseException ex) {
            Logger.getLogger(Human.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Nhap gioi tinh: ");
        setSex(scanner.nextLine());
        System.out.print("Nhap so CMND: ");
        setId(Integer.parseInt(scanner.nextLine()));
    }
    void capNhatNguoiBangCMND(int cmnd){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Thong Tin:");
        System.out.print("Nhap ho va ten "+name);
        setName(scanner.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Nhap ngay sinh: ");
        String dateString = scanner.nextLine();
        try {
            setDate(sdf.parse(dateString));
        } catch (ParseException ex) {
            Logger.getLogger(Human.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Nhap gioi tinh: ");
        setSex(scanner.nextLine());
        setId(cmnd);
    }
    void xuatThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nguoi: {"+"Ho va ten : "+getName()+" Ngay sinh: "+sdf.format(getDate())+" Gioi tinh "+getSex()+ " CMND "+getId()+"}");
    }
    public abstract void traTienDoxe();
}
