package problema2;

public class NotificacaoObserver implements Observer {

    @Override
    public void update(int operacao, Cliente cliente) {
        switch (operacao) {
            case 0: //Saque
                System.out.println("Saque realizado");
                break;
            case 1: //Deposito
                System.out.println("Deposito realizado");
                break;
            case 2: //Transferencia - Enviar
                System.out.println("Transferência realizada com sucesso");
                break;
            case 3: //Transferencia - Receber
                System.out.println("Você recebeu uma transferência");
                break;
            default:
                break;
        }
                
    }
    
}
