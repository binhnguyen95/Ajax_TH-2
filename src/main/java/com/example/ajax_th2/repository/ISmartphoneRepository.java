package com.example.ajax_th2.repository;

import com.example.ajax_th2.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository  extends CrudRepository<Smartphone, Long> {
}
