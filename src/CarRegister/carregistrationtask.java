package CarRegister;

import com.example.Task;

import java.util.*;

public class carregistrationtask implements Task {
    public int[] runTask() {
        Person();
        return new int[0];
    }


    public static void Person() {
        LinkedList<String> persons = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
//        String delete = sc.nextLine();
//        String add = sc.nextLine();
        System.out.println("Please enter the command");
        persons.add(0, "Mike, A102BC, Nissan ");
        persons.add(1, "Alex, M283HE, BMW  ");
        persons.add(2, "Jack, O987AA, LADA ");
        persons.add(3, "Kate, T654EE, Jeep  ");
        persons.add(4, "Tom, H642TT, BMW");





        for (int i = 0; i < persons.size(); i++){
            String element = sc.next();
            persons.add(element);
        }
        System.out.println(persons);
        for ( int i = 0; i < persons.size(); i++ ){

        }

//        LinkedList<String> persons1 = new LinkedList<String>(persons.subList(0, 1));
////      persons1.remove(0);
//        System.out.println(persons1);
//        LinkedList<String> persons2 = new LinkedList<String>(persons.subList(1, 2));
//        System.out.println(persons2);
//        LinkedList<String> persons3 = new LinkedList<String>(persons.subList(2, 3));
//        System.out.println(persons3);
//        LinkedList<String> persons4 = new LinkedList<String>(persons.subList(3, 4));
//        System.out.println(persons4);


        LinkedList<String> lists = new LinkedList<String>();
        Scanner move = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String act = move.next();
        for (int i = 0; i < lists.size(); i++){
            String add = null;
            String delete = null;
            if (act == add) {
                String element = move.next();
                lists.add(element);
            }
            else {
                String element = move.next();
                lists.remove(element);
            }
        }
        System.out.println();
        System.out.println("List elements are");
        for (int i = 0; i < lists.size(); i++){
            System.out.println(lists.get(i));
        }

//
        LinkedList<String> list = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        Scanner ppl = new Scanner(System.in);
        System.out.print("how many elemenst do you want to add: ");
        int num = input.nextInt();
        for(int i = 0;i < num; i++){
            System.out.print("Add Element: ");
            String element=input.next();
            list.add(element);
        }
        System.out.println();
        System.out.println("List elements are: ");
        for(int i = 0;i < list.size(); i++){
            System.out.println(list.get(i));
        }



    }


}


























