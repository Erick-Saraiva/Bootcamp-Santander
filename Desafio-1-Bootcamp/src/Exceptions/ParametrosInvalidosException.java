package Exceptions;

public class ParametrosInvalidosException extends Exception {
    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}
