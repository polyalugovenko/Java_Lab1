package ru.spbstu.telematics.java;
import java.io.*;

public class App
{
    public static void main( String[] args )
    {
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}