public class Main {
    public static void main(String[] args) {

        int i = 0; //Задание №1
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int I = 10; I > 0; I = I - 1) {
            System.out.print(" " + I);

        }
        System.out.println();

        for (int friday = 1; friday < 31; friday = friday + 7) { //Задание №2
            System.out.println("Сегодня пятница " + friday + "е число. Необходимо подготовить отчет");
        }

        int currentYear = 2021; //Задание №3
        for (int b = currentYear - 200; b < currentYear + 100; b = b + 79) {
            System.out.println("Комета рядом с Землей в " + b + " году");
        }

        for (int a = 1; a < 31; a++) {  //Задание №4
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ":ping pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ":ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ":pong");
            } else {
                System.out.println(a + ":");
            }

        }

        //Задание №5
        int c = 0;
        int d = 1;
        System.out.print(c + " " + d + " ");
        while (c < 34 && d < 34) {
            c = c + d;
            d = d + c;
            System.out.print(c + " " + d + " ");
        }

    }
}

