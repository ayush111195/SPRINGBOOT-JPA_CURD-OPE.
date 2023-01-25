package com.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.entities.User;
import com.springboot.jpa.repo.UserRespository;

@SpringBootApplication
public class Springbootjpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springbootjpa1Application.class, args);
		UserRespository userrepo = context.getBean(UserRespository.class);

//		User user=new User();
//		user.setName("Ayush");
//		user.setCity("orai");
//		user.setStatus("java programmer");
//		
//	User save = userrepo.save(user);
//	System.out.println(save);

//create object of user--->>>

//		User user2=new User();
//		user2.setName("shivam");
//		user2.setCity("kanpur");
//		user2.setStatus("topa admi");
//		
//
//		User user1=new User();
//		user1.setName("shivam");
//		user1.setCity("kanpur");
//		user1.setStatus("topa admi");

// for save single user--->>

//		User save = userrepo.save(user2);
//		System.out.println(save);

// for save all user-->>

//to pass list we can create a list---->>
		//List<User> users = List.of(user2,user1);  // list bnane ka ye method java 8 main nhi milta java 9 se milta h 
		
		//Iterable<User> saveAll = userrepo.saveAll(users);
		//saveAll.forEach(user->{
			//System.out.println(user);});
		
		
//update the user id -102--->>
		
//		Optional<User> byId = userrepo.findById(102);
//		User user3 = byId.get();
//		System.out.println(user3); // ye dekhne ke leye ki kaunsa user mila 
//		user3.setName("Arpit");
//		User save = userrepo.save(user3);
//		System.out.println(save);  // update hone ke badd user ko dekhne ke leye 

		
//how to get the data---->>
		
		//1.find by id---->>>

//		Optional<User> byId = userrepo.findById(102);
//		User user3 = byId.get();
//		System.out.println(user3); // ye dekhne ke leye ki kaunsa user mila 

		
        //2.how to get all data---->>		
		
		//Iterable<User> findAll = userrepo.findAll();
		//findAll.forEach(user->{System.out.println(user);});
		
//how to dlt data--->>>		
		
		// by id----->>>
		//userrepo.deleteById(102);
		//System.out.println("deleted");
		
        // dlt multipal user--->>>
		
		//Iterable<User> findAll = userrepo.findAll();
		//findAll.forEach(user->System.out.println(user));
		
// drived query methods/ custom finder methods--->>>>	
		
		//List<User> users = userrepo.findByName("Ayush");
		//users.forEach(user->System.out.println(user));
		
		//List<User> users = userrepo.findByNameAndCity("Ayush","orai");
		//users.forEach(user->System.out.println(user));
		
//Native query methods--->>>
		
		List<User> allUser = userrepo.getAllUser();
		allUser.forEach(e-> System.out.println(e));
		
		System.out.println("------------------------------------------------");
		
	    List<User> userByName = userrepo.getUserByName("shivam");
	    userByName.forEach(p-> System.out.println(p));
	    
	    System.out.println("--------------------------------------------------");
	    
	    List<User> userByNameAndCity = userrepo.getUserByNameAndCity("Ayush","orai" );
	    userByNameAndCity.forEach(b->System.out.println(b));
	    
	    System.out.println("------------------Native query---------------------");
	    
	    List<User> user = userrepo.getUser();
	    user.forEach(r->System.out.println(r));
	    
	}

}
