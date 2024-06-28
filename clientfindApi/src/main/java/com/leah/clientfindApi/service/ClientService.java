package com.leah.clientfindApi.service;


import com.leah.clientfindApi.entity.Address;
import com.leah.clientfindApi.entity.Client;
import com.leah.clientfindApi.repository.AddressRepository;
import com.leah.clientfindApi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ClientRepository clientRepository;
    @org.springframework.beans.factory.annotation.Autowired(required = false)
    private ViaCepService viaCepService;

    public Iterable<Client> listALLClient() {
        if (clientRepository.findAll().isEmpty()) {
            throw new RuntimeException("Lista vazia");
        } else {
            return clientRepository.findAll();
        }
    }

    public Client getClientById(Long id) {
        if (clientRepository.findById(id).isPresent()) {
            return clientRepository.findById(id).get();
        } else {
            throw new RuntimeException("Cliente não está adicionado na base de dados");
        }
    }

    public void changeClientInfo(Long id, Address address, String email) {
        Optional<Client> client = clientRepository.findById(id);
        if (client.isPresent()) {
            client.get().setAddress(address);
            client.get().setEmail(email);
        } else {
            throw new RuntimeException("Cliente não está adicionado na base de dados");
        }

    }

    public void insertClient(Client client) {
        String cep = client.getAddress().getCep();
        Address clienteAddress = addressRepository.findById(cep).orElseGet(() -> viaCepService.getAddressByCep(cep));
        addressRepository.save(clienteAddress);
        client.setAddress(clienteAddress);

        if (!clientRepository.existsById(client.getId())) {
            clientRepository.save(client);
        } else {
            throw new RuntimeException("Cliente já está adicionado na base de dados");
        }
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
