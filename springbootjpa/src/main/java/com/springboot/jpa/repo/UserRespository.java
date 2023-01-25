package com.springboot.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.jpa.entities.User;

public interface UserRespository extends CrudRepository<User, Integer> {
	
	
// default query ke leye koi method nhi bnana padta h ---->>
	
	
// derived query methods ke leye methods bnanna padta h --->>
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
// for all native query ke leye bhi method bnanna padta h + "@Query" annotation ka use bhi karna padta h " ---->>
	
	//1.JPQL QUERY--->
	
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u From User u WHERE u.name= :n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query("select u From User u WHERE u.name= :n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name,@Param("c") String city);
	
	//2.SQUL NATIVE QUERY--->>
	
	@Query(value="select*from user", nativeQuery=true)
	public List<User> getUser();
	
}
