package model;

import java.util.ArrayList;
import java.util.List;

public class SqlSecurity {

    private static final List<String> BLACKLIST = new ArrayList<>();
    private static final String COMMENT_OUT = ";--";

    private static boolean VALID_USER_INPUT = true;

    private static void generateForbiddenList() {
        BLACKLIST.add(COMMENT_OUT);
    }

    static boolean validateUserInput(String title) {
        generateForbiddenList();
        for (String blackChars : BLACKLIST) {
            boolean forbiddenInput = title.contains(blackChars);
            if (forbiddenInput) {
                VALID_USER_INPUT = !forbiddenInput;
            }
        }
        return VALID_USER_INPUT;
    }

}
