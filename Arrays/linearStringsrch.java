import java.util.*;

public class linearStringsrch {
    public static int linSrch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) { // Use .equals for String comparison
                return i;
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        String menu[] = {"dosa", "momo", "chowmein", "pasta"};
        String key = "momo"; // Key should be a String matching the menu array type

        int index = linSrch(menu, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
