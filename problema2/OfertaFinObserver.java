package problema2;

public class OfertaFinObserver implements Observer {

    @Override
    public void update(int operacao, Cliente cliente) {
        System.out.println("Demonstrando ofertas de financiamentos");
    }
    
}
