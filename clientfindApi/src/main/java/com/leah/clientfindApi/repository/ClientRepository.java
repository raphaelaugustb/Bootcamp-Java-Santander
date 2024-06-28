package com.leah.clientfindApi.repository;

import com.leah.clientfindApi.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
