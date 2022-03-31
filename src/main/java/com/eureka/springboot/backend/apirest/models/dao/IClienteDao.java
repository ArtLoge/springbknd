package com.eureka.springboot.backend.apirest.models.dao;

import com.eureka.springboot.backend.apirest.models.entity.Cliente;
import com.eureka.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//import org.springframework.data.repository.CrudRepository;

//could extends CrudRepository witouht pagination
public interface IClienteDao extends JpaRepository<Cliente,Long> {

    @Query("from Region")
    public List<Region> findAllRegiones();
}
