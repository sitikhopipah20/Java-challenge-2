import java.util.Scanner;

public class JavaBasic2 {
    

    public static void main(String[] args){
        int nilai;

        
        Scanner skor = new Scanner(System.in);
        
        System.out.print("masukan skor:");

        nilai= skor.nextInt();

           if(nilai>=101){
            System.out.println("nilai salah");
        }  else if(nilai >=91) {
            System.out.println("nilai:A");
        }  else if(nilai >=76) {
            System.out.println("nilai:B");    
        }  else if(nilai >=51) {
            System.out.println("nilai:C");
        }  else if(nilai >=26) {
            System.out.println("nilai:D"); 
        }  else if(nilai >=0) {
            System.out.println("nilai:E"); 
        }
        System.out.println("SELESAI"); 
        skor.close();             

    
    }
}