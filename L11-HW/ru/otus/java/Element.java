package ru.otus.java;

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

    public int getId() {
        return id;
    }
}
