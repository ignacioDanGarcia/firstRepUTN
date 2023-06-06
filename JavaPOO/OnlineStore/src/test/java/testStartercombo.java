import org.example.Combo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import org.example.factories.Starter;
import org.example.headsets.StarterHeadset;
import org.example.kitKM.StarterKitKboardMouse;
import org.example.webcams.StarterWebcam;


public class testStartercombo {
    @Mock
    private Starter factory;

    @Mock
    private StarterHeadset mockHeadset;

    @Mock
    private StarterKitKboardMouse mockKitKM;

    @Mock
    private StarterWebcam mockWebcam;

    private Combo combo;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(factory.createHeadset()).thenReturn(mockHeadset);
        when(factory.createKitKM()).thenReturn(mockKitKM);
        when(factory.createWebcam()).thenReturn(mockWebcam);

        combo = new Combo(factory);
    }

    @Test
    public void testGoldWrite() {
        doNothing().when(mockHeadset).write();
        doNothing().when(mockWebcam).write();
        doNothing().when(mockKitKM).write();

        combo.write();

        verify(mockHeadset).write();
        verify(mockWebcam).write();
        verify(mockKitKM).write();
    }
}

