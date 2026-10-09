import java.util.Arrays;
import java.util.List;

public class LowBound {
    //Tapşırıq 5: Wildcard, super
    //
    //Siyahıya 1-dən n-ə qədər ədədləri əlavə edən metod yaz:

    public static void add(List<? super Integer> list, int n){
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
    }
}
