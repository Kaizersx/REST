package Trash;

import java.util.*;

public class ColTrash {

    public static void main(String[] args) {

        ArrayList<String>mylistString= new ArrayList<>();

        mylistString.add("Vano");
        mylistString.add("Petya");
        mylistString.add("Petya");
        mylistString.add("Vanya");

        ArrayList<Unit>mylist=new ArrayList<>();

        mylist.add(new Unit("Edik",40));
        mylist.add(new Unit("Bill",35));
        mylist.add(new Unit("Grace",25));
        mylist.add(new Unit("Jason",37));
        mylist.add(new Unit("Edik",40));




        /* 1) Найти дубликаты  в списке
         * 2) Вывести название дублируемого объекта
         * 3) Указать колиечство раз, когда встречается объект в списке.
         * */
        getDuplicate(mylist).forEach((k,v)->{if(v>1) System.out.println(k+": "+v);});


    }

    static public Map<Unit,Integer> getDuplicate(List<Unit> list) {

        Map<Unit,Integer> dupEl= new HashMap<>();

        for (Unit unit : list) {
            if (dupEl.get(unit) == null) {
                dupEl.put(unit, 1);
            } else {
                dupEl.put(unit, dupEl.get(unit) + 1);
            }
        }

//        Map<Unit,Integer>dup=new HashMap<>();

//        dupEl.forEach((k,v)->{if(v>1)dup.put(k,v);});

        return dupEl;
    }


}
