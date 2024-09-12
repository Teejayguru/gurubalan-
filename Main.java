
public class Main {
    public static void main(String[] args) {

//      for (int i = 1, r = 4; i <= r; i++)
//        {
//            for (int j = 1, c = 6; j <= c; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for ( int i = 1; i <5; i++){
//            for (int j = 1; j <5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int i,j,k;
        for ( i =5; i>1; i--){
            for ( j =i; j>1;j--){
                System.out.print(" ");
            }
            for( k=6; i<k;k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}