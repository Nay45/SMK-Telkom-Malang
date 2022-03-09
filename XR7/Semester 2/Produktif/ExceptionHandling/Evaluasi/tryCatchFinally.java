package ExceptionHandling.Evaluasi;

public class tryCatchFinally {
    public static void main(String[] args) {
        try {
            int num[] = {4, 7, 3, 1}; //deret
            System.out.println(num[4]);
        }catch (Exception e){
            System.out.println(e); //error
            System.out.println("Melebihi index");
        }finally {
            System.out.println("Angka valid"); //kalimat final
        }
    }
}
