package CarRegister;

import com.example.Task;

import java.util.*;

public class carregistrationtask implements Task {
    public int[] runTask() {
        Person();
        return new int[0];
    }


    public static void Person() {
//        LinkedList<String> persons = new LinkedList<String>();
//        Scanner sc = new Scanner(System.in);
//        String delete = sc.nextLine();
//        String add = sc.nextLine();
//        System.out.println("Please enter the command");
//        persons.add(0, "Mike, A102BC, Nissan ");
//        persons.add(1, "Alex, M283HE, BMW  ");
//        persons.add(2, "Jack, O987AA, LADA ");
//        persons.add(3, "Kate, T654EE, Jeep  ");
//        LinkedList<String> persons1 = new LinkedList<String>(persons.subList(0, 1));
////      persons1.remove(0);
//        System.out.println(persons1);
//        LinkedList<String> persons2 = new LinkedList<String>(persons.subList(1, 2));
//        System.out.println(persons2);
//        LinkedList<String> persons3 = new LinkedList<String>(persons.subList(2, 3));
//        System.out.println(persons3);
//        LinkedList<String> persons4 = new LinkedList<String>(persons.subList(3, 4));
//        System.out.println(persons4);
//
//        if (delete == sc.nextLine()){
//            persons1.remove(0);
//        }
//
//       if (add == sc.nextLine()){
//            persons.add(4, "Bob, E832MM, Gelly");
//            LinkedList<String> persons5 = new LinkedList<String>(persons.subList(4, 5));
//            System.out.println(persons5);
//        }


        LinkedList<String> list=new LinkedList<String>();
        Scanner input=new Scanner(System.in);
        System.out.print("how many elemenst do you want to add: ");
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Add Element: ");
            String element=input.next();
            list.add(element);
        }
        System.out.println();
        System.out.println("List elements are: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



    }


}


























