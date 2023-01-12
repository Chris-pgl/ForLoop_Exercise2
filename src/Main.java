public class Main {
    public static void main(String[] args) {

        // nella sequenza di Fibonacci, il terno numero è composto dai primi due, 1,1,2,3,5,8,13
        
        int a = 0,b = 1, c;
        for( int i = 2; i < 12; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }



    }
}