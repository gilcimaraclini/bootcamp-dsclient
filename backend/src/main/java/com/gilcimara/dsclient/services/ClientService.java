package com.gilcimara.dsclient.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gilcimara.dsclient.dto.ClientDTO;
import com.gilcimara.dsclient.entities.Client;
import com.gilcimara.dsclient.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository repository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());

	}
}
