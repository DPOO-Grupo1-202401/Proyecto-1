package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import data.PieceReader;

import model.Piece;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import controller.PieceController;

public class PieceControllerTest {

	PieceReader pieceReader = new PieceReader();
	PieceController pieceController = new PieceController();
	Integer loadedPieces;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		loadedPieces = pieceReader.loadPieces("db/Tests/");
		
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
}

