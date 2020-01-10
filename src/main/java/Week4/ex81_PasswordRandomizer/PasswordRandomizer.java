package Week4.ex81_PasswordRandomizer;

import java.util.Random;

public class PasswordRandomizer {
    int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        for (int i = 0; i < length; i++) {
            password += (char)(random.nextInt(20) + 'a');
        }
        return password;
    }
}
