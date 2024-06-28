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
        return clientRepository.findAll();
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
            client.get().setAdress(address);
            client.get().setEmail(email);
        } else {
            throw new RuntimeException("Cliente não está adicionado na base de dados");
        }

    }

    public void insertClient(Client client) {
        long idClient = client.getId();
        String cep = client.getAdress().getCep();
        Address clienteAddress = addressRepository.findById(client.getAdress().getCep()).orElseGet(() -> viaCepService.getAddressByCep(cep));
        addressRepository.save(clienteAddress);
        client.setAdress(clienteAddress);

        if (!clientRepository.findById(idClient).isPresent()) {
            clientRepository.save(client);
        } else {
            throw new RuntimeException("Cliente já está adicionado na base de dados");
        }
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
