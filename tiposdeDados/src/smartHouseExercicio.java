public class smartHouseExercicio {
    private boolean lampadaLigada;

    public smartHouseExercicio(){
        this.lampadaLigada = false;
    }

    public boolean isLampadaLigada(){
        return this.lampadaLigada;
    }
    public void ligarLampada(){
        this.lampadaLigada = true;
    }
    public void desligarLampada(){
        this.lampadaLigada = false;
    }
}
