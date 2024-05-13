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
	UserController userController = new UserController();
	Integer loadedUsers;
	User userTest;
	String login = "juan@domain.com";
	String password = "123";
	PieceReader pieceReader = new PieceReader();
	PieceController pieceController = new PieceController();
	Integer loadedPieces;
	ConsultaDePiezas consltaPiezas = new ConsultaDePiezas();
	LoginController loginController = new LoginController();
	InicioDeSesion inicioSesion = new InicioDeSesion();
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		loadedPieces = pieceReader.loadPieces("db/Tests/");
		loadedUsers = userReader.loadUsers("db/Tests/");
		userTest =  UserReader.users.get(login);
		
	}
	
	@Test
	void testUserReader() throws FileNotFoundException, IOException {
		assertFalse(userReader.sync("arcivoTest"));
	}
	@Test
	void testPieceReader() throws FileNotFoundException, IOException {
		assertFalse(pieceReader.sync("arcivoTest"));
		
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
		assertTrue(pieceController.aprobarVenta("Example Title 2"));
		assertFalse(pieceController.aprobarVenta(null));
		assertTrue(pieceController.denegarVenta("Example Title 2"));
		assertFalse(pieceController.denegarVenta(null));
		assertTrue(pieceController.registrarPago("Example Title 2"));
		assertFalse(pieceController.registrarPago(null));
		assertTrue(pieceController.registrarVenta("Example Title 2"));
		assertFalse(pieceController.registrarVenta(null));
	}
	
	@Test 
	void testPieceController1() {
		Exception e = assertThrows(Exception.class, () -> pieceController.comprarPieza(null,login,null));
		assertEquals("No se encontro la pieza", e.getMessage());
	}
	@Test
	void testPieceController2() {
		Exception e = assertThrows(Exception.class, () -> pieceController.comprarPieza("Example Title 2",login,null));
		assertEquals("Error al sincronizar", e.getMessage());	
	}
	@Test
	void testLoginController() {
		assertTrue(loginController.login(login,password,new ArrayList<Role>(Arrays.asList(Role.ADMINISTRADOR))));
		assertFalse(loginController.login(null,password,new ArrayList<Role>(Arrays.asList(Role.ADMINISTRADOR))));
	}
	@Test
	void testInicioSesion() {
		
		
	}
}

