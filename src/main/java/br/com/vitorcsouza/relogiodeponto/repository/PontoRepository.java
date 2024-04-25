package br.com.vitorcsouza.relogiodeponto.repository;

import br.com.vitorcsouza.relogiodeponto.model.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoRepository extends JpaRepository<Ponto, Long> {
}
