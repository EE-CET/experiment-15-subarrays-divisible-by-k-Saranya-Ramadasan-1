import java.util.Scanner;
import java.util.HashMap;

public class SubarraysDivByK {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        long count = 0;
        long prefixSum = 0;
        
        for (int i = 0; i < n; i++) {
            prefixSum += sc.nextInt();
            int rem = (int)(prefixSum % k);
            if (rem < 0) {
                rem += k;
            }
            
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        
        System.out.println(count);
        sc.close();
    }
    
}
