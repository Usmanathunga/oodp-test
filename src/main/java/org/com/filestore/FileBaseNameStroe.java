package org.com.filestore;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileBaseNameStroe implements StroeName{
    private String fileName = "G:\\Coruse\\untitled1\\oodp\\text.txt";

    @Override
    public void store(String name) {
        try{
            FileWriter writer = new FileWriter(fileName ,true);
            writer.append(name +"\n");
            writer.close();

        }catch (IOException e){
            throw new RuntimeException(fileName + "couldn't read" ,e);
        }
    }

    @Override
    public List<String> getName() {
        try{
           return Files.readAllLines(Path.of(fileName));
        }catch (IOException e){
           throw new RuntimeException("File while reading the file ,name" +fileName);
        }
      //return null;
    }

}
