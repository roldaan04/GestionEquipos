package GestionEquipos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionEquiposPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        CreacionEquiposJugadores creacion = new CreacionEquiposJugadores();
        tx.begin();

        //Crear equipos y jugadores
        //INSERT
        //creacion.crear();

        //DELETE
        Jugador eliminar= em.find(Jugador.class, 17);
        //em.remove(eliminar);

        //UPDATE
        Jugador actualizar= em.find(Jugador.class, 5);
        actualizar.setNombre("Messi");
        em.merge(actualizar);




        tx.commit();
    }
}
