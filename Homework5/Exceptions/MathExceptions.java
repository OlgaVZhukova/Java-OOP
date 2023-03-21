package Homework5.Exceptions;

public class MathExceptions extends Exception {
    /**
     * Конструктор исключения
     * @param msg - текстовое сообщение для пользователя
     */
    public MathExceptions(String msg) {
        super(msg);
    }
}
