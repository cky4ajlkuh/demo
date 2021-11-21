package com.example.demo.design;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BasicWindow extends JFrame {
    private final static JButton search = new JButton("Найти");
    private final static JButton deleteList = new JButton("Удалить списоок");
    private final static JButton addList = new JButton("Добавить список");
    private final static JButton change = new JButton("Сменить пользователя");
    private final static JButton deleteWord = new JButton("Удалить слово");
    private final static JTextField searchWord = new JTextField();
    private final static JLabel greeting = new JLabel("Чтобы найти неправильный глагол, введите его!");
    private final static JLabel idOwner = new JLabel("id: " + 1);
    public final static String[] lists = {"Лист №1"};
    private final static JComboBox list = new JComboBox(lists);
    private final static DefaultTableModel tableModelList = new DefaultTableModel();
    private final static Object[] columnsHeader = new String[]{"infinitive", "Past Simple", "Past Participle", "Перевод"};
    private final static JPanel basicPanel = new JPanel();

    public BasicWindow() {
        tableModelList.setColumnIdentifiers(columnsHeader);
        JTable tableList = new JTable(tableModelList);
        JScrollPane pane = new JScrollPane(tableList);
        pane.setPreferredSize(new Dimension(750, 400));
        basicPanel.add(idOwner);
        basicPanel.add(change);
        basicPanel.add(greeting);
        basicPanel.add(searchWord);
        basicPanel.add(search);
        basicPanel.add(list);
        basicPanel.add(addList);
        basicPanel.add(deleteList);
        basicPanel.add(deleteWord);
        basicPanel.add(pane);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(idOwner)
                        .addComponent(change))
                .addComponent(greeting)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(searchWord)
                        .addComponent(search))
                .addGroup(layout.createParallelGroup()
                        .addComponent(list)
                        .addComponent(addList)
                        .addComponent(deleteList)
                        .addComponent(deleteWord))
                .addComponent(pane)
        );
        layout.setHorizontalGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                        .addComponent(idOwner)
                        .addComponent(change))
                .addComponent(greeting)
                .addGroup(layout.createParallelGroup()
                        .addComponent(searchWord)
                        .addComponent(search))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(list)
                        .addComponent(addList)
                        .addComponent(deleteList)
                        .addComponent(deleteWord))
                .addComponent(pane));
        setVisible(true);
        add(basicPanel);
        setResizable(true);
        setSize(new Dimension(800, 800));
    }


}

class SW {
    public static void main(String[] args) {
        new BasicWindow();
    }
}