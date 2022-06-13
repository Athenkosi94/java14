import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> hsh = new Hashtable<String, String>();
        hsh.put("name 1", "Thato");
        hsh.put("name 2", "Radha");
        hsh.put("name 3", "Rambuda");
        hsh.put("name 4", "Mark");
        hsh.put("name 5", "Keletso");
        hsh.put("name 6", "Tata");
        hsh.put("name 7", "Nkosi");

        for(String key : hsh.keySet()){
            System.out.println(hsh.get(key));
        }

    }
}