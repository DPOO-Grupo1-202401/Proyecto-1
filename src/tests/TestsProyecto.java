package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import data.PieceReader;
import data.UserReader;
import model.Piece;
import model.User;
import view.ConsultaDePiezas;
import view.InicioDeSesion;
import model.Role;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.LoginController;
import controller.PieceController;
import controller.UserController;

public class TestsProyecto {

	UserReader userReader = new UserReader();
	PieceReader pieceReader = new PieceReader();
	UserController userController = new UserController();
	PieceController pieceController = new PieceController();
	LoginController loginController = new LoginController();
	ConsultaDePiezas consltaPiezas = new ConsultaDePiezas();
	InicioDeSesion inicioSesion = new InicioDeSesion();
	Integer loadedPieces;
	String login = "juan@domain.com";
	String password = "123";
	String dbTest = "db/Tests/"; 
	Integer loadedUsers;
	User userTest;
	Role role;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		loadedUsers = userReader.loadUsers(dbTest);
		loadedPieces = pieceReader.loadPieces(dbTest);

		userTest =  UserReader.users.get(login);
		
	}
	
	@Test
	void testUserReader() throws FileNotFoundException, IOException {
		assertFalse(userReader.sync(dbTest));
	}
	@Test
	void testPieceReader() throws FileNotFoundException, IOException {
		assertFalse(pieceReader.sync(dbTest));
		
	}
	

	@Test
	void testGetPieces() {
		assertEquals(loadedPieces, pieceController.getPieces().size());
	}

	@Test
	void testComprarPieza() {
		assertEquals(loadedPieces, pieceController.getPieces().size());
	}
	
	@Test
	void testAprobarVenta() {
		assertEquals(loadedPieces, pieceController.getPieces().size());
	}
	
	@Test
	void testDenegarVenta() {
		assertEquals(loadedPieces, pieceController.getPieces().size());
	}
	
	@Test
	void testRegistrarPago() {
		assertEquals(loadedPieces, pieceController.getPieces().size());
	}
	
	@Test
	void testRegistrarVenta() {
		assertEquals(loadedPieces, pieceController.getPieces().size());
	}
	@Test
	void testGetUsers() {
		assertEquals(loadedUsers, userController.getUsers().size());
		assertEquals(userTest,userController.getUser(login));	
	}
	
	@Test 
	void testPieceController() {
		assertTrue(pieceController.aprobarVenta("ExampleTitle9"));
		assertFalse(pieceController.aprobarVenta(null));
		assertTrue(pieceController.denegarVenta("ExampleTitle9"));
		assertFalse(pieceController.denegarVenta(null));
		assertTrue(pieceController.registrarPago("ExampleTitle8"));
		assertFalse(pieceController.registrarPago(null));
		assertTrue(pieceController.registrarVenta("ExampleTitle8"));
		assertFalse(pieceController.registrarVenta(null));
		assertTrue(pieceController.registrarVenta("ExampleTitle8"));

	}
	
	@Test
	void testDenegarVenta1() {
		Exception e = assertThrows(Exception.class, () -> pieceController.denegarVenta("ExampleTitle2"));
		assertEquals("Error al sincronizar", e.getMessage());
	}
	@Test 
	void testPieceController1() {
		Exception e = assertThrows(Exception.class, () -> pieceController.comprarPieza(null,login,null));
		assertEquals("Error al sincronizar", e.getMessage());
	}
	@Test
	void testPieceController2() {
		Exception e = assertThrows(Exception.class, () -> pieceController.comprarPieza("ExampleTitle2",login,null));
		assertEquals("Error al sincronizar", e.getMessage());	
	}
	@Test
	void testLoginController() {
		assertTrue(loginController.login(login,password,new ArrayList<Role>(Arrays.asList(Role.ADMINISTRADOR))));
		assertFalse(loginController.login(null,password,null));
	}

}


