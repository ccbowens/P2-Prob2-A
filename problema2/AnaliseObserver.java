package problema2;

public class AnaliseObserver implements Observer {

    @Override
    public void update(int operacao, Cliente cliente) {
        System.out.println("A analise do fluxo de caixa foi realizado");
    }
    
}
