import task.Task1;
import task.Task2;

import static task.Task1.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
//        task1.run();
//        System.out.println();

        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                " {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        Task1.write("Task1.txt");
        System.out.println();
        Task2.run(json);
    }
}