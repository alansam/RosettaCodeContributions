
import java.util.*;

abstract class RHuffmanTree implements Comparable<RHuffmanTree> {

  public final int frequency; // the frequency of this tree

  public RHuffmanTree(int freq) {
    frequency = freq;

    return;
  }

  // compares on the frequency
  public int compareTo(RHuffmanTree tree) {
    return frequency - tree.frequency;
  }
}

class RHuffmanLeaf extends RHuffmanTree {

  public final char value; // the character this leaf represents

  public RHuffmanLeaf(int freq, char val) {
    super(freq);
    value = val;

    return;
  }
}

class RHuffmanNode extends RHuffmanTree {

  public final RHuffmanTree left, right; // subtrees

  public RHuffmanNode(RHuffmanTree l_, RHuffmanTree r_) {
    super(l_.frequency + r_.frequency);
    left = l_;
    right = r_;

    return;
  }
}

public class RHuffmanCode {

  /**
   * input is an array of frequencies, indexed by character code
   */
  public static RHuffmanTree buildTree(int[] charFreqs) {
    PriorityQueue<RHuffmanTree> trees = new PriorityQueue<RHuffmanTree>();
    // initially, we have a forest of leaves
    // one for each non-empty character
    for (int i_ = 0; i_ < charFreqs.length; i_++)
    if (charFreqs[i_] > 0) {
      trees.offer(new RHuffmanLeaf(charFreqs[i_], (char) i_));
    }

    assert trees.size() > 0;
    // loop until there is only one tree left
    while (trees.size() > 1) {
      // two trees with least frequency
      RHuffmanTree a = trees.poll();
      RHuffmanTree b = trees.poll();

      // put into new node and re-insert into queue
      trees.offer(new RHuffmanNode(a, b));
    }

    return trees.poll();
  }

  public static void printCodes(RHuffmanTree tree, StringBuffer prefix) {
    assert tree != null;
    if (tree instanceof RHuffmanLeaf) {
      RHuffmanLeaf leaf = (RHuffmanLeaf)tree;

      // print out character, frequency, and code for this leaf (which is just the prefix)
      System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);
    }
    else if (tree instanceof RHuffmanNode) {
      RHuffmanNode node = (RHuffmanNode)tree;

      // traverse left
      prefix.append('0');
      printCodes(node.left, prefix);
      prefix.deleteCharAt(prefix.length() - 1);

      // traverse right
      prefix.append('1');
      printCodes(node.right, prefix);
      prefix.deleteCharAt(prefix.length() - 1);
    }

    return;
  }

  public static void main(String[] args) {
    String test = "this is an example for huffman encoding";

    // we will assume that all our characters will have
    // code less than 256, for simplicity
    int[] charFreqs = new int[256];
    // read each character and record the frequencies
    for (char c_ : test.toCharArray()) {
      charFreqs[c_]++;
    }

    // build tree
    RHuffmanTree tree = buildTree(charFreqs);

    // print out results
    System.out.println("SYMBOL\tWEIGHT\tHUFFMAN CODE");
    printCodes(tree, new StringBuffer());

    return;
  }
}

/*
Example output:
  SYMBOL WEIGHT HUFFMAN CODE
  d      1      00000
  t      1      00001
  h      2      0001
  s      2      0010
  c      1      00110
  x      1      00111
  m      2      0100
  o      2      0101
  n      4      011
  u      1      10000
  l      1      10001
  a      3      1001
  r      1      10100
  g      1      101010
  p      1      101011
  e      3      1011
  i      3      1100
  f      3      1101
         6      111
*/

