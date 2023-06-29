package seminar2.DZ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class zadanie {
  /*
   *Получить исходную json строку из файла, используя FileReader или Scanner
Дана json строка вида:
String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.
   */
  static Logger logger;
  public static void main(String[] args) {
    String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    json = parseString(json);
    String fileString = "seminar2/DZ/homework_sem2.txt";
    createLogger();

    writeFile(json, fileString);

    closeLogger();
  }
  static String parseString(String text) {
  String[] arrStrings = text.split(",");
  String surname = arrStrings[0].replaceAll("\"", "").substring(10);
  String grade = arrStrings[1].replaceAll("\"", "").substring(7);
  String subject = arrStrings[2].replaceAll("\"", "").substring(8,18);
  String surname2 = arrStrings[3].replaceAll("\"", "").substring(9);
  String grade2 = arrStrings[4].replaceAll("\"", "").substring(7);
  String subject2 = arrStrings[5].replaceAll("\"", "").substring(8,19);
  String surname3 = arrStrings[6].replaceAll("\"", "").substring(9);
  String grade3 = arrStrings[7].replaceAll("\"", "").substring(7);
  String subject3 = arrStrings[8].replaceAll("\"", "").substring(8,14);
  StringBuilder sb = new StringBuilder();
  sb.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject).append(".").append("\n").append("Студент ").append(surname2).append(" получил ").append(grade2).append(" по предмету ").append(subject2).append(".").append("\n").append("Студент ").append(surname3).append(" получил ").append(grade3).append(" по предмету ").append(subject3).append(".");
  String result = sb.toString();
  return result;
  }
  static void createLogger() {
    logger = Logger.getAnonymousLogger();
    FileHandler fileHandler = null;
    try {
      fileHandler = new FileHandler("seminar2/DZ/log.txt", true);
      logger.addHandler(fileHandler);
    } catch (IOException e) {
      e.printStackTrace();
    }

    SimpleFormatter formatter = new SimpleFormatter();
    if (fileHandler != null) {
      fileHandler.setFormatter(formatter);
    }
  }
  static void writeFile(String text, String file){
    try (FileWriter fw = new FileWriter(file, false)) {
      fw.write(text);
      logger.info("Запись была выполнена");
    } catch(Exception e) {
      e.printStackTrace();
      logger.info("Не удалось сделать запись");
    }
  }
  static void closeLogger() {
    for (Handler handler : logger.getHandlers()) {
      handler.close();
    }
  }
}
