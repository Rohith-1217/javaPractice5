import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class StringcountTest {

    //object declared for java class
    private static Stringcount count;
    @Before
    public void setup(){
        count=new Stringcount();
    }
    @After
    public void tearDown(){
        count=null;
    }

    @Test
    //Count the occurences of given string
    public void countofstring()
    {
        String str="one one -one___two,,three,one @three*one?two";
        Map<String,Integer> result=count.isCountOfString(str);
        Map<String,Integer> original=new HashMap<>();
        original.put("one",5);
        original.put("two",2);
        original.put("three",2);
        assertEquals(original,result);

    }
}