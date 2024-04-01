package com.api.ec.apirest.service;

import com.api.ec.apirest.model.dao.entity.Cliente;
import com.api.ec.apirest.model.dao.entity.dto.ClienteDto;

public interface ICliente {

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);


    void delete(ClienteDto cliente);
}
