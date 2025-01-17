public class question1 {
    public static void main(String[] args) {
        // Code for single loop to print the Nigerian flag pattern  
        for(int i=0; i<4; i++ ){
         System.out.println("* * * * = = = = * * * *");
        }

           // Code for nested loop to print the Nigerian flag pattern
        for(int i =0; i<4; i++){
            for(int j= 0; j<12; j++){
               if( j<4){
                   System.out.print("* ");// Print '*' for the first 4 columns
               }else if(j<8){
                   System.out.print("= ");// Print '=' for the next 4 columns
                   
               }else {
                   System.out.print("* ");// Print '*' for the last 4 columns
               }

              
            }
            System.out.println();// Move to the next line after each row
       }
    }
    
}
