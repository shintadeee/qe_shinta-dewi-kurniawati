package drawXYZ;
public class DrawXYZ{
    public static void drawXYZ(int n){
        int count = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (count % 3 == 0){
                    System.out.print("X ");
                } else if (count % 2 == 0){
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
                count++;
            }
            System.out.println();
        }
    }
}


