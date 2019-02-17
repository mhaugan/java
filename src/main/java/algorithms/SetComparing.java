package algorithms;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetComparing {

  private static Set<Integer> fullSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
  private static Set<Integer> missingEntry = new HashSet<>(Arrays.asList(1, 2, 4, 5));

  public static void main(String[] args) {
    System.out.println(findMissing(fullSet, missingEntry));
  }

  private static SetView<Integer> findMissing(Set<Integer> fullSet, Set<Integer> missingEntry) {
    return Sets.symmetricDifference(fullSet, missingEntry);
  }
}
