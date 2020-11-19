package lesson12;

public class Fraction extends Number {
    private int numerator;
    private int denominator;

    Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fraction) {
        Fraction result = sum(fraction, this);
        return result;
    }

    public static Fraction sum(Fraction a, Fraction b) {
        // описать сложение;
        // выполнить сокращение дробей, если это возможно
        // находим нок знаменателей дробей
        // подставить полученное значение в знаменатель РЕЗУЛЬТАТА
        // Разделить нок на знаменатели данных дробей.
        // умножить числитель и знаменатель каждой дроби на дополнительный множитель

        int cDenominator = Math.nok(a.denominator, b.denominator);
        int cNumerator =
                a.numerator * (cDenominator / a.denominator) +
                        b.numerator * (cDenominator / b.denominator);

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    @Override
    public String toString() {
        return "Fraction(дробь){" +
                "numerator(числитель)=" + numerator +
                ", denominator(знаменатель)=" + denominator +
                '}';
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class Math {
    static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
}