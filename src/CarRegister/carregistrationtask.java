package CarRegister;

import com.example.Task;
import com.sun.source.util.Trees;

import java.util.*;

public class carregistrationtask implements Task {
    public int[] runTask() {
        Person();
        Split();
//      Car();
//      NumberOfCar();


        return new int[0];
    }
    public static void Split(){
//        String Str = new String("Разделяем эту строку на слова");
//
//        for (String retval : Str.split(" ")) {
//            System.out.println(retval);
//        }
//        String pattern = "\\s+ |,\\s*";
//        String inputString = " dsds, dsds,  ds, ds  dsd, sdwd";
//        String[] splitResult = inputString.split(pattern);
//        System.out.println(Arrays.toString(splitResult));
    }



//
//    public class Car {
//        private String name;
//        public Car(String value) {name = value;}
//        String getName() {
//            return name;
//        }
//    }



         public static void Person() {
            LinkedList<String> persons = new LinkedList<String>();
            persons.add(0, "Mike, A102BC, Nissan ");
            persons.add(1, "Alex, M283HE, BMW  ");
            persons.add(2, "Jack, O987AA, LADA ");
            persons.add(3, "Kate, T654EE, Jeep  ");
//        persons.remove(1);
            System.out.println(persons);

        }


    public static void Delete() {


    }








}

