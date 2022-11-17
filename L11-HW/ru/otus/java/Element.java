package ru.otus.java;

import java.util.List;

public class Element {
    private final int id;

    public Element(int id) {
        this.id = id;
    }

    public int compareTo(Element element) {
        int res = 0;
        if (this.id < element.getId()) {
            res = -1;
        }
        if (this.id > element.getId()) {
            res = 1;
        }
        return res;
    }

    int getId() {
        return id;
    }
    public static void bubbleSortArrayList(List<Element> list) {
        Element temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}
