package org.example.lectures.l2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Логирование
 * Логи содержат системную информацию работы программного или аппаратного комплекса.
 * В них записываются действия разного приоритета от пользователя, или программного продукта.
 * Процесс ведения логов называется - Логированием(журналированием)
 *
 * Использование
 * Logger logger = Logger.getLogger()
 * Уровни важности
 * INFO, DEBUG, ERROR, WARNING и др.
 * Вывод
 * ConsoleHendler info = new ConsoleHandler();
 * log.addHandler(info);
 * Формат вывода: структурированный, абы как*
 * XMLFormatted, SimpleFormatter
 *
 */
public class Pro3 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Pro3.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}


