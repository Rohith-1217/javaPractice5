import java.util.ArrayList;

public class Arraylistreplacing {

    //Declaring method1
    public ArrayList<String> isArraylist(ArrayList lis) {
        lis.set(0, "kiwi");
        lis.set(2,"mango");
        ArrayList<String> result = lis;
        return result;

    }
    //Declaring method2
    public ArrayList<String> isClear(ArrayList arr1)
    {
        arr1.clear();
        return arr1;
    }
}