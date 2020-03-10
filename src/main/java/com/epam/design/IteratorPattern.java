package com.epam.design;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorPattern {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Operating Systems");
            list.add("Database management sytsem");
            list.add("JAVA");
            list.add("C++");
            list.add("Python");
            list.add("Dot net");
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
