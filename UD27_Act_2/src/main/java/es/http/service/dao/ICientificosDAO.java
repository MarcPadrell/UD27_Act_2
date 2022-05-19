package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, String>{

}
