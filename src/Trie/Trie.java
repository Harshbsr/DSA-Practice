package Trie;

public class Trie {
    private TrieNode root;

     public Trie(){
         root= new TrieNode();
     }

    private class TrieNode {
        private TrieNode [] children ;
        private boolean isWord;

        public TrieNode(){
            this.children= new TrieNode[26];
            this.isWord=false;
        }
    }

    public void insert(String word) {
         if(word==null || word.isEmpty()){
             throw new IllegalArgumentException("word is empty or null");
         }
        TrieNode current = root;
         word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            } else {
                current = current.children[index];
            }
        }
        current.isWord=true;

    }

    public boolean search(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("word is empty or null");
        }
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
              return false;
            }
            current = current.children[index];
        }
         return current.isWord;
    }

    public static void main(String[] args){
      Trie tr = new Trie();
      tr.insert("Cat");
      tr.insert("Cow");
      tr.insert("Hat");
      tr.insert("Ramesh");
      tr.insert("Ram");
      System.out.println("Values inserted successfully");

      System.out.println(tr.search("cat"));
        System.out.println(tr.search("ca"));
        System.out.println(tr.search("Ramesh"));
        System.out.println(tr.search("hate"));
        System.out.println(tr.search("ctm"));
        System.out.println(tr.search("Caw"));
    }
}
