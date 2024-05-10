package com.example.demo.Controller;

import com.example.demo.Entity.Base;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface IBaseController<E extends Base, Id extends Serializable> {
    ResponseEntity<?> findAll();
    ResponseEntity<?> findById(@PathVariable Id id);
    ResponseEntity<?> save(@RequestBody E entity);
    ResponseEntity<?> update(@PathVariable Id id, @RequestBody E entity);
    ResponseEntity<?> delete(@PathVariable Id id);

}
