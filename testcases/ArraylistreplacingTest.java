import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArraylistreplacingTest {

    //object declared for java class

    private static Arraylistreplacing replace;
    @Before
    public void setup(){
        replace=new Arraylistreplacing();
    }
    @After
    public void tearDown(){
        replace=null;
    }

    @Test
    //It replace the first element of array
    public void listReplace()
    {

        ArrayList<String> li = new ArrayList<String>();
        li.add("apple");
        li.add("grape");
        li.add("melon");
        li.add("berry");

        ArrayList<String> arr=replace.isArraylist(li);
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("kiwi");
        arr1.add("grape");
        arr1.add("mango");
        arr1.add("berry");
        Assert.assertEquals(arr1,arr);
    }
    @Test
    //It clears the all elements present in arraylist
    public void clearArray()
    {
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("kiwi");
        arr1.add("grape");
        arr1.add("mango");
        arr1.add("berry");
        ArrayList<String> res=replace.isClear(arr1);

        assertEquals(true,res.isEmpty());
    }
}