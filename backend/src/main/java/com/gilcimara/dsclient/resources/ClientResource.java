package com.gilcimara.dsclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilcimara.dsclient.entities.Client;
import com.gilcimara.dsclient.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = service.findAll();
//		list.add(new Client(1L, "Maria Silva", "1234567890", 0.0, Instant.now(), 2));
//		list.add(new Client(2L, "Joao Pedro", "12312312312", 0.0, Instant.now(), 2));

		return ResponseEntity.ok().body(list);
	}

}
