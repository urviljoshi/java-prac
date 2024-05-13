package com.example.jp.j12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChanges {
    public static void main(String[] args) throws IOException {
        Path p1= Files.createTempFile("f1",".txt");
        Path p2=Files.createTempFile("f2",".txt");
        Files.writeString(p1,"urvil joshi");
        Files.writeString(p2,"urvil joshi");
        System.out.println(p1);
        System.out.println(Files.mismatch(p1,p2));
    }
}
