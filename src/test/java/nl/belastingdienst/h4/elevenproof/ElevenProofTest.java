package nl.belastingdienst.h4.elevenproof;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElevenProofTest {

    private ElevenProof target;
    private Scanner mockScanner;

    @Before
    public void setUp() throws Exception {
        target = new ElevenProof();
        mockScanner = mock(Scanner.class);
        target.setScanner(mockScanner);
    }

    @Test
    public void testFinalClass() {
        FinalClass mockClass = mock(FinalClass.class);
        when(mockClass.isFinal()).thenReturn(true);
        assertTrue(mockClass.isFinal());
    }

    @Test
    public void testRunWithElevenProofNumber() {
        when(mockScanner.nextLine()).thenReturn("123456789");
        assertTrue(target.run());
    }

    @Test
    public void testGetString() {
        when(mockScanner.nextLine()).thenReturn("123456789");
        assertEquals("123456789", target.getString());
    }


    @Test
    public void testIsElevenProofWhenSumIsValid() {
        assertTrue(target.isElevenProof(176));
    }

    @Test
    public void testIsElevenProofWhenSumIsInvalid() {
        assertFalse(target.isElevenProof(175));
    }

    @Test
    public void testGetSum() {
        assertEquals(176, target.getSum("736160221"));
    }


}