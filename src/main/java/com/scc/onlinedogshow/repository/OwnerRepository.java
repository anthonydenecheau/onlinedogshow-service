package com.scc.onlinedogshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scc.onlinedogshow.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner,String>  {
	
	public Owner findById(int id);
    public Owner findByIdDog(int idDog);

    @Transactional
    public void deleteByIdDog(int idDog);
}
