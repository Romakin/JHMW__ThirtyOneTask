package Task2;

public class BinOps {
    public String sum(String a, String b) {
        /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int aInt  = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int res = aInt + bInt;
        System.out.printf("%d + %d = %d \n", aInt, bInt, res);
        return Integer.toBinaryString(res);
    }

    public String mult(String a, String b) {
        /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int aInt  = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int res = aInt * bInt;
        System.out.printf("%d * %d = %d \n", aInt, bInt, res);
        return Integer.toBinaryString(res);
    }
}
