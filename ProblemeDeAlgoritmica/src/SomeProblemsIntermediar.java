import java.util.Scanner;

public class SomeProblemsIntermediar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Se citesc parametrii unei ecuatii de gradul 2( ax2 + bx + c = 0). Sa se afiseze solutia x.\n" + "2.Se citeste un numar intreg pozitiv. Sa se afiseze toate numerele pozitive nenule mai mici sau egale decat valoarea citita, in ordine crescatoare");
        System.out.println("3.Se citeste un numar intreg pozitiv. Sa se afiseze toate numerele pozitive(inclusiv 0), strict mai mici valoarea citita, in ordine descrescatoare\n" + "4.Se citesc 2 valori in ordine crescatoare. Sa se afiseze toate numerele dintre cele 2 valori citite. Daca nu exista valori, de afisat, se afiseaza un mesaj de notificare.");
        System.out.println("5.Se citesc 2 valori in ordine crescatoare. Sa se afiseze toate numerele care sunt mai mari sau egale cu primul numar si mai mici sau egale cu al doilea numar.\n" + "6.Se citesc 2 valori in ordine crescatoare. Sa se afiseze toate numerele pare  care sunt mai mari sau egale cu primul numar si mai mici sau egale cu al doilea numar.");
        System.out.println("7.Se citesc 2 valori(nu neaparat in ordine crescatoare). Sa se afiseze toate numerele care sunt mai mari sau egale cu cel mai mic numar si mai mici sau egale cu cel mai mare numar. \n" + "8.Se citesc valori intregi de la tastatura pana la apasarea tastei “0”. Sa se afiseze suma numerelor tastate");
        System.out.println("9.Se citeste un numar. Sa se afiseze toti divizorii numarului citit \n " + "10.Se citeste un numar. Sa se afiseze daca numarul este prim sau nu.");
        int n = sc.nextInt();
        int s, t;

        if (n <= 0 || n > 10) {
            System.out.println("You enter an invalid input retry with numbers from 1 to 10");
            n = sc.nextInt();
        }
        switch (n) {
            case 1:
                System.out.println("Insert value for a");
                int a = sc.nextInt();
                System.out.println("Insert value for b");
                int b = sc.nextInt();
                System.out.println("Insert value for c");
                int c = sc.nextInt();
                int d = 0;
                d = b * b - 4 * a * c;
                if (d < 0) {
                    System.out.println("Ecuatia nu are solutii reale");
                } else if (d == 0) {
                    int x = -c / a;
                    System.out.println("Solutie: X = " + x);
                } else if (a == 0 && b == 0 && c == 0) {
                    System.out.println("Multimea Reala");
                } else {
                    int x1 = (int) (Math.sqrt((d) - b) / (2 * a));
                    int x2 = (int) (-b - Math.sqrt((d)) / (2 * a));
                    System.out.println("X1 = " + x1 + ", X2 = " + x2);
                }
                break;
            case 2:
                System.out.println("Insert  value");
                n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                break;
            case 3:
                System.out.println("Insert  value");
                n = sc.nextInt();
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(i + " ");
                }
                break;
            case 4:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                if ((n + 1) == s || n == s) {
                    System.out.println("Nu exista valori de afisat");
                } else {
                    for (int i = n + 1; i < s; i++) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 5:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                for (int i = n; i <= s; i++) {
                    System.out.print(i + " ");
                }
                break;
            case 6:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                for (int i = n; i <= s; i++) {
                    if (n == s) {
                        System.out.println("Nu exista valori de afisat");
                    } else if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 7:
                System.out.println("Insert first value");
                n = sc.nextInt();
                System.out.println("Insert second value");
                s = sc.nextInt();
                if(n > s){
                    int aux = n;
                    n = s;
                    s = aux;
                }
                for (int i = n; i <= s; i++) {
                    System.out.print(i + " ");
                }
                break;
            case 8:
                int sum = 0;
                while(n != 0){
                    System.out.println("Introduceti un numar pana apasati tasta 0");
                    n = sc.nextInt();
                    sum += n;
                }
                System.out.println("Sum = " + sum);
                break;
            case 9:
                System.out.println("Insert value");
                n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    if(n % i == 0){
                        System.out.print(i + " ");
                    }
                }
                break;
            case 10:
                System.out.println("Insert value");
                n = sc.nextInt();
                 c = 0;
                if(n == 1 || n == 2){
                    System.out.println("Numarul este prim");
                }else{
                    for (int i = 1; i <= n; i++) {
                        if(n % i == 0){
                            c++;
                        }
                    }
                    if(c == 2){
                        System.out.println("Numarul este prim");
                    }else{
                        System.out.println("Numarul NU este prim");
                    }

                }


        }
    }
}
