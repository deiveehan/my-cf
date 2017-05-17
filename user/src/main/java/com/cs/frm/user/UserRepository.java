package com.cs.frm.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by deiveehannallazhagappan on 3/25/17.
 */
@Transactional
public interface UserRepository extends CrudRepository<User, Long>{
}
