import java.util.*;

public class NestedLoops {

    public static void main(String[] args){
        int[] firstDay = {1,2,3,4,5,6,7,8,9,10};
        int[] secondDay = {9,44,65,23,4,66,8};

        int matchedCount = 0;
        for(int i = 0; i< firstDay.length; i++){
            for(int num : secondDay){
                if(num == firstDay[i]){
                    matchedCount++;
                    System.out.println("number: " + firstDay[i] +" from firstDay array has matched with secondDay " +
                            "array the index for first day array number is: " + i);
                }
            }
        }
        System.out.println("Total numbers matched: " + matchedCount);

    }
}
