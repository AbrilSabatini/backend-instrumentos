package com.example.demo.Service;

import com.example.demo.Entity.Base;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<E extends Base, Id extends Serializable> {
    List<E> findAll() throws Exception;
    E findById(Id id) throws Exception;
    E save(E entity) throws Exception;
    E update(Id id, E entity) throws Exception;
    void delete(Id id) throws Exception;
    void delete(Long id) throws Exception;
}
