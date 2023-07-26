package mvc_practice;

public class BeautifulArray {

    boolean solution(int[] a) {
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i < a.length; ++i) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; ++i) {
            sum2 += a[i];
            if ((sum - a[i]) / 2 == sum2 - a[i]) {
                return true;
            }
        }
        return false;
    }
}


