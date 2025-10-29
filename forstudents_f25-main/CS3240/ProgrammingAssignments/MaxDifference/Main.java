// jdh CS 3240A / CS 5240A Fall 2025

public class Main {
  public static void main(String args[]) {
    int[] values = new int[31];
    int size = (int)Math.pow(2, Math.ceil(Math.log(values.length) / Math.log(2)));
    System.out.println("Size: " + size);
    // testOne();
    // testTwo();
  }

//   public static void testOne() {
//     int[] vals = {
// 98, 98, 97, 97, 96, 95, 98, 100, 102, 104, 106, 107, 108, 111, 113, 114, 114, 117, 117, 119, 121, 122, 123, 122, 121, 118, 117, 114, 112, 111, 109, 109, 109, 109, 111, 113, 115, 117, 117, 118, 119, 121, 124, 122, 120, 117, 115, 114, 111, 108,
// 105, 103, 102, 100, 97, 96, 96, 95, 95, 94, 94, 93, 92, 89, 88, 85, 85, 85, 84, 81, 81, 81, 78, 78, 77, 76, 76, 76, 74, 71, 71, 71, 72, 75, 78, 79, 79, 80, 80, 81, 81, 83, 86, 89, 91, 88, 88, 90, 91, 94,
// 94, 94, 94, 96, 99, 99, 102, 104, 104, 105, 105, 108, 109, 111, 112, 113, 115, 118, 121, 123, 126, 128, 129, 129, 129, 131, 133, 136, 138, 139, 140, 142, 144, 144, 144, 147, 144, 143, 143, 141, 140, 138, 138, 139, 139, 142, 144, 144, 145, 148,
// 146, 143, 140, 137, 134, 132, 130, 128, 128, 125, 124, 122, 119, 116, 116, 116, 116, 116, 116, 114, 114, 114, 113, 111, 113, 114, 117, 117, 119, 121, 122, 125, 126, 128, 129, 129, 129, 131, 131, 134, 134, 137, 139, 139, 142, 142, 144, 146, 146, 14
// };
//     Analyzer analyzer = new Analyzer(vals);
//     int[] maxDiffInd = analyzer.findMaxDiff();
//     System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);

//     System.out.println("brute force:");
//     maxDiffInd = analyzer.findMaxDiffBF();
//     System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);
//   } // testOne()

//   //--------------------------------------------------

//   public static void testTwo() {
//     int[] vals = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//     Analyzer analyzer = new Analyzer(vals);
//     int[] maxDiffInd = analyzer.findMaxDiff();
//     System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);

//     System.out.println("brute force:");
//     maxDiffInd = analyzer.findMaxDiffBF();
//     System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);
//   } // testTwo()

} // class Main
