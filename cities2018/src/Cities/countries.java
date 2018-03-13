package Cities;


import java.util.HashMap;
import java.util.Map;

public class countries {

    private Map<String, String> countries = new HashMap();

    public countries() {
        countries.put("Poland", "Warsaw");
        countries.put("German", "Berlin");
        countries.put("UK", "London");
        countries.put("Russia", "Moscow");
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");
    }
    public String toString() {
        return countries.toString();
    }
    public static void main(String[] args) {
       countries c = new countries();
       System.out.println(c);
    }
}
