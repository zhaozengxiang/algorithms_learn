package homework.week4;

/**
 * 208. 实现 Trie (前缀树)
 */
public class Trie {
    public static void main(String[] args) {

    }
    private boolean isEnd;
    private Trie[] next;
    public Trie() {
        isEnd = false;
        next = new Trie[26];
    }

    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        Trie curr = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.next[index] == null) {
                curr.next[index] = new Trie();
            }
            curr = curr.next[index];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    public Trie searchPrefix(String word) {
        if (word == null || word.length() == 0) {
            return null;
        }
        Trie curr = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.next[index] == null) {
                return null;
            }
            curr = curr.next[index];
        }
        return curr;
    }
}
