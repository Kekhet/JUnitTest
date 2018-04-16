import java.util.Arrays;
import java.util.List;

public class Test1B {

    public static int solution (int[] a) {
        if(a==null){
            throw new NullPointerException("Array is not initialized.");
        }

        if(a.length==0){
            throw new IllegalArgumentException("Illegal argument. Array is empty.");
        }

        while(a[a.length-1]==0){
            a = Arrays.copyOf(a,a.length-1);
        }

        for(int i = 0; i<a.length;i++){
            if(a[i]>=10){
                throw new IllegalArgumentException("Illegal argument. All arguments must be lower than 10.");
            }
            if(a[i]<0){
                throw new IllegalArgumentException("Illegal argument. All arguments must positive number.");
            }
        }

        int number = 0;
        int power = 1;
        for(int i = 0; i<a.length; i++){
            number+=a[i]*power;
            power*=10;
        }
        if(number>126322567){
            throw new IllegalArgumentException("Illegal argument. Number created is too big.");
        }
        number*=17;
        int retVal = 0;
        while(number!=0) {
            retVal += number % 10;
            number/=10;
        }
        return retVal;
        }
}
