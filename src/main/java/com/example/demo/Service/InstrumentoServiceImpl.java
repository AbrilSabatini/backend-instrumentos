package com.example.demo.Service;

import com.example.demo.Entity.CategoriaInstrumento;
import com.example.demo.Entity.Instrumento;
import com.example.demo.Repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class InstrumentoServiceImpl extends BaseServiceImpl<Instrumento, Long> implements IInstrumentoService{

    public InstrumentoServiceImpl(BaseRepository<Instrumento, Long> baseRepository) throws Exception {
        super(baseRepository);
    }
}
