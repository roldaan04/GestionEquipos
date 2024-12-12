package GestionEquipos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Random;

public class CreacionEquiposJugadores {
    public void crear(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionEquiposPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        for (int i = 1; i < 6; i++) {
            Equipo equipo = new Equipo("Equipo"+i, "Estadio"+i);
            em.persist(equipo);
        }
        for (int i = 1; i < 6; i++) {
            Random rand = new Random();
            float estatura = 1.60f + rand.nextFloat() * (2.00f - 1.60f);
            Equipo equipoId= em.find(Equipo.class, 1);
            float peso = 60 + rand.nextFloat() * (100 - 60);
            Jugador jugador= new Jugador(estatura, equipoId, "Jugador"+i, peso );
            em.persist(jugador);
        }
        for (int i = 1; i < 6; i++) {
            Random rand = new Random();
            float estatura = (float) (Math.round((1.60f + rand.nextFloat() * (2.00f - 1.60f)) * 100.0) / 100.0);
            Equipo equipoId= em.find(Equipo.class, 2);
            float peso = (float) (Math.round((60 + rand.nextFloat() * (100 - 60)) * 100.0) / 100.0);
            Jugador jugador= new Jugador(estatura, equipoId, "Jugador"+i, peso );
            em.persist(jugador);
        }
        for (int i = 1; i < 6; i++) {
            Random rand = new Random();
            float estatura = (float) (Math.round((1.60f + rand.nextFloat() * (2.00f - 1.60f)) * 100.0) / 100.0);
            Equipo equipoId= em.find(Equipo.class, 3);
            float peso = (float) (Math.round((60 + rand.nextFloat() * (100 - 60)) * 100.0) / 100.0);
            Jugador jugador= new Jugador(estatura, equipoId, "Jugador"+i, peso );
            em.persist(jugador);
        }
        for (int i = 1; i < 6; i++) {
            Random rand = new Random();
            float estatura = (float) (Math.round((1.60f + rand.nextFloat() * (2.00f - 1.60f)) * 100.0) / 100.0);
            Equipo equipoId= em.find(Equipo.class, 4);
            float peso = (float) (Math.round((60 + rand.nextFloat() * (100 - 60)) * 100.0) / 100.0);
            Jugador jugador= new Jugador(estatura, equipoId, "Jugador"+i, peso );
            em.persist(jugador);
        }
        for (int i = 1; i < 6; i++) {
            Random rand = new Random();
            float estatura = (float) (Math.round((1.60f + rand.nextFloat() * (2.00f - 1.60f)) * 100.0) / 100.0);
            Equipo equipoId= em.find(Equipo.class, 5);
            float peso = (float) (Math.round((60 + rand.nextFloat() * (100 - 60)) * 100.0) / 100.0);
            Jugador jugador= new Jugador(estatura, equipoId, "Jugador"+i, peso );
            em.persist(jugador);
        }
        tx.commit();
    }
}
