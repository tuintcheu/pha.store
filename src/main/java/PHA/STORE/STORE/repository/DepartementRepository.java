package PHA.STORE.STORE.repository;


import PHA.STORE.STORE.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

/**
 * JpaRepository<Departement, UUID>
 * Departement = Nom de l'entité, UUID = type de la clé primaire
 */
@Repository
public interface DepartementRepository extends JpaRepository<Departement, UUID> {
    // Vérifie si un département avec le même libellé existe déjà (évite les doublons)
    boolean existsDistinctByLibelleDepartement(String libelleDepartement);
}