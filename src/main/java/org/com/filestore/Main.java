package org.com.filestore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //List<String> name = new ArrayList<>();
        //StroeName namestore = new InMenoryNameStrore();//contract
        //StroeName namestore = new FileBaseNameStroe();
        //StroeName cache = new InMenoryNameStrore();
        StroeName fileStore;
        fileStore = new FileBaseNameStroe();


        StroeName nameStore = new CachedNameStore(fileStore);
//
//
//
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String name_line = scanner.nextLine();
            if("show".equals(name_line)){
                //name.forEach(n-> System.out.println(n + " "));//Special
                nameStore.getName().forEach(n -> System.out.println(n + " "));
            }
            //name.add(name_line);
            nameStore.store(name_line);
        }

//        List<Integer> testList = new ArrayList<>();
//        testList.add(4);
//        testList.add(4);
//        testList.add(5);
//
//
//        testList.forEach(i -> System.out.println(i));

    }
}
