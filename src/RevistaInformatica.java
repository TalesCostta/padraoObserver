import java.util.Observable;

public class RevistaInformatica extends Observable{
    private int edicao;
    
    public void setNovaEdicao(int novaEdicao){
        this.edicao = novaEdicao;

        //Deverá chamar o setChanged antes do notifyObserver ou o estado interno do objeto não será modificado, e se chamar o notifyObserver() nada acontecerá.
        setChanged();
        notifyObservers();
    }

    public int getEdicao() {
        return this.edicao;
    }
}
