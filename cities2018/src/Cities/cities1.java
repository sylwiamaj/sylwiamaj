package Cities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public Set<String> privinces()
    {
        return privinces.keySet();
}
    public List<String> cities (String province)
    {
     return privinces.get(privinces);  
    }
    public Map<String,String> provinceWithOneCity()
    {
        
    }
    
public Collection<String> cities()
{
    
}
