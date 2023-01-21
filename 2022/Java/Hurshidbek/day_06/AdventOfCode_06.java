package day_06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Kodirov Hurshidbek
 * Date : 21.01.2023
 * Time : 12:00
 */

public class AdventOfCode_06 {

    String fullMessage;

    public AdventOfCode_06(String filePath) throws IOException {
        fullMessage = new BufferedReader(new FileReader(filePath)).readLine();
    }

    public int aoc6_1(){

        for (int i = 0; i < fullMessage.length() - 4; i++) {
            if (check(fullMessage.substring(i, i+4))){
                return i+4;
            }
        }
        return fullMessage.length();
    }

    public int aoc6_2(){

        for (int i = 0; i < fullMessage.length() - 14; i++) {
            if (check(fullMessage.substring(i, i+14))){
                return i+14;
            }
        }


        return fullMessage.length();
    }

    private boolean check(String s){

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    /* Big O analyse
     Time Complexity:  O(n);
     Space Complexity: O(1) */

}
