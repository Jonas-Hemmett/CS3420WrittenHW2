// jdh CS 3240A / CS 5240A Fall 2025


public class Analyzer {
  int[] values;

  public Analyzer(int[] values) {
    this.values = values;

    // implement this
    // pad out if necessary to next even power of two

    int newSize = (int)Math.pow(2, Math.ceil(Math.log(values.length) / Math.log(2)));
  }

  // public int[] findMaxDiff() {
  //   return findMaxDiffRec(0, values.length - 1);
  // }

  // public int[] findMaxDiffRec(int startIndex, int endIndex) {

  //   // implement this
  // } // findMaxDiffRec()

  //-----------------------------------------e--------

  public int[] findMaxDiffBF() {
    // Handles edge cases
    if (values.length == 0){
      return new int[0];
    }

    if (values.length == 1){
      return new int[] {values[0]};
    } 

    int[] best = {values[0], values[1]};

    for (int i = 0; i < values.length; i++){
      for (int j = 0; j < i; j++){
        // Makes sur vi > vj in best
        int diff = values[i] - values[j];
        if (diff > best[1] - best[0]){
          best = new int[] {values[i], values[j]};
        }
      }
    }

    return best;
  } // findMaxDiffBF()
} // class Analyzer
