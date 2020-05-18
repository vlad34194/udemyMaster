import java.util.Scanner;

public class SomeProblemsBeginners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Se citeste un numar intreg. Sa se afiseze urmatorul numar.\n" + "2.Se citeste un un numar intreg. Sa se afiseze opusul lui.");
        System.out.println("3.Se citeste un un numar intreg. Sa se afiseze daca este pozitiv, negativ sau nul.\n" + "4.Se citesc doua numere. Sa se interschimbe valorile in cele 2 variabile.");
        System.out.println("5.Se citesc doua numere. Sa de afiseze suma si produsul lor.\n" + "6.Se citesc doua numere. Sa de afiseze valoarea minima si maxima.");
        System.out.println("7.Se citeste o distanta in mile. Sa se afiseze valoarea in kilometri(1 mila = 1.60934 km)\n" + "8.Se citesc doua numere. Sa de afiseze rezultatul impartirii lor. In cazul in care al doilea numar este nul, sa se afiseze un mesaj de eroare.");
        System.out.println("9.Sa se calculeze viteza medie de deplasare, dupa ce se introduce distanta parcursa(in kilometri) si durata calatoriei(in ore). Viteza medie este distanta impartita la timp. In cazul in care durata este 0, sa se afiseze un mesaj de eroare. Atentie! Viteza nu are voie sa fie negativa!\n" + "10.Se citesc parametrii unei ecuatii de gradul 1( ax + b = 0). Sa se afiseze solutia x");
        int n = sc.nextInt();
        int s;

        if (n <= 0 || n > 10) {
            System.out.println("You enter an invalid input retry with numbers from 1 to 10");
            sc.nextInt();
        }
        switch (n) {
            case 1:
                System.out.println("Introduceti o valoare");
                n = sc.nextInt();
                System.out.println(n + 1);
                break;
            case 2:
                System.out.println("Introduceti o valoare");
                n = sc.nextInt();
                System.out.println(-n);
                break;
            case 3:
                System.out.println("Introduceti o valoare");
                n = sc.nextInt();
                if (n > 0) {
                    System.out.println("S-a introdus o valoare pozitiva");
                } else if (n < 0) {
                    System.out.println("S-a introdus o valoare negativa");
                } else {
                    System.out.println("S-a introdus o valoare nula");
                }
                break;
            case 4:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                int aux;
                aux = n;
                n = s;
                s = aux;
                System.out.println(n + " " + s);
                break;
            case 5:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                System.out.println("Sum = " + (n + s));
                System.out.println("Prod = " + (n * s));
                break;
            case 6:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                if (n > s) {
                    System.out.println("Valoarea minima: " + s + " si Valoarea maxima: " + n);
                } else {
                    System.out.println("Valoarea minima: " + n + " si Valoarea maxima: " + s);
                }
                break;
            case 7:
                System.out.println("Insert distance in mile");
                n = sc.nextInt();
                double km = n * 1.60934;
                System.out.println(n + " mile = " + km + " km");
                break;
            case 8:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                if(s == 0){
                    System.out.println("Operatie imposibila");
                }else{
                    System.out.println("Rezultatul impartirii este " + n/s);
                }
                break;
            case 9:
                System.out.println("Insert distance ");
                n = sc.nextInt();
                System.out.println("Insert duration trip");
                s = sc.nextInt();
                if(s == 0){
                    System.out.println("Felicitari! Se pare ca ai inventat teleportarea");
                }else if(n < 0 || s < 0){
                    System.out.println("Distanta parcursa si durata trebuie sa fie pozitive");
                }else{
                    int v = n / s;
                    System.out.println("Viteza medie a fost " + v + " km/ora");
                }
                break;
            case 10:
                System.out.println("Insert value for a");
                n = sc.nextInt();
                System.out.println("Insert value for b");
                s = sc.nextInt();
                if(n == 0 && s == 0){
                    System.out.println("Multimea reala");
                }else if(n == 0){
                    System.out.println("Ecuatia nu are solutie");
                }else{
                    int x = -s/n;
                    System.out.println("Solutie: X = " + x);
                }
                break;
            case 11:


        }
    }

}
