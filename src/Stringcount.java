import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringcount {

    //function called
    public int countString(String str,String key)
    {
        Pattern pattern=Pattern.compile(key);
        Matcher matcher=pattern.matcher(str);

        int counter=0;
        while (matcher.find())
        {
            counter++;
        }
        return counter;
    }

    //method declaration
    public Map<String,Integer> isCountOfString(String str) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] keys = {"one", "two", "three"};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], countString(str, keys[i]));//function calling
        }

        return map;
    }
}
