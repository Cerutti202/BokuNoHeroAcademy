package com.barossi.diome.service;

import com.barossi.diome.model.MetaHumano;

import java.util.Set;

public interface MetaHumanoService {

    Iterable<MetaHumano> buscarTodos();

    MetaHumano buscarPorId(Integer id);

    Iterable<MetaHumano> buscarCriminosos();

    Iterable<MetaHumano> buscarIdSecretaDesconhecida();

    void inserir(MetaHumano meta);

    void atualizar(Integer id, MetaHumano meta);

    void deletar(Integer id);
}
