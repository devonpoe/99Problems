import java.util.*;

class SecondLastElement{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = fillList(list);
        int lastElement = findLast(list);
        System.out.println("The Second to Last Element in the List is: " + lastElement);
    }

    public static int findLast(ArrayList<Integer> list){
        if (list.size()>1){
        return list.get(list.size()-2);
        }
        else
        return list.get(0);
    }

    public static ArrayList<Integer> fillList(ArrayList<Integer> list){
        int listSize = (int)(Math.random()*100);
        for(int i = 0; i < listSize; i++){
            list.add((int)(Math.random()*200));
        }

        return list;
    }
}