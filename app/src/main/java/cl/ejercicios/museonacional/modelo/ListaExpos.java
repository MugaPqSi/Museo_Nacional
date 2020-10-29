package cl.ejercicios.museonacional.modelo;

import java.util.ArrayList;

import cl.ejercicios.museonacional.R;

public class ListaExpos {
    private static ListaExpos instancia=new ListaExpos();
    private ArrayList<Exposicion> listaExpos;

    private ListaExpos(){
        listaExpos=new ArrayList<>();
        agregarExpo(new Exposicion("El Origen", "Donde todo comenzó...",R.drawable.fosil,"Historia"));
        agregarExpo(new Exposicion("Zona Desertica","Las zonas desérticas se caracterizan por la escasez de lluvias. Son secas y con amplia variación térmica.", R.drawable.zorro,"Ecosistema"));
    }
    public static ListaExpos getInstancia(){
        return instancia;
    }
    public void agregarExpo(Exposicion exhibicion){
        listaExpos.add(exhibicion);
    }
    public Exposicion getExposicion(int id) {
        return listaExpos.get(id);
    }
    public ArrayList<Exposicion> getListaExpos(){
        return listaExpos;
    }

    public void eliminarExpos(int id){
        listaExpos.remove(id);
    }
}
