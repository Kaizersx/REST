package Algorithms.AlgoTest.Soccer;

import java.util.*;

public class SqaudManager {

    /** Static Players array*/

   static Players[]a={
            new Players("Vag","Hakobjan",32,177),
            new Players("Hayk","Hakobjan",22,180),
            new Players("Karlen","Mesropyan",12,176),
            new Players("Zaven","Mkrtchyan",21,176),
            new Players("Hayk","Mkrtchyan",21,176),
            new Players("Artash","Tevosyan",45,181),
            new Players("Gurgen","Matevosyan",25,170)
    };


    public static void main(String[] args) {

//        List<Players> mySqaude = createSquad(11);
//
//        Players[] a = mySqaude.toArray(new Players[mySqaude.size()]);


//        int in, out;
//        for (out = 1; out < 5; out++) // out - разделительный маркер
//        {
//            Players temp = a[out]; // Скопировать помеченный элемент
//            in = out; // Начать перемещения с out
//            while (in > 0 && // Пока не найден меньший элемент
//                    a[in - 1].getName().compareTo(temp.getName()) > 0) {
//                a[in] = a[in - 1]; // Сдвинуть элемент вправо
//                --in; // Перейти на одну позицию влево
//            }
//            a[in] = temp; // Вставить помеченный элемент
//
//        }

        List<Players>list= Arrays.asList(a);
//                Arrays.stream(a).forEach(v-> System.out.println(v.getName()+","+v.getFamily_name()));


//       Comparator<Players>sortByFirstName=(Players o1, Players o2)->o1.getName().compareTo(o2.getName());
//       Comparator<Players>sortByFamilyName= new Comparator<Players>() {
//           @Override
//           public int compare(Players o1, Players o2) {
//               return o1.getFamily_name().compareTo(o2.getFamily_name());
//           }
//       };

       Collections.sort(list);


        list.forEach(v-> System.out.println(v.getName()+","+v.getFamily_name()));
    }

   /** Random method for sqaud building */
    public static List<Players> createSquad(int howMany){

        List<Players> newSquad = new ArrayList<>();
        Random randomAge = new Random();
        Random randomHeight = new Random();
        Random playersCount = new Random();
        String randomName = null;
        String randomFamilyName = null;
        for (int i = 0; i < howMany; i++) {

            switch (playersCount.nextInt(10 + 1) + 0) {

                case 0:
                    randomName = "Arman";
                    break;
                case 1:
                    randomName = "Hayk";
                    break;
                case 2:
                    randomName = "Vahagn";
                    break;
                case 3:
                    randomName = "Armen";
                    break;
                case 4:
                    randomName = "Vazgen";
                    break;
                case 5:
                    randomName = "Vigen";
                    break;
                case 6:
                    randomName = "Samvel";
                    break;
                case 7:
                    randomName = "Grigor";
                    break;
                case 8:
                    randomName = "Azat";
                    break;
                case 9:
                    randomName = "Suren";
                    break;
                case 10:
                    randomName = "Edgar";
                    break;
                default:
                    randomName = "NoName";
            }

            switch (playersCount.nextInt(10 + 1) + 0) {

                case 0:
                    randomFamilyName = "Ambarcumyan";
                    break;
                case 1:
                    randomFamilyName = "Egizaryan";
                    break;
                case 2:
                    randomFamilyName = "Mkrtchyan";
                    break;
                case 3:
                    randomFamilyName = "Doelyan";
                    break;
                case 4:
                    randomFamilyName = "Mushexyan";
                    break;
                case 5:
                    randomFamilyName = "Muradyan";
                    break;
                case 6:
                    randomFamilyName = "Hakobjan";
                    break;
                case 7:
                    randomFamilyName = "Nashikyan";
                    break;
                case 8:
                    randomFamilyName = "Grigoryan";
                    break;
                case 9:
                    randomFamilyName = "Nersisyan";
                    break;
                case 10:
                    randomFamilyName = "Petrosyan";
                    break;
                default:
                    randomFamilyName = "NoName";
            }

            newSquad.add(new Players(randomName, randomFamilyName, randomAge.nextInt(12 + 1) + 18, randomHeight.nextInt(35 + 1) + 165));


        }
        return newSquad;
    }


}
