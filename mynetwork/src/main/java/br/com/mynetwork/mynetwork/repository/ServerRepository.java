package br.com.mynetwork.mynetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mynetwork.mynetwork.model.Server;

public interface ServerRepository extends JpaRepository<Server, Long>{
    Server findByIpAddress(String ipAddress);
}
