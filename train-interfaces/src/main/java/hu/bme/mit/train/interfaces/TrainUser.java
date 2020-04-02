package hu.bme.mit.train.interfaces;

public interface TrainUser {

	int getJoystickPosition();

	boolean getAlarmFlag();

	boolean getAlarmState();

	void overrideJoystickPosition(int joystickPosition);

	void setAlarmState(boolean alarmState);

}
