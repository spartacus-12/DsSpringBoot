package org.sesame.dao;

import java.util.Date;
import java.util.List;

import org.sesame.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ClientRepository extends MongoRepository<Client, Long>{
	//@Query(value="{ 'date_naissance': { $regex: ?0, $options: `i` } }")
//public List<Client> rechercherParDateNaissance(Date date_naissance);
}
