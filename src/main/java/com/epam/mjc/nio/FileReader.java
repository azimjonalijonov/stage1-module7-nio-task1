package com.epam.mjc.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            int c;
            while ((c = inputStream.read()) != -1) {
                char ch = (char) c;
                stringBuilder.append(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return profile;
    }
}
