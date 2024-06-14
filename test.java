import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * test
 */
public class test {

    public static void main(Strings[] args){

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,ArrayList<Integer>> hasMap = new HashMap<>();
        for(int i =0; i< arr1.length; i++){
            if(hasMap.containsKey(arr1[i])){
                hasMap.get(arr1[i]).add(i);
            }
            else{
                hasMap.put(arr1[i],new ArrayList(Arrays.asList(i)));
            }
        }

        int[] arr = new int[arr1.length];
        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            ArrayList<Integer> as = hasMap.get(arr2[i]);
            for(Integer item : as){
                arr[count] = item;
                count++;
            }
        }
        if(count < arr1.length){
            Arrays.sort(arr1);
            for(int i = 0;i<arr1.length;i++){
                if(!hasMap.containsKey(arr1[i])){
                    arr[count] = arr1[i];
                    count++;
                }
            }
        }
        return arr;
    }
}