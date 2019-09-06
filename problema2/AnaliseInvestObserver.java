package problema2;

public class AnaliseInvestObserver implements Observer{

    @Override
    public void update(int operacao, Cliente cliente) {
        System.out.println("Realizado a análise dos investimentos");
    }
    
}
