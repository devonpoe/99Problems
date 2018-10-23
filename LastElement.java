import java.util.*;

class LastElement{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = fillList(list);
        int lastElement = findLast(list);
        System.out.println("The Last Element in the List is: " + lastElement);
    }

    public static int findLast(ArrayList<Integer> list){
        return list.get(list.size()-1);
    }

    public static ArrayList<Integer> fillList(ArrayList<Integer> list){
        int listSize = (int)(Math.random()*100);
        for(int i = 0; i < listSize; i++){
            list.add((int)(Math.random()*200));
        }

        return list;
    }
}