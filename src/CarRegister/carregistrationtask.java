package CarRegister;

import com.example.Task;

import java.util.*;

public class carregistrationtask implements Task {
    public int[] runTask() {
        Scanner sc = new Scanner(System.in);
        String comand;
        LinkedList();
        Person();
        return new int[0];
    }

    public static void LinkedList() {
        LinkedList<String> persons = new LinkedList<String>();
        for (int i = 0; i < persons.size(); i++) {
            persons.addLast(" ");
        }
        System.out.println(persons);

    }

    public static void Person() {
        LinkedList<String> persons = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        System.out.println("Please enter the command");
        persons.add(0, "Mike, A102BC, Nissan ");
        persons.add(1, "Alex, M283HE, BMW  ");
        persons.add(2, "Jack, O987AA, LADA ");
        persons.add(3, "Kate, T654EE, Jeep  ");
//      persons.remove(1);


        for (int i = 0; i < persons.size(); i++){
            if (cmd == sc.nextLine()){
                persons.removeLast();
            }
        }
        System.out.print(persons);


    }

    public static void Delete(){

    }

}


























