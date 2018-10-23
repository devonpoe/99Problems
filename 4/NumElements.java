import java.util.*;

class NumElements{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = fillList(list);
        int size = list.size();
        //int index = (int)(Math.random()*list.size());
        
        System.out.printf("The Array size is: %d", size);
    }

    

    public static ArrayList<Integer> fillList(ArrayList<Integer> list){
        int listSize = (int)(Math.random()*100);
        for(int i = 0; i < listSize; i++){
            list.add((int)(Math.random()*200));
        }

        return list;
    }
}