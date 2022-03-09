package Modul2EnkapsulasiLatihan3;

public class testsiswa {
    public static void main(String[] args) {
        // TODO code application logic here
        encapsiswa siswa = new encapsiswa();
        siswa.setName("agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("nama\t: "+siswa.getName() + "\nalamat\t: "+siswa.getAddress()+ "\numur\t: "+siswa.getAge()+ " tahun");
    }
}
