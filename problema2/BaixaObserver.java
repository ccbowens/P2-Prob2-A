package problema2;

public class BaixaObserver implements Observer{
    
    @Override
    public void update(int operacao, Cliente cliente) {
        System.out.println("A baixa automática dos investimentos foi realizada.");
    }
    
}
