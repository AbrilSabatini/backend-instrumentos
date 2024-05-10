package com.example.demo.Service;

import com.example.demo.Entity.CategoriaInstrumento;
import com.example.demo.Repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<CategoriaInstrumento, Long> implements ICategoriaInstrumentoService{
    public CategoriaServiceImpl(BaseRepository<CategoriaInstrumento, Long> baseRepository) throws Exception {
        super(baseRepository);
    }
}
