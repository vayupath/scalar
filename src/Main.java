import com.library.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        User user = new User();
        System.out.println(user.id);

        User user1 = new User("siddharth","banegulur");
        System.out.println(user1.name);
        System.out.println(user1.contactInfo);
    }
}