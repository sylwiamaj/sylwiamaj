package Cities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class cities1 {

    private Map<String, List<String>> privinces = new HashMap();

    public cities1() {
        List<String> lista = new ArrayList<String>();
        lista.add("Elbląg");
        lista.add("Olsztyn");
        privinces.put("warminsko-mazurskie", lista);
        List<String> lista1 = new ArrayList<String>();
        lista.add("Gdańsk");
        lista.add("Gdynia");
        privinces.put("pomorskie", lista1);

    }

    public static void main(String[] argv) {
        cities1 c = new cities1();
        System.out.println(c.privinces);
    }
}
