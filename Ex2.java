
public class Ex2 {
    public static void main(String[] args){
        int x=1;
        int y=x + ++x - x-- - x++ + x - x--;
        System.out.println("y = "+ y);
        System.out.println("x = "+ x);
        int z=x-x---x+++--x-x+x--+x;
        System.out.println("z = "+ z);
        System.out.println("x = "+ x);
    }
}
