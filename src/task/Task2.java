//Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.


package task;

import java.util.Arrays;

public class Task2 {

    public static void run(String json) {

//         json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//                 " {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
//                 "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";


        StringBuilder json2 = new StringBuilder();
        StringBuilder json3 = new StringBuilder();
        var json1 = new String[json.length()];
        json1 = json.split("\"},");

        StringBuilder json4;
        for (String line1 : json1) {
//                String line2 = Arrays.toString(line1.split(":"));
//                String line3 = Arrays.toString(line2.split("}"));
//                String line4 = Arrays.toString(line3.split("\\{"));
//                String line5 = Arrays.toString(line4.split("\""));
//                String line6 = Arrays.toString(line5.split("\\["));
//                String line7 = Arrays.toString(line6.split(" "));
//                String line8 = Arrays.toString(line7.split("]"));
            String line2 = String.valueOf(new StringBuilder(line1.replace(":", "")));
            String line3 = String.valueOf(new StringBuilder(line2.replace("}", "")));
            String line4 = String.valueOf(new StringBuilder(line3.replace("{", "")));
            String line5 = String.valueOf(new StringBuilder(line4.replace("]", "")));
            String line6 = String.valueOf(new StringBuilder(line5.replace("\"", " ")));
            String line7 = String.valueOf(new StringBuilder(line6.replace("[", "")));
            json3 = new StringBuilder(String.valueOf(new StringBuilder(line7.replace(",", ""))));
            json3 = new StringBuilder(json3.replace(0, 10, "  Студент "));
            json3 = new StringBuilder(json3.replace(17, 26, " получил "));
            json3 = new StringBuilder(json3.replace(29, 38, " по предмету "));

//            String.format("%-3s %7s %10s", json3);
            System.out.println(json3);

        }

    }

}





