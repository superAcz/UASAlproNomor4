package solaUAS4;
// Kelas Motor (subkelas Kecepatan)
public class Motor extends Kecepatan{
    // Variabel instans untuk jarak dan waktu
    private float jarak;
    private float waktu;
    
    // Konstruktor untuk menginisialisasi variabel jarak dan waktu
    public Motor(int jarak, int waktu){
        this.jarak = jarak;
        this.waktu = waktu;
    }
    
    // Melakukan override pada metode getSpeed() untuk menghitung dan mengembalikan kecepatan
    @Override
    float getSpeed(){
        return jarak / waktu;
    }
}
