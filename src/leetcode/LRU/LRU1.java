package leetcode.LRU;

import java.util.LinkedHashMap;

public class LRU1<K,V> {
    /**
     * 最近最少使用
     * 1.用一个数组来存储数据，给每个数据项标记一个访问的时间戳，
     * 每次插入新数据项的时候，先把数组中存在的数据项的时间戳自增，
     * 并将新数据项的时间戳置为0并插入到数组中。
     * 每次访问数组中的数据项的时候，将被访问的数据项的时间戳置为0.
     * 当数组满时，将时间戳最大的数据项淘汰。
     * O(n)
     *
     * 2.利用链表来实现，每次新插入数据的时候将新数据插入到链表的头部，
     * 每次缓存命中(即数据被访问)，则将数据移到移到链表头部，
     * 那么当链表满的时候，就将链表尾部的数据丢弃
     * O(n)
     *
     * 3.利用链表和hashmap。当需要插入新的数据项的时候，
     * 如果新数据项在链表中存在(命中)，则将该节点移到链表的头部，
     * 如果不存在，则新建一个节点，放到链表头部，
     * 若缓存满了，则把链表最后一个节点删除即可。
     * 在访问数据的时候，如果数据项在链表中存在，
     * 则把该节点移到链表头部，否则返回-1.
     * 这样一来，链表尾部的节点就是最近最少使用的数据项
     */
    private static final float hashLoadFactory = 0.75f;
    private LinkedHashMap<K,V>map;
    private int cacheSize;

    public LRU1(int cacheSize){

    }

}
