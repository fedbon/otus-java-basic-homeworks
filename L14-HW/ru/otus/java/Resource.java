package ru.otus.java;

import java.io.Closeable;

public class Resource implements Closeable {
    @Override
    public void close() {
        System.out.println("Ресурс был закрыт");
    }
}
