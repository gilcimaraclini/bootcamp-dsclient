package com.gilcimara.dsclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilcimara.dsclient.entities.Client;
import com.gilcimara.dsclient.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository repository;

	public List<Client> findAll(){
		return repository.findAll();
	
	}
}
