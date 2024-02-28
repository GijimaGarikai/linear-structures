package cs207.linear;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQExpt {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>(11, new Comparator<String>() {
            public int compare(String val1, String val2) {
                if (val1.length()==val2.length()) {
                    return val1.compareTo(val2);
                }
                if (val1.length() < val2.length()){
                    return -1;
                }
                return 1;
            }   
        }); 
        PrintWriter pen = new PrintWriter(System.out, true);
        pq.add("hello");
        pq.add("areeeeeet");
        pq.add("zzzz");
        pq.add("zzzy");


        pen.println(pq.remove());
        pen.println(pq.remove());
        pen.println(pq.remove());


    }
}
