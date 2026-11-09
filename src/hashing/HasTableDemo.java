package hashing;

public class HasTableDemo {

    private HashNode[] bucket;
    private int noOfBuckets;// Capacity
    private int size;// no of key pair value in Hashtable or n of nodes in Hashtable


    public HasTableDemo(){
        this.noOfBuckets=10;// default capacity

    }

    public HasTableDemo(int Capacity){
        this.noOfBuckets=Capacity;
        this.bucket= new HashNode[noOfBuckets];
        this.size=0;
    }

    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;// reference to next HashNode

         public HashNode(Integer key, String value){
            this.key=key;
            this.value=value;
        }

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void put(Integer keys,String values){
        if(keys== null || values == null){
            throw new IllegalArgumentException("key or value is null");
        }
        int bucketIndex = getBucketIndex(keys);
        HashNode head = bucket[bucketIndex];
        while(head!=null){
            if(head.key.equals(keys)){
                head.value= values;
                return;
            }
            head= head.next;
        }
        size++;
        head = bucket[bucketIndex];
        HashNode node = new HashNode(keys,values);
        node.next = head;
        bucket[bucketIndex]=node;
    }

   public String getValue(Integer keyValue){
        if(keyValue==null){
            new IllegalArgumentException("key is null");
        }
        int index = getBucketIndex(keyValue);
        HashNode head = bucket[index];
        while(head!=null){
            if(head.key.equals(keyValue)){
                return head.value;
            }
            head= head.next;
        }
        return null;
   }

   public String deleteKey(Integer keyValue){
       if(keyValue==null){
           new IllegalArgumentException("key is null");
       }
       int index = getBucketIndex(keyValue);
       HashNode head = bucket[index];
       HashNode previous = null;
       while(head!=null){
           if(head.key.equals(keyValue)){
               break;
           }
           previous= head;
           head= head.next;
       }
       if(head==null){
           return null;
       }
       size--;
       if(previous!=null){
           previous.next= head.next;
       }else{
           bucket[index] =head.next;
       }
        return head.value;
   }

    public int getBucketIndex(Integer x){
        return x % noOfBuckets;
    }

    public static void main(String[] args){
        HasTableDemo table = new HasTableDemo(10);

        table.put(105,"Harsh");
        table.put(21,"Ram");
        table.put(21,"Krishan");
        table.put(31,"Sita");
        System.out.println("Table size is:"+table.size());
        System.out.println(table.getValue(105));
        System.out.println(table.getValue(31));
        System.out.println(table.getValue(989));
        System.out.println(table.deleteKey(21));
        System.out.println(table.deleteKey(31));
        System.out.println("Table size is:"+table.size());


    }
}
