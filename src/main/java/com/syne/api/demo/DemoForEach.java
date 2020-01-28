package com.syne.api.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.syne.api.model.User;


public class DemoForEach {
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setUserName("User1");
		User user2 = new User();
		user2.setUserName("User2");
		User user3 = new User();
		user3.setUserName("User3");
		User user4 = new User();
		user4.setUserName("User4");
		User user5 = new User();
		user5.setUserName("User5");
		users.add(user1);users.add(user2);users.add(user3);users.add(user4);users.add(user5);
		
		//Option 1 to fetch list
		//traversing through forEach method of Iterable with anonymous class
		users.forEach(new Consumer<User>(){
			public void accept(User user) {
				System.out.println("forEach anonymous class Value::"+user.getUserName());
			}
		});
		
		Runnable r1 = () -> {
			System.out.println("SSS..My Runnable");
		};
		r1.run();
		
		
		//Option 2 to fetch list
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		users.forEach(action);
	}
}

class MyConsumer implements Consumer<User> {
	
	public void accept(User user) {
		System.out.println("Consumer impl Value::"+ user.getUserName());		
	}
}
