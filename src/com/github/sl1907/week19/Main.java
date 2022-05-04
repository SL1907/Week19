package com.github.sl1907.week19;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int students = Integer.parseInt(JOptionPane.showInputDialog("How many students are in the class?"));
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < students; i++) {
            scores.add(Integer.parseInt(JOptionPane.showInputDialog("Enter score for student " + (i + 1))));
        }

        int highest = Collections.max(scores);
        long count = scores.stream()
                .filter(score -> score == highest)
                .count();

        String message = count > 1 ? "there are " + count + " students with that score" : "there is one student with that score";
        JOptionPane.showMessageDialog(null, "The highest score is " + highest + " and %s.".formatted(message));
    }
}
