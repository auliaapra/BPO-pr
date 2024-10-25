public class MathUtils {

    public static int factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk bilangan negatif: " + n);
        }
        if (n > 16){
            throw new IllegalArgumentException("Faktorial hanya didefinisikan untuk bilangan <= 16, input: " + n);
        }

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
            return fac;
    }
}
