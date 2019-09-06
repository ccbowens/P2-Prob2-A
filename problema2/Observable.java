package problema2;

public interface Observable {
    
    void addObserver(Observer a);
    void removeObserver(Observer a);
    void notifyObserver(int operacao);
    
}