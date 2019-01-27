
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> n = new HashMap<String,String>();
        n.put("matti", "mage");
        n.put("mikael", "mixu");
        n.put("arto", "arppa");
        String mikael = n.get("mikael");
        System.out.println(mikael);
    }

}
