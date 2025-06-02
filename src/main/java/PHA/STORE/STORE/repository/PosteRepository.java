package PHA.STORE.STORE.repository;


import PHA.STORE.STORE.model.Poste;
import PHA.STORE.STORE.model.TypePoste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

/**
 * JpaRepository<Poste, UUID>
 * Poste = Nom de l'entité, UUID = type de la clé primaire
 */
@Repository
public interface PosteRepository extends JpaRepository<Poste, UUID> {
    // Vérifie si un poste avec le même libellé existe déjà (évite les doublons)
    boolean existsDistinctByLibellePoste(TypePoste libellePoste);
}