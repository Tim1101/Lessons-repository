package CarRegister;

import com.example.Task;
import  java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;


import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.*;



//public class carregistrationtask implements Task {
//    public int[] runTask() {
//        ();
//        return new int[0];
//    }


//    public static void Person() {
//        LinkedList<String> persons = new LinkedList<String>();
//        Scanner sc = new Scanner(System.in);
////        String delete = sc.nextLine();
////        String add = sc.nextLine();
//        System.out.println("Please enter the command");
//        persons.add(0, "Mike, A102BC, Nissan ");
//        persons.add(1, "Alex, M283HE, BMW  ");
//        persons.add(2, "Jack, O987AA, LADA ");
//        persons.add(3, "Kate, T654EE, Jeep  ");
//        persons.add(4, "Tom, H642TT, BMW");
//
//
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
//
//        LinkedList<String> lists1 = new LinkedList<String>();
//        Scanner remove = new Scanner(System.in);
//        System.out.println("What do you want to remove?");
//
//
//
//        LinkedList<String> lists = new LinkedList<String>();
//        Scanner move = new Scanner(System.in);
//        System.out.println("What do you want to do?");
//        String act = move.next();
//        for (int i = 0; i < lists.size(); i++){
//            String add = null;
//            String delete = null;
//            if (act == add) {
//                String element = move.next();
//                lists.add(element);
//            }
//            else {
//                String element = move.next();
//                lists.remove(element);
//            }
//        }
//        System.out.println();
//        System.out.println("List elements are");
//        for (int i = 0; i < lists.size(); i++){
//            System.out.println(lists.get(i));
//        }
//
////
//        LinkedList<String> list = new LinkedList<String>();
//        Scanner input = new Scanner(System.in);
//        Scanner ppl = new Scanner(System.in);
//        System.out.print("how many elemenst do you want to add: ");
//        int num = input.nextInt();
//        for(int i = 0;i < num; i++){
//            System.out.print("Add Element: ");
//            String element=input.next();
//            list.add(element);
//        }
//        System.out.println();
//        System.out.println("List elements are: ");
////        for(int i = 0;i < list.size(); i++){
//            System.out.println(list.get(i));
//        }


public class carregistrationtask implements Task {
    public int[] runTask() {
        return new int[0];

        class carregistrationtask1 extends JFrame {
            private int i = 0;

            public carregistrationtask1() {
                super("Text Window");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BorderLayout(5, 5));
                mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

                final DefaultListModel listModel = new DefaultListModel();

                for (int i = 0; i < 30; i++) {
                    listModel.addElement("add new element");

                }

                final JList list = new JList(listModel);
                list.setSelectedIndex(0);
                list.setFocusable(false);
                mainPanel.add(new JScrollPane(list), BorderLayout.CENTER);

                JPanel buttonsPanel = new JPanel();
                buttonsPanel.setLayout(new GridLayout(1,2,5,0));
                mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


                JButton historyButton = new JButton("history of all list");
                historyButton.setFocusable(false);
                historyButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                    }
                });

                JButton addButton = new JButton("Add");
                addButton.setFocusable(false);
                addButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String element = "element of list" + i++;
                        listModel.addElement(element);
                        int index = listModel.size() - 1;
                        list.setSelectedIndex(index);
                        list.ensureIndexIsVisible(index);
                    }
                });
                buttonsPanel.add(addButton);

                JButton saveButton = new JButton("Save");
                saveButton.setFocusable(false);
                saveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                buttonsPanel.add(saveButton);



                final JButton removeButton = new JButton("Delete");
                removeButton.setFocusable(false);
                removeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        listModel.remove(list.getSelectedIndex());
                    }
                });
                buttonsPanel.add(removeButton);



                list.addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (list.getSelectedIndex() >= 0){
                            removeButton.setEnabled(true);
                        }
                        else {
                            removeButton.setEnabled(false);
                        }
                    }
                });

                getContentPane().add(mainPanel);

                setPreferredSize(new Dimension(260, 220));
                pack();
                setLocationRelativeTo(null);
                setVisible(true);


            }

            public void main(String[] args) {
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame.setDefaultLookAndFeelDecorated(true);
                        new carregistrationtask1();
                    }
                });
            }


        }
    }
}
//}


























