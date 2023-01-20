import com.cyberbotics.webots.controller.Motor;
// initialize motors
Motor[4] wheels;
String[] wheelsNames = {"wheel1", "wheel2", "wheel3", "wheel4"};
for (int i = 0; i < wheelsNames.length; i++)
  wheels[i] = robot.getMotor(wheelsNames[i]);
  double speed = -1.5; // [rad/s]
wheels[0].setPosition(Double.POSITIVE_INFINIT);
wheels[0].setVelocity(speed);