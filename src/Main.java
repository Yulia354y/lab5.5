import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Завдання 1
        String s1,s2,s3,s4,s5,s6;
        Scanner sc = new Scanner(System.in);//ввід з клавіатур
        System.out.print("Введіть  п'ять слів: ");
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();
        s4 = sc.next();
        s5 = sc.next();
        s6 = s1.concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4).concat(" ").concat(s5);//робимо речення
        System.out.println(s6);

        //Завдання 2
        String f1,f2,f3,f4,f5,f6;
        Scanner fg = new Scanner(System.in);
        System.out.print("Введіть  п'ять слів: ");
        f1 = fg.next();
        f2 = fg.next();
        f3 = fg.next();
        f4 = fg.next();
        f5 = fg.next();
        f6 = f1.substring(0,1)+f2.substring(0,1)+f3.substring(0,1)+f4.substring(0,1)+f5.substring(0,1);//беремо перші букви під 0 індк 1 не включ
        System.out.println(f6);



        //Завдання 3
        double a, b, c, max;//тип
        Scanner s = new Scanner(System.in);//з клав
        System.out.print("Введіть перше дробове число: ");
        if (s.hasNextDouble()) {//перевір на дабл
            a = s.nextDouble();//присвой текст з клав
            System.out.print("Введіть друге дробове число: ");
            if (s.hasNextDouble()) {
                b = s.nextDouble();
                System.out.print("Введіть третє дробове число: ");
                if (s.hasNextDouble()) {
                    c = s.nextDouble();
                    if (a>=b && a>=c) {
                        max=a;
                    } else if (b>=a && b>=c) {
                        max=b;
                    } else {
                        max=c;
                    }
                    System.out.println("Максимальне число: " + max);
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }



        //Завдання 4
        String first,second;//tup
        Scanner cg = new Scanner(System.in);
        System.out.println("Введіть перше ім'я:");
        first = cg.nextLine();

        System.out.println("Введіть друге ім'я:");
        second = cg.nextLine();

        if (first.equalsIgnoreCase(second)) {//перевір симв на ідентич
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }


        //Завдання 5
        String m,n;
        Scanner mer = new Scanner(System.in);
        System.out.print("Введіть  два рядки : ");
        m = mer.next();//ми присв знач з клав
        n = mer.next();
        int l1 = m.length();
        int l2 = n.length();

        if (l1 > l2) {
            System.out.println("Перший рядок має більше символів");
        } else if (l2 > l1) {
            System.out.println("Другий рядок має більше символів");
        } else {
            System.out.println("Рядки мають однакову кількість символів");
        }

    }
}