package com.example.demo.Controller;

import com.example.demo.Entity.Instrumento;
import com.example.demo.Service.InstrumentoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "instrumentos")
public class InstrumentoController extends BaseControllerImpl<Instrumento, InstrumentoServiceImpl> {
    public InstrumentoController(InstrumentoServiceImpl servicio) {
        super(servicio);
    }

    @Override
    public ResponseEntity<?> findById(Long aLong) {
        return null;
    }
}
