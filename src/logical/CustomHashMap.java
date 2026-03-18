package logical;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashMap {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; //n-nodes
        private int N; //N-buckets
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[N];

            for(int i = 0; i<N; i++){
                buckets[i]=new LinkedList<>();
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInll(key,bi); //data index

            if(di==-1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node node = buckets[bi].get(di);
                node.value=value;
            }

            double lambda = (double)n/N;
            if(lambda > 0.75){
                rehashing();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInll(key,bi);

            if(di==-1){
                return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInll(key,bi);

            if(di==-1){
                return false;
            }else{
                return true;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public List<K> keySet(){
            List<K> list = new ArrayList<>();

            for(int i = 0; i< buckets.length;i++){
                LinkedList<Node> bucket = buckets[i];
                for(int j=0;j<bucket.size();j++){
                    Node node = bucket.get(j);
                    list.add(node.key);
                }
            }
            return list;
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInll(key,bi);

            if(di==-1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        private void rehashing() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];
            for(int i = 0 ; i<N;i++)
                buckets[i]=new LinkedList<>();
            n = 0;
            for(int i = 0 ; i< oldBuckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j = 0; j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        private int searchInll(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for(int i = 0 ; i < ll.size(); i++){
                if(ll.get(i).key.equals(key))
                    return i;
            }
            return -1;
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode())%N;
        }
    }
}
