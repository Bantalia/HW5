//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte container = 5;
        short boxes = 8000;
        int apples = 50000;
        long banana = 100000L;
        float land = 1.55f;
        double sea = 3.555555555;
        System.out.println("Значение переменной container с типом byte равно " + container);
        System.out.println("Значение переменной boxes с типом short равно " + boxes);
        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной banana с типом long равно " + banana);
        System.out.println("Значение переменной land с типом float равно " + land);
        System.out.println("Значение переменной sea с типом double равно " + sea);
        //Задача 2
        float l = 27.12f;
        float m = 2.786f;
        long x = 987678965549L;
        short b = 569;
        short d = -159;
        int a = 27897;
        byte t = 67;
        System.out.println("Значение переменной l с типом float равно " + l);
        System.out.println("Значение переменной m с типом float равно " + m);
        System.out.println("Значение переменной x с типом long равно " + x);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной d с типом short равно " + d);
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной t с типом byte равно " + t);
        //Задача 3
        byte teacherLP = 23;
        byte teacherAC = 27;
        byte teacherEA = 30;
        short paper = 480;
        short willGet = (short) (paper / (teacherLP + teacherAC + teacherEA));
        System.out.println("На каждого ученика рассчитано " + willGet + " листов бумаги.");
        //Задача 4
        byte bottle2 = 16;
        byte time20min = 20;
        short timeDay = 1440;
        byte time3Day = 3;
        byte time30Day = 1;
        short bottle20min = (short) ((bottle2 / 2) * time20min);
        System.out.println("За " + time20min + " минут машина произвела " + bottle20min + "штук бутылок");
        short bottleDay = (short) ((bottle2 / 2) * timeDay);
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        int bottle3Day = ((bottle2 / 2) * (bottleDay * 3));
        System.out.println("За " + time3Day + " дня машина произвела " + bottle3Day + " штук бутылок");
        int bottle30Day = ((bottle2 / 2) * (bottleDay * 30));
        System.out.println("За " + time30Day + " месяц машина произвела " + bottle30Day + "штук бутылок");
        //Задача 5
        byte allPaints = 120;
        byte white = 2;
        byte brown = 4;
        byte classes = (byte) (allPaints / (white + brown));
        byte whitAll = (byte) (white * classes);
        byte brownAll = (byte) (brown * classes);
        System.out.println("В школе, где " + classes + " классов, нужно " + whitAll + " банок белой краски и " + brownAll + " банок коричневой краски.");
        //Задача 6
        byte banana1 = 80;
        byte milk1 = 105;
        byte iceCream = 100;
        byte egg = 70;
        short gram = (short) ((banana1 * 5) + (milk1 * 2) + (iceCream * 2) + (egg * 4));
        float kilogram = gram / 1000f;
        System.out.println("Завтрак спорьсмена в граммах " + gram);
        System.out.println("Завтрак спорьсмена в килограммах " + kilogram);
        //Задача 7
        short weightLoss250 = (short) ((7 * 1000) / 250);
        short weightLoss500 = (short) ((7 * 1000) / 500);
        short daysAverage = (short) ((7 * 1000) / ((500 + 250) / 2));
        System.out.println("если спортсмен будет терять каждый день по 250 грамм понадобится " + weightLoss250 + " дней");
        System.out.println("если спортсмен будет терять каждый день по 500 грамм ронадобится " + weightLoss500 + " дней");
        System.out.println(daysAverage+ " может потребоваться дней в среднем, чтобы добиться результата похудения.");
        //Задача 8
        int employeeMasha = 67760;
        int employeeDenis = 83690;
        int employeeChristina = 76230;
        float coefficient = 1.1f;
        int employeeMashaOld = (employeeMasha * 12);
        float employeeMashaNow = (employeeMasha * coefficient);
        float employeeMashaNew = (employeeMashaNow * 12);
        float employeeMashaDifference = employeeMashaNew - employeeMashaOld;
        System.out.println("Маша теперь получает " + employeeMashaNew + " рублей. Годовой доход вырос на " + employeeMashaDifference + " рублей");
        int employeeDenisOld = (employeeDenis * 12);
        float employeeDenisNow = (employeeDenis * coefficient);
        float employeeDenisNew = (employeeDenisNow * 12);
        float employeeDenisDifference = employeeDenisNew - employeeDenisOld;
        System.out.println("Денис теперь получает " + employeeDenisNew + " рублей. Годовой доход вырос на " + employeeDenisDifference + " рублей");
        int employeeChristinaOld = (employeeChristina * 12);
        float employeeChristinaNow = (employeeChristina * coefficient);
        float employeeChristinaNew = (employeeChristinaNow * 12);
        float employeeChristinaDifference = employeeChristinaNew - employeeChristinaOld;
        System.out.println("Крестина теперь получает " + employeeChristinaNew + " рублей. Годовой доход вырос на " + employeeChristinaDifference + " рублей");


    }
}