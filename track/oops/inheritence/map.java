import java.util.HashMap;
import java.util.Map;

public class map{
    public static void main(String[] args) {
        Map<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<5;i++){
        freq.put('a',1+i);
        freq.put('b',1+i);
        freq.put('c',1+i);
        }
        freq.put('a',freq.getOrDefault('a',0)+1);
        System.out.println(freq);
        freq.put('d',freq.getOrDefault('d', 0)+1);
        System.out.println(freq);
    

    }

}