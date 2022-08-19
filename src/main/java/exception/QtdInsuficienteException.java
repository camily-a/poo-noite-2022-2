package exception;

public class QtdInsuficienteException extends RuntimeException {

    public QtdInsuficienteException() {
        super("Quantidade de produto insuficiente para executar a venda");
    }
}
