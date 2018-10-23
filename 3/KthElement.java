import java.util.*;

class KthElement{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = fillList(list);
        int index = (int)(Math.random()*list.size());
        int lastElement = findKth(list, index);
        System.out.printf("The Element at index %d is: %d", index, lastElement);
    }

    public static int findKth(ArrayList<Integer> list, int index){
        if (list.size()-1<index){
        return 00000;
        }
        else
        return list.get(index);
    }

    public static ArrayList<Integer> fillList(ArrayList<Integer> list){
        int listSize = (int)(Math.random()*100);
        for(int i = 0; i < listSize; i++){
            list.add((int)(Math.random()*200));
        }

        return list;
    }
}