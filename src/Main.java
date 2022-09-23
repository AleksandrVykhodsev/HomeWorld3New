public class Main {
    public static void main(String[] args) {

        //задача 1
        System.out.println("Задача 1!!!");
        int a = 89421;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 24;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 1278;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 671618854;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 17.645624f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 694.45665456632496;
        System.out.println("Значение переменной f с типом double равно " + f);
        //задача 2
        System.out.println("Задача 2!!!");
        float g = 27.12f;
        System.out.println(g + " тип переменной float");
        long h = 987678965549L;
        System.out.println(h + " тип переменной long");
        byte i = 2;
        System.out.println(i + " тип переменной byte");
        short j = 786;
        System.out.println(j + " тип переменной short");
        boolean k = 8 > 27;
        System.out.println(k);
        short l = 569;
        System.out.println(l + " тип переменной short");
        short m = -159;
        System.out.println(m + " тип переменной short");
        short n = 27897;
        System.out.println(n + " тип переменной short");
        byte o = 67;
        System.out.println(o + " тип переменной byte");
        //Задача 3
        System.out.println("Задача 3!!!");
        int lyudmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int totalPaper = 480;
        int studentSheets = totalPaper / totalStudents;
        System.out.println("На каждого ученика расчитано " + studentSheets + " листов бумаги.");
        //Задача 4
        System.out.println("Задача 4!!!");
        int performance2Minutes = 16;
        int performance1Minutes = performance2Minutes / 2;
        int performance20Minutes = performance1Minutes * 20;
        System.out.println("За 20 минут машина произвела бутылок " + performance20Minutes + " штук.");
        int performanceDay = performance1Minutes * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + performanceDay + " штук.");
        int performance3Day = performanceDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + performance3Day + " штук.");
        int performanceMonth = performance3Day * 10;
        System.out.println("За месяц машина произвела бутылок " + performanceMonth + " штук.");
        //Задача 5
        System.out.println("Задача 5!!!");
        int jarTotal = 120;
        int white1Class = 2;
        int brown1Class = 4;
        int jar1Class = white1Class + brown1Class;
        int totalClass = jarTotal / jar1Class;
        int totalWhite = white1Class * totalClass;
        int totalBrown = brown1Class * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
        //Задача 6
        System.out.println("Задача 6!!!");
        int bananaRecipe = 5;
        int milkRecipe = 2;
        int iceCreamRecipe = 2;
        int eggRecipe = 4;
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int totalBanana = bananaRecipe * weightBanana;
        int totalMilk = milkRecipe * weightMilk;
        int totalIceCream = iceCreamRecipe * weightIceCream;
        int totalEgg = eggRecipe * weightEgg;
        int breakfastGram = totalBanana + totalMilk + totalIceCream + totalEgg;
        int gramsPerKilogram = 1000;
        float breakfastKilogram = breakfastGram / (float)gramsPerKilogram;
        System.out.println("Вес завтрака спортсмена " + breakfastKilogram + " килограмм.");
        //Задача 7
        System.out.println("Задача 7!!!");
        int resultKilogram = 7;
        int resultGrams = resultKilogram * gramsPerKilogram;
        int day250Grams = 250;
        int day500Grams = 500;
        int dayAverageGrams = (day250Grams + day500Grams) / 2;
        int maxDay = resultGrams / day250Grams;
        int a1 = resultGrams % day250Grams;
        System.out.println("На похудение спортсмену при потере в весе " + day250Grams + " грамм в день, ему потребуется " + maxDay + " дней , чтобы похудеть на 7 кг.");
        System.out.println("Остаток от деления данного выражения равен " + a1 + ".");
        int minDay = resultGrams / day500Grams;
        int a2 = resultGrams % day500Grams;
        System.out.println("На похудение спортсмену при потере в весе " + day500Grams + " грамм в день, ему потребуется " + minDay + " дней , чтобы похудеть на 7 кг.");
        System.out.println("Остаток от деления данного выражения равен " + a2 + ".");
        int averageDay = resultGrams / dayAverageGrams;
        int a3 = resultGrams % dayAverageGrams;
        System.out.println("На похудение спортсмену при потере в весе " + dayAverageGrams + " грамм в день, ему потребуется " + averageDay + " дней , чтобы похудеть на 7 кг.");
        System.out.println("Остаток от деления данного выражения равен " + a3 + ".");
        //Задача 8
        System.out.println("Задача 8!!!");
        int mashaMonthBefore = 67760;
        int denisMonthBefore = 83690;
        int kristinaMonthBefore = 76230;
        float raising = 1.1F;
        float mashaMonthAfter = mashaMonthBefore * (float)raising;
        float denisMonthAfter = denisMonthBefore * (float)raising;
        float kristinaMonthAfter = kristinaMonthBefore * (float)raising;
        float mashaYearDifference = (float)mashaMonthAfter * 12 - mashaMonthBefore * 12;
        float denisYearDifference = (float)denisMonthAfter * 12 - denisMonthBefore * 12;
        float kristinaYearDifference = (float)kristinaMonthAfter * 12 - kristinaMonthBefore * 12;
        System.out.println("Маша теперь получает " + mashaMonthAfter + " рублей. Годовой доход вырос на " + mashaYearDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisMonthAfter + " рублей. Годовой доход вырос на " + denisYearDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaMonthAfter + " рублей. Годовой доход вырос на " + kristinaYearDifference + " рублей.");

        System.out.println("Спасибо за проверку!!!");

    }
}