package br.com.redesprou.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.redesprou.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

}
