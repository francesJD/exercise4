import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public void checkPhoneNumber(String s) {
        String pattern = "\\d\\d\\d([\\w-])?\\d\\d\\d\\d\\d\\d\\d";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(s);

        if (matcher.find()) {
            System.out.println("Found phone number: " + matcher.group(0));
        } else {
            System.out.println("The phone number " + s + " is not valid");
        }
    }

    public void checkCurrencySymbol(String s) {
        String pattern = "\\p{Sc}";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(s);

        if (matcher.find()) {
            System.out.println("Found currency symbol: " + matcher.group(0));
        } else {
            System.out.println("The currency symbol " + s + " is not valid");
        }
    }

    public void checkEmail(String s) {
        String pattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(s);

        if (matcher.find()) {
            System.out.println("Found email: " + matcher.group(0));
        } else {
            System.out.println("The email " + s + " is not valid");
        }
    }

    public void checkDate(String s) {
        String pattern = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(s);

        if (matcher.find()) {
            System.out.println("Found date: " + matcher.group(0));
        } else {
            System.out.println("The date " + s + " is not valid");
        }
    }

    public void checkVisa(String s) {
        String pattern = "^4[0-9]{12}(?:[0-9]{3})?$";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(s);

        if (matcher.find()) {
            System.out.println("Found Visa: " + matcher.group(0));
        } else {
            System.out.println("The Visa " + s + " is not valid");
        }
    }
}
