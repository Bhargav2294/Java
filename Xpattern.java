public class Xpattern {

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
        

        for(i=1;i<=(n);i++){
            
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }

            for(j=1;j<=n;j++){
                System.out.print("*");
            }

            int space=2*(i-1);

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
