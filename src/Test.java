public class Test {
    public static void main(String[] args) {
        RegularExpression regex = new RegularExpression();

        System.out.println("========================== Check Phone Number ==========================");
        regex.checkPhoneNumber("1234567890");
        regex.checkPhoneNumber("123-4567890");
        regex.checkPhoneNumber("123456789");
        System.out.println();

        System.out.println("========================== Check Currency ==========================");
        regex.checkCurrencySymbol("$");
        regex.checkCurrencySymbol("dollar");
        System.out.println();

        System.out.println("========================== Check Email ==========================");
        regex.checkEmail("123@northeastern.edu");
        regex.checkEmail("123@");
        System.out.println();

        System.out.println("========================== Check Date ==========================");
        regex.checkDate("12/12/2021");
        regex.checkDate("13/34/1995");
        System.out.println();

        System.out.println("========================== Check Visa ==========================");
        regex.checkVisa("4111111111111111");
        regex.checkVisa("1234");
        System.out.println();
    }
}
