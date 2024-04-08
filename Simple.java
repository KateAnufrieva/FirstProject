import java.time.LocalTime;

public class Simple {
    public static void main(String[] args) {
        String firstName = "Екатерина";
        String lastName = "Ануфриева";
        LocalTime currentTime = LocalTime.now();

        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Текущее время: " + currentTime);
    }
}