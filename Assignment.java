
public class Assignment {

    // Question no. 5
    public  static void Name ( int n){
        // printing A....................
        for ( int i = 0; i < n; i++){
            for ( int j = 0; j< n; j++){
                if ( i ==0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 || j == (n-1)/2 && i > 0 || i == (n-1)/2 && j <= (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            // printing B............
            for ( int j = 0; j < n ; j++){
                if ( j == 0 || i == 0 && j < (n-1)/2 || j == ( n-1)/2 && i > 0 && i < ( n-1)/2 || j == (n-1)/2 && i > ( n-1)/2 && i < ( n-1) || i == (n-1)/2  && j < (n-1)/2 || i == (n-1) && j < (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.print("");
            // printing H...............
            for ( int j = 0 ; j < n ; j++){
                if ( j == 0 ||i == (n-1)/2 && j <= (n-1)/2 || j == ( n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.print("");
            //printing I ..............
            for ( int j = 0 ; j< n; j++){
                if ( i == 0 && j < ( n-1)/2|| i == ( n-1) && j < (n-1)/2 || j == ( n-1)/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");

            // printing S ........
            for ( int j = 0 ; j < n ; j++){
                if ( j == (n-1)/2 && i > 0 && i <=(n-1)/4 || i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 && i < (n-1)/2 || i == (n-1)/2 && j> 0 && j < (n-1)/2 || j == (n-1)/2 && i > (n-1)/2 && i < (n-1) || i == (n-1) && j > 0 && j < (n-1)/2 || j == 0 && i > 3* (n-1)/4 && i < (n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            // printing H.......
            for ( int j = 0 ; j < n ; j++){
                if ( j == 0 ||i == (n-1)/2 && j <= (n-1)/2 || j == ( n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.print("");
            //printing E...........
            for ( int j = 0 ; j< n ; j++){
                if(j == 0 || i == 0 && j< ( n-1)/2 || i == (n-1)/2 && j < ( n-1)/2 || i == (n-1) && j < (n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.print("");
            // printing K........
            for ( int j = 0 ; j< n; j++){
                if ( j == 0 || i+j == (n-1)/2 || i -j == (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
      
        
    }
    // rough triangle for Question no. 2
    public static void Triangle(int n){
        for( int i =0 ; i <n ; i++){
            for(int j = 0; j < n; j++){
                if ( i+j > ( n-1)/2 && j <= ( n-1)/2 && i <= ( n-1)/2 || j-i< (n-1)/2 && j >= ( n-1)/2 && i <= ( n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Question no 2........
    public static void triangle(int n){
        for ( int i = 1 ; i <= n; i++){
            for ( int j = 1 ; j <= n-i  ; j++){
                System.out.print(" ");
            }
            for ( int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            for( int j = 2; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question no. 3..........
    public static void Q3(int n){
        for (int i = 0; i < n; i++){
            for ( int j =0; j < n; j++){
                if ( i == 0 || i == (n-1)|| j == 0 || j == (n-1) || i + j <= (n-1)/2 || j - i >= ( n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void PwSkills(int n){
        for ( int i = 0; i< n; i++){
            // printing P....
            for ( int j = 0 ; j< n; j++){
                if ( j == 0|| i == 0 && j < (n-1) || i == ( n-1)/2 && j < ( n-1) || j == (n-1)&& i > 0 && i < (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.print("   ");
            for ( int j = 0 ; j< n ; j++){
                if (j == 0 || j == (n-1) ||i + j == (n-1) && i > (n-1)/2  || i == j && i > (n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("     ");
            for ( int j = 0 ; j < n ; j++){
                if ( j == (n-1)/2 && i > 0 && i <=(n-1)/4 || i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 && i < (n-1)/2 || i == (n-1)/2 && j> 0 && j < (n-1)/2 || j == (n-1)/2 && i > (n-1)/2 && i < (n-1) || i == (n-1) && j > 0 && j < (n-1)/2 || j == 0 && i > 3* (n-1)/4 && i < (n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            for ( int j = 0 ; j< n; j++){
                if ( j == 0 || i+j == (n-1)/2 || i -j == (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            for ( int j = 0 ; j< n; j++){
                if ( i == 0 && j < ( n-1)/2|| i == ( n-1) && j < (n-1)/2 || j == ( n-1)/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            for ( int j = 0 ; j< n ; j++){
                if ( j == 0|| i == ( n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for ( int j = 0 ; j< n ; j++){
                if ( j == 0|| i == ( n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for ( int j = 0 ; j < n ; j++){
                if ( j == (n-1)/2 && i > 0 && i <=(n-1)/4 || i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 && i < (n-1)/2 || i == (n-1)/2 && j> 0 && j < (n-1)/2 || j == (n-1)/2 && i > (n-1)/2 && i < (n-1) || i == (n-1) && j > 0 && j < (n-1)/2 || j == 0 && i > 3* (n-1)/4 && i < (n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main ( String args[]){
// Name(11);
System.out.println();
// Triangle(11);
// triangle(11);
// Q3(11);
PwSkills(11);

    }
}
