package HandCoding;

public class HandCoding {
    public static void main(String[] args) {
    	 int n = 5; // 패턴의 길이

         for (int i = -n + 1; i < n; i++) {
             for (int j = -n + 1; j < n; j++) {
                 if (Math.abs(i) == Math.abs(j)) {
                     System.out.print("O");
                 } else {
                     System.out.print("o");
                 }
             }
             System.out.println();
         }
     }
 }
