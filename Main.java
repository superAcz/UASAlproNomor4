package solaUAS4;
// Kelas Utama (Main)
public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan tipe Kecepatan, yang merujuk ke subkelas Mobil dan Motor
        Kecepatan avanza = new Mobil(200, 2);
        Kecepatan beat = new Motor(120, 3);
        
        // Menampilkan kecepatan objek
        System.out.println("Kecepatan Mobil: " + avanza.getSpeed());
        System.out.println("Kecepatan Motor: " + beat.getSpeed());
    }
    
}
