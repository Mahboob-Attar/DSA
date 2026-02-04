public class Pattern_Questions {
    public static void main(String[] args) {

        // print solid 4*5 metrics with *
        int r = 4; //row number
        int c = 5; //column number
        //outer loop
        for (int i = 1; i <= r; i++) {
            //inner loop
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2nd problem:");
        //print 4*5 metrics with * and gap betwin the box inside
        //outer loop
        for (int i = 1; i <= 4; i++) {
            //inner loop
            for (int j = 1; j <= 5; j++) {
                //cell->(i,j)
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("problem 3:");
        //print the pattern rectangle on left side
        for (int i = 1; i <= 4; i++) { //i=4;i>=1 i-- make changes in reverse of traingle upper to lower
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("problem 4:");

        //print the pattern rectangle on right side
        int n = 4;  //row and colum 4*4
        for (int i=1; i<=n; i++) {
            for (int j=1; j<= n-i; j++) {
                System.out.print(" ");
            }
            //iner loop one more
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("problem 5:");

        //print pattern numbers with left side triangle
        int m =5;
        for(int i=1;i<=m;i++){    //i=5;i>=m;i-- for reverse upper to lower
      for(int j=1;j<=i;j++){
          System.out.print(j+" ");
      }
            System.out.println();
  }
        System.out.println("problem 6:");


        //print the pattern of numbers Floyd's Triangle

        int x= 5; //row numbers
        int num = 1;
        //outer loop
        for(int i=1;i<=x;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1; //or we write num++ both work
            }
            System.out.println();
        }

        System.out.println("prolem 6:");

        //print 0-1 Triangle

        int x1= 5; //rows number and column 5*5
        for(int i=1;i<=x1;i++){
            for(int j=1;j<=i ;j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
