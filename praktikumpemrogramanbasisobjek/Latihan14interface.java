/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;

interface teknik{
    void dekan();
    void dosen();
    void mhs();
}

interface hukum{
    void dekan1();
    void dosen1();
    void mhs1();
}

interface sastra{
    void dekan2();
    void dosen2();
    void mhs2();
}

class data implements teknik, hukum, sastra{

    @Override
    public void dekan() {
        System.out.println("~~FAKULTAS TEKNIK~~");
        System.out.println("dekan = Elpis Julius Dairo");
    }
    
    @Override
    public void dosen() {
        System.out.println("dosen = Gabriel Mediose");
    }
    
    @Override
    public void mhs() {
        System.out.println("mahasiswa = Kristoforus Alvin Pangestu");
    }

    @Override
    public void dekan1() {
        System.out.println("~~FAKULTAS HUKUM~~");
        System.out.println("dekan = Yordan");
    }
    
    @Override  
    public void dosen1() {
        System.out.println("dosen = FX Leonhard");
    }
    
    @Override
    public void mhs1() {
        System.out.println("mahasiswa = Franky Kawi");
    }
    
    @Override
    public void dekan2() {
        System.out.println("~~FAKULTAS SASTRA~~");
        System.out.println("dekan = Ricky Alvin Tantri");
    }
    
    @Override
    public void dosen2() {
        System.out.println("dosen = Alvin Prayitno");
    }
    
    @Override
    public void mhs2() {
        System.out.println("mahasiswa = Bobbi Setiawan");
    }
}

public class Latihan14interface {
     public static void main(String[] args) {
        data i = new data ();
		
		i.dekan();
		i.dosen();
		i.mhs();
        System.out.println("");
		
		i.dekan1();
		i.dosen1();
		i.mhs1();
        System.out.println("");
		
		i.dekan2();
		i.dosen2();
		i.mhs2();
		System.out.println("");
    }
}