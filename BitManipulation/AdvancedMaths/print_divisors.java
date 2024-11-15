package BitManipulation.AdvancedMaths;

public class print_divisors {
    public static void print_divisors(int n) {
        // code here
        // TC:O(N) SC:O(1)
        // List<Integer> arr = new ArrayList<Integer>();
        // for(int i=1;i<n;i++){
        //     if(n%i == 0){
        //         arr.add(i);
        //     }
        // }
        
        // Tc:O(sqrt(n)*nLogn) Sc:O(1)
        
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                arr.add(i);
                if(n/i != i){
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    
}
