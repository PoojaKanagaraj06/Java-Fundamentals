class LengthMismatchException extends Exception {

    @Override
    public String getMessage() {
        return "Password must contain minimum 7 letters!";
    }
}

class NoUpperCaseException extends Exception {

    @Override
    public String getMessage() {
        return "At least 1 uppercase letter needed!";
    }
}

class NoLowerCaseException extends Exception {

    @Override
    public String getMessage() {
        return "At least 1 lowercase letter needed!";
    }
}

class NoNumberException extends Exception {

    @Override
    public String getMessage() {
        return "At least 2 numbers needed!";
    }
}

class NoSymbolException extends Exception {

    @Override
    public String getMessage() {
        return "At least 1 symbol needed!";
    }
}

public class Passvalidation {

    public static void validate(String password)
            throws LengthMismatchException,
                   NoUpperCaseException,
                   NoLowerCaseException,
                   NoNumberException,
                   NoSymbolException {

        int upp = 0, low = 0, num = 0, sym = 0, letters = 0;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                upp++;
                letters++;
            }
            else if (Character.isLowerCase(c)) {
                low++;
                letters++;
            }
            else if (Character.isDigit(c)) {
                num++;
            }
            else {
                sym++;
            }
        }

        if (letters < 7)
            throw new LengthMismatchException();

        if (upp < 1)
            throw new NoUpperCaseException();

        if (low < 1)
            throw new NoLowerCaseException();

        if (num < 2)
            throw new NoNumberException();

        if (sym < 1)
            throw new NoSymbolException();
    }

    public static void main(String[] args) {

        String password = "Abcdef1@";

        try {
            validate(password);
            System.out.println("Password is Valid ✅");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
