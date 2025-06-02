package PHA.STORE.STORE.repository;

import PHA.STORE.STORE.model.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

/**
 * JpaRepository<Employe, UUID>
 * Employe = Nom de l'entité, UUID = type de la clé primaire
 */
@Repository
public interface EmployeRepository extends JpaRepository<Employe, UUID> {
    // Trouve tous les employés par ID de poste
    List<Employe> findEmployeByPoste_Id(UUID id);

    // Trouve tous les employés par ID de département
    List<Employe> findEmployeByDepartement_Id(UUID id);
}