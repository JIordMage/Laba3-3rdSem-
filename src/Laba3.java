import java.io.*;
import java.util.*;

public class Laba3 { //Создать стек из элементов каталога.

public static void var4(){
        Stack<File> directoryStack = new Stack<>();

        directoryStack.push(new File("/path/to/directory1"));
        directoryStack.push(new File("/path/to/directory2"));
        directoryStack.push(new File("/path/to/directory3"));

        while (!directoryStack.isEmpty()) {
        File directory = directoryStack.pop();
        System.out.println(directory.getAbsolutePath());
        }
        }


    public static void main(String[] args) {

        var4();

    }
}