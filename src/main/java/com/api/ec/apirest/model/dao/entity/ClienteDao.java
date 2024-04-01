package com.api.ec.apirest.model.dao.entity;

import com.api.ec.apirest.model.dao.entity.dto.ClienteDto;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
