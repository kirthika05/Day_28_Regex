package com.kirthika;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String regexString = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "gmail\\.com$";
        Pattern regexPattern = Pattern.compile(regexString);

        ArrayList<String> namelist = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = in.next();
            String email = in.next();
            Matcher matcher = regexPattern.matcher(email);

            if (matcher.find()) namelist.add(name);
        }

        Collections.sort(namelist);
        namelist.forEach(System.out::println);
    }
}
