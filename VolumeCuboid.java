import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class VolumeCuboid {
    public double panjang;
    public double lebar;
    public double tinggi;
    public VolumeCuboid(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    public static void main(String[] args) {
        try {
            File inputFile = new File("dataCuboid.txt");
            Scanner scanner = new Scanner(inputFile);

            double panjang = scanner.nextDouble();
            double lebar = scanner.nextDouble();
            double tinggi = scanner.nextDouble();

            VolumeCuboid VolumeCuboid  = new VolumeCuboid(panjang, lebar, tinggi);

            double volume = VolumeCuboid.hitungVolume();

            File outputFile = new File("dataCuboid.txt");
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println("Volume: " + volume);
            writer.close();
            scanner.close();

            System.out.println("Hasil telah ditulis ke output.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
