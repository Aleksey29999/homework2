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

    public static int[] array(String path) throws IOException {
        FileWriter writer= new FileWriter("task11.txt");
        int[] array = new int[]{98, 56, 32, 14, 8, 6, 5, 4, 1};
        System.out.println(Arrays.toString(array));

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
                writer.write(Arrays.toString(array) + "\n");
            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}


