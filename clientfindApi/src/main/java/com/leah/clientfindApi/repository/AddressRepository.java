package com.leah.clientfindApi.repository;

import com.leah.clientfindApi.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <Address, Long>  {
}
