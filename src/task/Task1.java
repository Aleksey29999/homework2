//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//        2.
package task;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger LOG = Log.log(Task1.class.getName());

    public static void write(String path) {

        try (FileWriter in = new FileWriter("task1.txt")) {
            int[] data = array(path);
            for (int datum : data) {
                in.append((char) datum);
            }
            LOG.log(Level.WARNING, "Recorded! :)");
//           throw new IOException("Error");
        } catch (IOException e) {
            LOG.log(Level.WARNING, e.getMessage());
            throw new RuntimeException(e);

        }
    }

    public static int[] array(String path) {

        int[] array = new int[]{5, 9, 8, 98, 55, 56, 321, 74, 1, 1, 3, 32, 5, 8, 56, 666, 78, 5};
        System.out.println(Arrays.toString(array));
        int temp = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}


