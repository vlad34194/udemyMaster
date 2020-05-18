import java.util.Scanner;

public class SomeProblemsAvans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Se citeste un sir de numere intregi. Sa se afiseze minimul.\n" + "2.Se citeste un sir de numere intregi. Sa se afiseze maximul.");
        System.out.println("3.Se citeste un sir de numere intregi. Sa se afiseze minimele locale.\n" + "4.Se citeste un sir de valori numerice. Sa se afiseze suma elementelor sirului.");
        System.out.println("5.Se citeste un sir de valori numerice. Sa se afiseze elementele care sunt mai mici decat media aritmetica a valorilor sirului.\n" + "6.Se citeste sir de caractere(string). Sa se afiseze de cate ori apare caracterul “a”");
        System.out.println("7.Se citeste sir de caractere(string). Sa se afiseze pozitiile pe care apare caracterul a\n" + "8.Se citeste o propozitie. Sa se afiseze numarul de cuvinte pe care le contine");
        System.out.println("9.Se citeste un sir de caractere. Sa se afiseze procentajul de vocale. Se ignora spatiile albe in calculul caracterelor.\n" + "10. Se citeste un sir de stringuri. Sa se afiseze de cate ori apare caracterul “a”.");
        int n = sc.nextInt();
        if (n <= 0 || n > 10) {
            System.out.println("You enter an invalid input retry with numbers from 1 to 10");
            n = sc.nextInt();
        }
        switch (n) {
            case 1:
                System.out.print("Numarul de el este : ");
                n = sc.nextInt();
                int[] arr = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    System.out.print("Insert a el arr : ");
                    arr[i] = sc.nextInt();
                }
                int min = arr[0];
                for (int i = 0; i < n; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
                System.out.println("Minimul din sir este : " + min);
                break;
            case 2:
                System.out.println("Numarul de el este: ");
                n = sc.nextInt();
                arr = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    System.out.print("Insert a el arr:");
                    arr[i] = sc.nextInt();
                }
                int max = arr[0];
                for (int i = 0; i < n; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                System.out.println("Maximul din sir este: " + max);
                break;
            case 3:
                System.out.println("Numarul de el este: ");
                n = sc.nextInt();
                arr = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    System.out.print("Insert a el arr:");
                    arr[i] = sc.nextInt();
                }
                if (arr[0] < arr[1]) {
                    System.out.println(arr[0]);
                }
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
                        System.out.println(arr[i]);
                    }
                }
                if (arr[n - 1] > arr[n]) {
                    System.out.println(arr[n - 1]);
                }
                break;
            case 4:
                System.out.println("Numarul de el este: ");
                n = sc.nextInt();
                arr = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    System.out.print("Insert a el arr:");
                    arr[i] = sc.nextInt();
                }
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum is -> " + sum);
                break;

            case 5:
                System.out.println("Numarul de el este: ");
                n = sc.nextInt();
                arr = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    System.out.print("Insert a el arr:");
                    arr[i] = sc.nextInt();
                }
                int ma;
                sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }
                ma = sum / n;
                for (int i = 0; i < n; i++) {
                    if(ma > arr[i]){
                        System.out.print(arr[i] + " ");
                    }
                }
                break;
            case 6:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Propozitia este: ");
                String nume = scanner.nextLine();
                 n = nume.length();
                 sum = 0;
                for (int i = 0; i < n; i++) {
                    if(nume.charAt(i) == 'a' || nume.charAt(i) == 'A'){
                       sum++;
                    }
                }
                System.out.println("Numarul de caracte a/A este: " + sum);
                sc.close();
                break;
            case 7:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Propozitia este: ");
                nume = scanner1.nextLine();
                n = nume.length();
                for (int i = 0; i < n; i++) {
                    if(nume.charAt(i) == 'a' || nume.charAt(i) == 'A'){
                        System.out.print(i + " ");
                    }
                }
                scanner1.close();
                break;
            case 8:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Propozitia este: ");
                nume = scanner2.nextLine();
                n = nume.length();
                char spatiu = ' ';
                sum = 0;
                for (int i = 0; i < n; i++) {
                    if(nume.charAt(i) == spatiu  ){
                        sum++;
                    }
                }
                sum +=1;
                System.out.println(sum);
                scanner2.close();
                break;
            case 9:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Propozitia este: ");
                nume = scanner3.nextLine();
                n = nume.length();
                int vocale = 0;
                int consoane;
                for (int i = 0; i < n; i++) {
                    if(nume.toLowerCase().charAt(i) == 'a' || nume.toLowerCase().charAt(i) == 'e' || nume.toLowerCase().charAt(i) == 'i' || nume.toLowerCase().charAt(i) == 'o' || nume.toLowerCase().charAt(i) == 'u'){
                        vocale ++;
                    }
                }
                consoane = 100 - (vocale*10);
                System.out.println("Procentajul de vocale este de: " + (vocale*10) + "%" );
                System.out.println("Procentajul de consoane este de: " + consoane+ "%" );
                scanner3.close();
                break;
            case 10:
                char m = 'a';
                char m1 = 'A';
                int z , c = 0 ;
                Scanner scan = new Scanner(System.in);
                System.out.print("Cate cuvinte doriti sa introduceti : ");
                 n = scan.nextInt();
                for(int i = 0 ; i <= n ; i++){
                    String ar = scan.nextLine();
                    z = ar.length();
                    for(int j = 0 ; j < z ; j++){
                        if(ar.charAt(j) == m || ar.charAt(j) == m1){
                            c = c + 1 ;
                        }

                    }
                }
                System.out.println("Litera a/A apare de  : " + c);
                break;
        }
    }
}
