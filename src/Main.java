public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
    /*
    Объявите переменные типа int, byte, short, long, float, double.
    Название переменных может быть любым, но если состоит из двух слов и более,
    должно соответствовать правилу camelCase.
    Выведите в консоль значение каждой переменной в формате
    «Значение переменной … с типом … равно …».
     */
        int number;
        byte count;
        short numeral;
        long numeration;
        float tip;
        double tern;
        number = 100;
        count = 1;
        numeral = 10;
        numeration = 1000;
        tip = 1.7F;
        tern = 1.16;
        System.out.println(number);
        System.out.println(count);
        System.out.println(numeral);
        System.out.println(numeration);
        System.out.println(tip);
        System.out.println(tern);

        /*
        Ниже дан список различных значений.
        Инициализируйте переменные, используйте изученные ранее типы переменных.
        Значения:
        27.12
        987 678 965 549
        2,786
        569
        -159
        27897
        67
         */
        float a = 27.12F;
        long b = 987-678-965-549;
        double c = 2.789;
        short d = 569;
        short i = -159;
        int f = 27879;
        byte g = 67;

        System.out.println("Задача №3");
        /*
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и
        Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников,
        у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате:
        «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.
         */
        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short paper = 480;
        short student;
        student = (short) (paper / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna));
        System.out.println("На каждого ученика рассчитано " + student + " листов бумаги");

        System.out.println("Задача №4");
        /*
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        Какая производительность машины будет:
        за 20 минут,
        в сутки,
        за 3 дня,
        за 1 месяц?
        Рассчитывайте производительность работы машины в том случае,
        если она работает без перерыва заданный промежуток времени.
        Результаты подсчетов выведите в консоль в формате:
        «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.
         */
        byte bottle = 16;
        byte performance1 = 20;
        short performance2 = 1440;
        short performance3 = 4320;
        int performance4 = 44640;
        short machinePerformance1;
        machinePerformance1 = (short) (bottle / 2 * performance1);
        System.out.println("За " + performance1 + " машина произвела " + machinePerformance1 + " штук бутылок");
        short machinePerformance2;
        machinePerformance2 = (short) (bottle / 2 * performance2);
        System.out.println("За " + performance2 + " машина произвела " + machinePerformance2 + " штук бутылок");
        int machinePerformance3;
        machinePerformance3 = bottle / 2 * performance3;
        System.out.println("За " + performance3 + " машина произвела " + machinePerformance3 + " штук бутылок");
        int machinePerformance4;
        machinePerformance4 = bottle / 2 * performance4;
        System.out.println("За " + performance4 + " машина произвела " + machinePerformance4 + " штук бутылок");

        System.out.println("Задача №5");
        /*
        На ремонт школы нужно 120 банок краски двух цветов:
        белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате:
        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.
         */
        byte shoolPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte shoolClass = 120 / (2 + 4) ;
        byte paintCansWhite = (byte) (shoolClass * whitePaint);
        byte paintsCansBrown = (byte) (shoolClass * brownPaint);
        System.out.println("В школе, где " + shoolClass + " классов, нужно " + paintCansWhite + " банок белой краски и " + paintsCansBrown + " банок коричневой краски");

        System.out.println("Задача №6");
        /*
        Спортсмены следят за своим весом и тщательно относятся к тому,
        что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака,
        а затем переведите его в килограммы.
        Результат в граммах и килограммах напечатайте в консоль.
         */
        byte banana = 5;
        byte massaBanana = 80;
        short milk = 2;
        byte massaMilk = 105;
        byte iseCream = 2;
        byte massaIseCream = 100;
        byte egg = 4;
        byte massaEgg = 70;
        float massaProductGramm = banana * massaBanana + milk * massaMilk + iseCream * massaIseCream + egg * massaEgg;
        System.out.println(massaProductGramm);
        float massProductKilogramm =  massaProductGramm / 1000;
        System.out.println(massProductKilogramm);

        System.out.println("Задача №7");
        /*
        Правила соревнований обновились, и спортсмену,
        чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе
        от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдет на похудение,
        если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем,
        чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.
         */
        float massaSportsmen = 7.000F;
        float dietaryIntake1 = 0.250F;
        float dietaryIntake2 = 0.500F;
        byte massa250 = (byte) (massaSportsmen / dietaryIntake1);
        System.out.println(massa250);
        byte massa500 = (byte) (massaSportsmen / dietaryIntake2);
        System.out.println(massa500);
        byte daysMedium = (byte) ((massa250 + massa500) / 2);
        System.out.println(daysMedium);

        System.out.println("Задасча №8");
        /*
        Представим, что мы работаем в большой компании,
        штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании,
        тем ценнее он для бизнеса. Поэтому сотрудники,
        которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
        а также провести расчет для следующих сотрудников:
        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом
        с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников,
        а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику.
        Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
         */
        int Maha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int salaryIncreaseMaha = (int) (Maha * 1.1);
        int annualIncomeMahaOld =  Maha * 12;
        int annualIncomeMahaNew =  salaryIncreaseMaha * 12 - annualIncomeMahaOld;
        System.out.println("Маша теперь получает " + salaryIncreaseMaha + " рублей. Годовой доход вырос на " + annualIncomeMahaNew + " рублей");
        int salaryIncreaseDenis = (int) (Denis * 1.1);
        int annualIncomeDenisOld = Denis * 12;
        int annualIncomeDenisNew = salaryIncreaseDenis * 12 - annualIncomeDenisOld;
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + annualIncomeDenisNew + " рублей");
        int salaryIncreaseKristina = (int) (Kristina * 1.1);
        int annualIncomeKristinaOld = Kristina * 12;
        int annualIncomeKristinaNew = salaryIncreaseKristina * 12 - annualIncomeKristinaOld;
        System.out.println("Кристина тепрь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + annualIncomeKristinaNew + " рублей");
    }
}