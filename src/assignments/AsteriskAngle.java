package assignments;

public class AsteriskAngle {
    public static void main(String[] args) {
        int rows = 7;
        for(int i = 1;i <= rows; i++){
            for(int j = i; j <= rows; j++){
                System.out.print("* ");
        }
            System.out.println();
        }
    }
}
