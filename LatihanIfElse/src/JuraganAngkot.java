public class JuraganAngkot {

    public static void main(String[] args) {

        //awalmulai
        int awalMulai = 1;

        //batasan looping
        while (awalMulai <= 10) {

            if (awalMulai == 8 || awalMulai == 9 || awalMulai==10){
                System.out.println( "Angkot " + awalMulai + " Sedang rusak");
            }else {
                System.out.println( "Angkot " + awalMulai + " Sedang beroperasi");
            }

            awalMulai++;

        }

    }
}
