package problema2;

public class Principal {
    
    public static void main(String[] args) {
        Cliente cliente = new ClientePessoaFisica("Teste", "3333-3333", "99999-9999", "111.111.111-11");
        ContaCorrente cc = new ContaCorrente(1234, 4321);
        NotificacaoObserver not = new NotificacaoObserver();
        BaixaObserver baixa = new BaixaObserver();
        AnaliseObserver analise = new AnaliseObserver();
        AnaliseInvestObserver invest = new AnaliseInvestObserver();
        OfertaFinObserver oferta = new OfertaFinObserver();
        
        cc.addObserver(not);
        cc.addObserver(baixa);
        cc.addObserver(analise);
        cc.addObserver(invest);
        cc.addObserver(oferta);

        cc.depositar(100);
        cc.removeObserver(baixa);
        cc.sacar(50);
    }
}
