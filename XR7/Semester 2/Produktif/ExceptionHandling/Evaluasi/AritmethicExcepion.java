package ExceptionHandling.Evaluasi;

public class AritmethicExcepion {
    public static void main(String[] args) {
        try {
            int a=10, b=0; //input awal
            int hitung=a/b; //perhitungan
            System.out.println ("Hasil: "+ hitung);
            //output jika perhitungan benar atau tidak error
        }
        catch(ArithmeticException e){
            System.out.println ("Error : " + e); //Output jika error
        }
    }
}
