public class Mpattern {
    
    public static void main(String[] args){

        int i,j,n=6;

        for(i=1;i<=n;i++){

            for(j=1;j<=(n-3);j++){
                    System.out.print("*");
            }

            if(i<=3){

            for(j=1;j<i;j++){
                System.out.print(" ");
            }

            for(j=1;j<=(n-3);j++){
                System.out.print("*");
            }

            int space=2*((n/2)-i);

            for(j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(j=1;j<=(n-3);j++){
                System.out.print("*");
            }
            }
            else{
                for(j=1;j<=(n+4);j++){
                System.out.print(" ");
            }

            }

            if(i<=3){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            }  

            for(j=1;j<=(n-3);j++){
                    System.out.print("*");
            }
 

            System.out.println();

            }
            
}
    

}
