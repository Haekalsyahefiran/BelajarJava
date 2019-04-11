public class DoWhile {

    public static void main(String[] args) {

        int bensin = 9;

// perulangan while-do
        while(bensin > 0){
            System.out.println("Masih ada bensin, nyalakan mesin!");
            bensin--;
        }

// perulangan do-while
        do{
            System.out.println("Nyalakan mesin!");
            bensin--;
        } while(bensin > 0);

    }
}
