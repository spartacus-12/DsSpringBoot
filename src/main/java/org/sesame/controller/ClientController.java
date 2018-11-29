package org.sesame.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.sesame.dao.ClientRepository;
import org.sesame.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
@Autowired
private ClientRepository clientRepository ;
@RequestMapping("/add")
public Client add(Client c) {
	clientRepository.save(c);
	return c;
}
@RequestMapping("/supprimer")
public void supprimer(Long id) {
	clientRepository.deleteById(id);
}
@RequestMapping("/getall")
public List<Client> get(){
	return clientRepository.findAll();
}
@RequestMapping("/getone")
public Client get(Long id){
	return clientRepository.findById(id).get();
}
@RequestMapping("/update")
public Client update(Long id,Client c) {
	clientRepository.findById(id).get();
	clientRepository.save(c);
	return c ;
}
//@RequestMapping("/findBydate")
//public List<Client> rechercherParDateNaissance(Date date_naissance) throws ParseException {

//	return clientRepository.rechercherParDateNaissance(date_naissance);
//}

}
