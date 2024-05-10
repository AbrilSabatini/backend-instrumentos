package com.example.demo.Controller;

import com.example.demo.Entity.CategoriaInstrumento;
import com.example.demo.Entity.Instrumento;
import com.example.demo.Service.CategoriaServiceImpl;
import com.example.demo.Service.InstrumentoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "categorias")
public class CategoriaInstrumentoController extends BaseControllerImpl<CategoriaInstrumento, CategoriaServiceImpl> {

    public CategoriaInstrumentoController(CategoriaServiceImpl servicio) {
        super(servicio);
    }

    @Override
    public ResponseEntity<?> findById(Long aLong) {
        return null;
    }
}
