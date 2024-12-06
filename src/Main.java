import com.library.Member;
import com.library.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        User user1 = new Member("siddharth","banegulur",0);
        System.out.println(user1.getName());
        System.out.println(user1.getContactInfo());
        user1.displayDashboard();
    }
}