package ru.otus.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            elements.add(new Element(i));
        }
        Collections.shuffle(elements);

        //elements.forEach(element -> System.out.print(element.getId() + ", "));

        long bubbleSortStartTime = System.nanoTime();
        bubbleSortArrayList(elements);
        long bubbleSortEndTime = System.nanoTime();

        Collections.shuffle(elements);

        long collectionsSortStartTime = System.nanoTime();
        bubbleSortArrayList(elements);
        long collectionsSortEndTime = System.nanoTime();

        //elements.forEach(element -> System.out.print(element.getId() + ", "));

        System.out.println();

        System.out.println("Длительность пузырьковой сортировки: " + (bubbleSortEndTime - bubbleSortStartTime));
        System.out.println("Длительность Collections.sort(): " + (collectionsSortEndTime - collectionsSortStartTime));
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
