
package belajar.oop.bangun.ruang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        BangunRuang bangunRuang = new BangunRuang();
        
        Kubus kubus = new Kubus();
        System.out.print("Masukkan Panjang Rusuk Kubus (S): ");
        kubus.s = scanner.nextFloat();
        
        Balok balok = new Balok();
        System.out.print("Masukkan Panjang Balok: ");
        balok.p = scanner.nextFloat();
        System.out.print("Masukkan Lebar Balok: ");
        balok.l = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Balok: ");
        balok.t = scanner.nextFloat();
        
        LimasSegitiga limassegitiga = new LimasSegitiga();
        System.out.print("Masukkan Alas Segiempat (a): ");
        limassegitiga.a = scanner.nextFloat();
        System.out.print("Masukkan  Tinggi Alas Segitiga Limas Segitiga (TS): ");
        limassegitiga.tS = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Sisi Tegak Limas Segitiga (T): ");
        limassegitiga.T = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Limas Segiempat (t): ");
        limassegitiga.tL = scanner.nextFloat();
        
        PrismaSegitiga prismasegitiga = new PrismaSegitiga();
        System.out.print("Masukkan Panjang Selubung Prisma Segitiga (p): ");
        prismasegitiga.p = scanner.nextFloat();
        System.out.print("Masukkan Lebar Selubung Prisma Segitiga (l): ");
        prismasegitiga.l = scanner.nextFloat();
        System.out.print("Masukkan Alas Segitiga Prisma Segitiga (a): ");
        prismasegitiga.a = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Segitiga Prisma Segitiga (t): ");
        prismasegitiga.t = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Prisma Segitiga (T): ");
        prismasegitiga.T = scanner.nextFloat();
        
        Tabung tabung = new Tabung();
        System.out.print("Masukkan Jari-jari Tabung (r): ");
        tabung.r = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Tabung (t): ");
        tabung.t = scanner.nextFloat();
        
        Bola bola = new Bola();
        System.out.println("Masukkan Jari-jari Bola (r): ");
        bola.r = scanner.nextFloat();
        
        System.out.println("=================================");
        bangunRuang.luas();
        kubus.luas();
        balok.luas();
        limassegitiga.luas();
        prismasegitiga.luas();
        tabung.luas();
        bola.luas();
        
        System.out.println("=================================");
        
        bangunRuang.volume();
        kubus.volume();
        balok.volume();
        limassegitiga.volume();
        prismasegitiga.volume();
        tabung.volume();
        bola.luas();
        System.out.println("=================================");
        
    }
    
}
