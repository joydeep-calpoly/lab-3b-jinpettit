package lab_3c;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ServiceTest {

    private Database mockDatabase;
    private Service service;

    @BeforeEach
    public void setUp() {
        mockDatabase = mock(Database.class);

        service = new Service(mockDatabase);
    }

    @Test
    public void testGetDatabaseID() {
        when(mockDatabase.getUniqueId()).thenReturn(12345);

        String result = service.getDatabaseID();

        assertEquals("Using database with id: 12345", result);

        verify(mockDatabase).getUniqueId();
    }
}
