package com.leah.clientfindApi.controller;

import com.leah.clientfindApi.entity.Address;
import com.leah.clientfindApi.entity.Client;
import com.leah.clientfindApi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientFindApiController {
    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public ResponseEntity<Iterable<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.listALLClient());
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @PostMapping("/client")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        clientService.insertClient(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("/client/{id}")
    public ResponseEntity<Client> updateClient(@RequestParam Long id, @RequestBody Address address, String email) {
        clientService.changeClientInfo(id, address, email);
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @DeleteMapping("/client/{id}")
    public ResponseEntity<String> deleteCLient(@RequestParam Long id) {
        clientService.deleteClientById(id);
        return ResponseEntity.ok("Client deleted successfully");
    }
}
