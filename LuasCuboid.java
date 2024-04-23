import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class LuasCuboid {
    public double panjang;
    public double lebar;
    public double tinggi;
    public LuasCuboid(double panjang, double lebar, double tinggi){
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
    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public static void main(String[] args) {
        try {
            File inputFile = new File("dataCuboid.txt");
            Scanner scanner = new Scanner(inputFile);

            double panjang = scanner.nextDouble();
            double lebar = scanner.nextDouble();
            double tinggi = scanner.nextDouble();

            LuasCuboid LuasCuboid = new LuasCuboid(panjang, lebar, tinggi);

            double luasPermukaan = LuasCuboid.hitungLuasPermukaan();

            File outputFile = new File("dataCuboid.txt");
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println("Luas Permukaan: " + luasPermukaan);

            writer.close();
            scanner.close();

            System.out.println("Hasil telah ditulis ke output.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}





