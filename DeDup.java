package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
 
public class DeDup {
 
       public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3,20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19,13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
 
       public static void main(String[] args) {
              DeDup deDup = new DeDup();
              int[] uniqueIntArray1 = removeDuplicateUsingNestedLoop(deDup.randomIntegers);
              System.out.println("uniqueIntArray1 length using nested loop---->"+uniqueIntArray1.length);
              int[] uniqueIntArray2 = removeDuplicatesAndSortArrayList(deDup.randomIntegers);
              System.out.println("uniqueIntArray2 length using ArrayList---->"+uniqueIntArray2.length);
              int[] uniqueIntArray3 = removeDuplicatesUsingLinkedHashSet(deDup.randomIntegers);
              System.out.println("uniqueIntArray3 length using LinkedHashSet---->"+uniqueIntArray3.length);
       }
       
       public static int[] removeDuplicateUsingNestedLoop(int[] a) {
           int count = 1;
           for (int i = 1; i < a.length; i++) {
                  int j = 0;
                  for (; j < count; j++) {
                        if (a[j] == a[i]) {
                               break;
                        }
                  }
                  if (j == count) {
                        a[count] = a[i];
                        count++;
                  }
           }

           int result[] = new int[count];
           for (int i = 0; i < count; i++) {
                  System.out.print(a[i]+" ");
                  result[i] = a[i];
           }

           return result;
    }
 
       public static int[] removeDuplicatesAndSortArrayList(int[] arr) {
       	ArrayList<Integer> al = new ArrayList<Integer>();
       	for (Integer integer : arr) {
               al.add(integer);
               Collections.sort(al);
        }
       	for(int i=0;i<al.size();i++){
               for(int j=i+1;j<al.size();j++){
                   if(al.get(i).equals(al.get(j))){
                       al.remove(j);
                       j--;
                   }
               }
           }
       	int result[] = new int[al.size()];
           int counter = 0;
           for (Integer x :al) {
                  result[counter] = x;
                  System.out.print(result[counter]+" ");
                  counter++;
           }
           return result;
   }
 
       public static int[] removeDuplicatesUsingLinkedHashSet(int[] array) {
 
    	   Set<Integer> LH = new LinkedHashSet<Integer>();
           for (Integer integer : array) {
                  LH.add(integer);
           }
           int result[] = new int[LH.size()];
           int counter = 0;
           for (Integer x : LH) {
                  result[counter] = x;
                  System.out.print(result[counter]+" ");
                  counter++;
           }
           return result;
 
}
}
