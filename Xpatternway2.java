public class Xpatternway2 {

    public static void main(String[] args){

        int i,j,n=5;

        for(i=1;i<=n;i++){

            for(j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(j=1;j<=n;j++){
                System.out.print("*");
            }

            int space=2*(n-i);

            for(j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(j=1;j<=(n);j++){
                System.out.print("*");
            }

            System.out.println();
   
        }
        

        for(i=(n-1);i>=1;i--){
            
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(j=1;j<=n;j++){
                System.out.print("*");
            }

            int space=2*(n-i);

            for(j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
   
        }
    
    }
    
}
