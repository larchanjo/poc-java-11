package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileExample {

  public static void main(String[] args) throws IOException {
    File file = File.createTempFile("testing", ".txt");
    Files.writeString(file.toPath(), "I am wrint as string");
    System.out.println(Files.readString(file.toPath()));
  }

}
