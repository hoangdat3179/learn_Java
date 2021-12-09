package vn.techmaster;

import java.util.regex.Pattern;

public class Validate {
        public static boolean setEMAIL_PATTERN(String email) {
            String EMAIL_PATTERN =
                    "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            return email.matches(String.valueOf(pattern));
        }
}
