public class Main {
    public static void main(String[] args) {

        //Задание № 1
        System.out.println("Задание № 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] db = {1.57, 7.654, 9.986};
        char[] ch = {'a', 'b', 'c'};

        System.out.println("Задание № 2");
        //Задание № 2
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
            if (a[i] == a.length - 1) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < db.length; i++) {
            System.out.print(db[i] + ", ");
            if (db[i] == db.length - 1) {
                break;
            }

        }
        System.out.println();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + ", ");
            if (ch[i] == ch.length - 1) {
                break;
            }

        }
        System.out.println("\n Задание № 3");
        // Задание № 3
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ", ");
            if (a[i] == 0) {
                break;
            }
        }
        System.out.println();
        for (int i = db.length - 1; i >= 0; i--) {
            System.out.print(db[i] + ", ");
            if (db[i] == 0) {
                break;
            }
        }
        System.out.println();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + ", ");
            if (ch[i] == 0) {
                break;
            }
        }
        System.out.println("\n Задание № 4");
        // Задание № 4
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
            System.out.print(a[i] + ", ");

        }


    }
}
