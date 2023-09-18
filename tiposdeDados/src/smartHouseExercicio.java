import java.util.HashMap;
import java.util.Map;

public class smartHouseExercicio {
    private boolean lampadaLigada;
    private House house;
    private Map<String,String> estadosBrasileiros;

    public smartHouseExercicio(){
        this.lampadaLigada = false;
        this.house = null;
        this.estadosBrasileiros = new HashMap<String, String>();
        this.estadosBrasileiros.put("SP", "São Paulo");
        this.estadosBrasileiros.put("RJ", "Rio de Janeiro");
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

    public House getHouse() {
        return house;
    }
    public String mostraEstado(String uf) {
        return this.estadosBrasileiros.get(uf);
    }

    //internet connection
    public boolean conectarNet(){
        for (int i = 0; i < 3; i++) {
            if (Math.random() < 0.5) {
                return true;
            }
        }
        return false;
    }
}
