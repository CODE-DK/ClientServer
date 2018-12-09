package DelPack;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {

        Set<String> list = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buffer = reader.readLine();

        while (!buffer.equals("0")){
            list.add(buffer);
            buffer = reader.readLine();
        }

        reader.close();

        FileWriter writer = new FileWriter("C:\\Users\\Google\\Desktop\\1.txt");

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s + " ");
        }


        writer.write(sb.toString());
        writer.flush();
        writer.close();
    }
}
