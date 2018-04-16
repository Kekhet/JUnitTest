import java.util.List;

public class Test1A {

    public static int solution (List<Integer> a){
        if(a==null){
            throw new NullPointerException("List is not initialized.");
        }

        Integer retVal = 1;
        int listSize = a.size();

        if(listSize == 0)
            throw new IllegalArgumentException("Illegal argument. List is empty.");

        if(listSize>100000)
            throw new IllegalArgumentException("Illegal argument. List is too big.");

        Object array[] = a.toArray();

        for(int i =0; i<listSize;i++){
            if((Integer)array[i]<-1000000||(Integer)array[i]>1000000){
                throw new IllegalArgumentException("Arguments are too big or too small");
            }
        }

        for(int i = 0; i<listSize;i++){
            Boolean check = a.contains(retVal);
            if(check){
                retVal += 1;
            } else{
                return retVal;
            }
        }
        return retVal;
    }

}

