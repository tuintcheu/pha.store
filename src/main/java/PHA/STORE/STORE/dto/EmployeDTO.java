package PHA.STORE.STORE.dto;




import PHA.STORE.STORE.model.TypePoste;

import java.util.UUID;

public record EmployeDTO(
        UUID id,
        String nom,
        String email,
        Integer anciennete,
        Integer salaire,
        TypePoste poste,
        String departement
) {}
