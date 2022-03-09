package AbstractClassInterfacePolymorphism.Latihan1No5;

public class Output extends ExceptionHandling.Latihan1.VehicleNo5 {
//  Overrite
    public void walk(){
        System.out.println("Flying");
    }
//  Overrite
    public void fuel(){
        System.out.println("Fuels");
    }

    public static void main(String[] args) {
        Output masuk = new Output();
        masuk.function();
        masuk.fuel();
        masuk.walk();
    }
}
