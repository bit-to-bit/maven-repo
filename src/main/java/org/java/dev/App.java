package org.java.dev;

import org.java.dev.utils.NameReader;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println(NameReader.get());
    }
}
