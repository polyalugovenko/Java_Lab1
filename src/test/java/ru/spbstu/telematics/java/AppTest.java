package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;

public class AppTest extends TestCase {
    
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testMain() {

        PrintStream originalOut = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        String[] args = {};
        App.main(args);

        System.setOut(originalOut);

        String expectedOutput = "Sun of the sleepless! Melancholy star!";

        String actualOutput = outputStream.toString().trim(); // Удаляем лишние пробелы и переносы

        assertEquals(expectedOutput, actualOutput);
    }
}