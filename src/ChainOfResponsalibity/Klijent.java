/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsalibity;

/**
 *
 * @author Radomir
 */
class Klijent {
    Servis s;
    public static void main(String[] args) {
        Servis s1 = new SredjivanjeHeadstocka(null);
        Servis s2 = new SredjivanjePragova(s1);
        Servis s3 = new SredjivanjeTremola(s2);
        System.out.println("Neka krene servis: ");
        Servis.kreniUProceduru(s3);
    }
}
