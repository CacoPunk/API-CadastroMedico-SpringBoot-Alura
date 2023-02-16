package med.voll.api.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.medico.Medico;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
