package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
    TrainController mockTC;
    TrainUser mockTU;
    TrainSensorImpl trainSensor;

    @Before
    public void before() {
        mockTC = mock(TrainController.class);
        mockTrainUser = mock(TrainUser.class);
        trainSensor = new TrainSensorImpl(mockTC, mockTrainUser);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Tachograph table = new Tachograph();
        Assert.assertFalse(table.table.isEmpty());
    }

    @Test
    public void AbsoluteMinMargin() {
        trainSensor.overrideSpeedLimit(-1);
        verify(mockTrainUser, times(1)).setAlarmState(true);
    }
    @Test
    public void AbsoluteMaxMargin() {
        trainSensor.overrideSpeedLimit(501);
        verify(mockTrainUser, times(1)).setAlarmState(true);
    }
    @Test
    public void AbsoluteMaxMargin() {
        trainSensor.overrideSpeedLimit(10);
        rainSensor.overrideSpeedLimit(3);
        verify(mockTrainUser, times(1)).setAlarmState(true);
    }
    @Test
    public void RelativeMaxMargin() {
        trainSensor.overrideSpeedLimit(300);
        verify(mockTrainUser, times(0)).setAlarmState(false);
    }
}
