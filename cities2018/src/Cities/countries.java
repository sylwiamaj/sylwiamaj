package Cities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class countries {

    private Map<String, String> Countries = new HashMap();

    public countries() {
        Countries.put("Poland", "Warsaw");
        Countries.put("German", "Berlin");
        Countries.put("UK", "London");
        Countries.put("Russia", "Moscow");
        Countries.put("France", "Paris");
        Countries.put("Spain", "Madrid");
    }

    public String toString() {
        return Countries.toString();
    }

    public static void main(String[] args) {
        countries c = new countries();
        System.out.println(c);
        System.out.println(c.Countries());
        System.out.println(c.Capitals());
    }

    public Collection<String> Capitals() {
        retrun Countries.values();
    }

    public Collection<String> Countries() {
        return Countries.keySet();
    }

    public Collection<String> sortedCapitals() {
        TreeSet set = new TreeSet();
        set.addAll(Capitals());
        return set;

    }

    public Map<String, String> sortedByCapitals() {
        Map<String, String> map = new TreeMap();
        for( String key : Countries.keySet()){
            String value = Countries.get(key);
            map.put(value, key);
        }
        
   return map;
    }

    public Map<String, String> sortedByCountries() {
        TreeMap map = new TreeMap(Countries);
        return map;

    }

    public Collection<String> sortedCountries() {
        TreeSet set = new TreeSet();
        set.addAll(Countries());
        return set;

    }
}
