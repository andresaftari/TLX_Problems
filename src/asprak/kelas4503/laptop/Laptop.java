package asprak.kelas4503.laptop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andresaftari
 */
public class Laptop {
    private String merk, kode;
    private CPU cpu;

    public Laptop(String merk, String kode) {
        this.merk = merk;
        this.kode = kode;
    }
    
    public void addKomponen(CPU cpu1) {
        this.cpu = cpu1;
    }

    public CPU getCpu() {
        return cpu;
    }
}

class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("ASUS", "12345");
        
        laptop.addKomponen(new CPU("Intel AMD"));
    }
}