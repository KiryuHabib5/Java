/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submission.gits.id;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class SubmissionGITSID {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int choices = 0;        
        int again;
        System.out.println("TEST SOAL :: STUDI INDEPENDEN GITS.ID");
        System.out.println("Ahmad Habib Husaini");
        System.out.println("========================================================================================");
        Scanner inputUser = new Scanner(System.in);
        System.out.println("1. Q: Buatlah aplikasi untuk menampilkan “Hello” dan “World” dengan ketentuan berikut\n" +
            "ini. (point 3)\n" +
            "a. Jika input bilangan habis di bagi 3 menampilkan kata “Hello”\n" +
            "b. Jika input bilangan habis di bagi 5 menampilkan kata “World”\n" +
            "c. Jika input bilangan habis di bagi 5 dan 3 menampilkan kata “Hello World”\n\n" +
            "2. Q: Buatlah aplikasi sederhana untuk melakukan check format email. (point 3)\n" +
            "a. Format email wajib menggunakan ‘@’\n" +
            "b. Format email wajib menggunakan tanda titik ‘.’ setelah ‘@’\n" +
            "c. Panjang email maksimum 20 karakter sebelum ‘@’\n" +
            "d. domain yang diperbolehkan hanya “.co.id” dan “.id”\n" +
            "\n" +
            "3. Q: Buatlah aplikasi sederhana untuk mengkonversi waktu tanpa menggunakan fungsi / class\n" +
            "DateTime (point 4)\n" +
            "contoh :\n" +
            "a. 12:00:00 PM => 12:00\n" +
            "b. 12:00:00 AM => 00:00\n\n" +
            "4. Q: Buatlah aplikasi sederhana untuk membalik / reverse kalimat (point 2)\n" +
            "contoh : “Aplikasi” => “isakilpA”\n\n" +
            "5. Q: Buatlah aplikasi sederhana untuk cek kalimat palindrom (point 2)\n" +
            "contoh :\n" +
            "a. Katak di balik kataK => Result True (karena palindrom )\n" +
            "b. Ubi di balik iBu => Result False (karena bukan palindrome )");        
        
        do {         
            System.out.println("========================================================================================\n");
            System.out.print("Tampilkan jawaban nomer : ");
            choices = inputUser.nextInt();
            switch(choices){
                case 1:
                    System.out.println("Jawaban Nomer 1");
                    System.out.println("=========================");
                    nomerSatu();
                    System.out.println("=========================");
                    break;
                case 2: 
                    System.out.println("Jawaban Nomer 2");
                    System.out.println("=========================");
                    nomerDua();
                    System.out.println("=========================");
                    break;
                case 3: 
                    System.out.println("Jawaban Nomer 3");
                    System.out.println("=========================");
                    nomerTiga();
                    System.out.println("=========================");
                    break;
                case 4: 
                    System.out.println("Jawaban Nomer 4");
                    System.out.println("=========================");
                    nomerEmpat();
                    System.out.println("=========================");
                    break;
                case 5: 
                    System.out.println("Jawaban Nomer 5"); 
                    System.out.println("=========================");
                    nomerLima();
                    System.out.println("=========================");
                    break;
                default:
                    System.out.println("Tidak ada soal tersebut");
            }
            System.out.print("Tekan angka selain 0 untuk lanjut : ");
            again = inputUser.nextInt();
        } while (again !=0);
        System.out.println("========================================================================================\n");
        System.out.println("Keluar...");
    }
    
    private static void nomerSatu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input : ");
        int angka = input.nextInt();
        if (angka % 3 == 0 && angka %5 == 0) {
            System.out.println("Hello World");
        }else if(angka % 5 == 0){
            System.out.println("World");
        }else if(angka % 3 == 0){
            System.out.println("Hello");
        }else {
            System.out.println("no action");
        }
    }
    
    private static void nomerDua(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input email : ");
        String email = input.next();
        String after = email.substring(email.indexOf("@")+1);
        boolean firstCondition = email.contains("@");
        boolean secondCondition = after.contains(".");
        boolean thirdCondition = email.substring(0, email.indexOf("@")).length() <= 20;
        boolean lastCondition = after.substring(after.indexOf(".")).equalsIgnoreCase(".co.id") || after.substring(after.indexOf(".")).equalsIgnoreCase(".id");
        
        if (firstCondition && secondCondition && thirdCondition && lastCondition){
            System.out.println("Format disetujui");
        }else{
            if(firstCondition == false){
                System.out.println("Tidak memenuhi syarat pertama");
            }else if (secondCondition == false){
                System.out.println("Tidak memenuhi syarat kedua");
            }else if (thirdCondition == false) {
                System.out.println("Tidak memenuhi syarat ketiga");
            }else if (lastCondition == false){
                System.out.println("Tidak memenuhi syarat keempat");
            }else{
                System.out.println("unknown error");
            }
        }
        System.out.println("");
    }
    
    private static void nomerTiga(){
        Scanner input = new Scanner(System.in);
        String time;
        String format;
        Integer hour;
        Integer minute;
        while(true){    
            System.out.print("Masukan input jam (ex => 07:00) =  ");
            time = input.next();
            if (!(time.charAt(2)==':')){
                System.out.println("ikuti sesuai format");
                continue;
            }
            String[] timeSplit = time.split(":");
            hour = Integer.parseInt(timeSplit[0]) ;
            minute = Integer.parseInt(timeSplit[1]);
            if(hour > 12){
                System.out.println("jam harus 00-12");
            }else if (minute > 59){
                System.out.println("menit harus 00-59");
            }else{
                System.out.println(time);
                break;
            }
        }    
        

        
        while(true){
            if (hour == 00){
                format = "AM";
            }else{
                System.out.print("AM or PM = ");
                format = input.next();
            }
            if (format.equalsIgnoreCase("am") || format.equalsIgnoreCase("pm")){
                System.out.println("Anda menulis inputan " + time + " " + format);
                break;
            }else{
                System.out.println("Format salah");
            }            
        }

        if (format.equalsIgnoreCase("am")){
            System.out.println("Waktu : " + time);
        }else if(format.equalsIgnoreCase("pm")){
            hour = hour + 12;
            if (hour == 24){
                hour = 00;
            }
            time = hour.toString() + ":" + minute.toString();
            if (minute == 0){
                time+="0";
            }else if(hour == 0){
                String temp = "0"+time;
                time = temp;
            }
            System.out.println("Waktu = " + time);
        }
    }
    
    private static void nomerEmpat(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input \t: ");
        String sentence = input.nextLine();
        String reverseSentence = reverse(sentence);
        System.out.println("Reverse \t: " + reverseSentence);
    }
    
    private static void nomerLima(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input \t: ");
        String sentence = input.nextLine();
        String reverseSentence = reverse(sentence);
        if (sentence.equalsIgnoreCase(reverseSentence)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
    private static String reverse(String input){
        String reverseSentence = "";
        for (int i = (input.length()-1); i >= 0; i--){
            reverseSentence += input.charAt(i);
        }
        return reverseSentence;
    }
}
