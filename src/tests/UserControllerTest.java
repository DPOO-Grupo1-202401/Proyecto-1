package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import data.UserReader;
import model.User;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import controller.UserController;

class UserControllerTest {
	UserReader userReader = new UserReader();
	UserController userController = new UserController();
	Integer loadedUsers;
	HashMap<String, User> users;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		loadedUsers = userReader.loadUsers("db/Tests/");
		users =  UserReader.users.get(email);
	}

	@Test
	void testGetUsers() {
		assertEquals(loadedUsers, userController.getUsers().size());
	}

	@Test
	void testGetUser() {
		assertEquals(users,userController.getUser().get(email));
	}

}
