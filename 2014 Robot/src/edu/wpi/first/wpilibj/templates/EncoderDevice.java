/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Chance
 */
public class EncoderDevice implements IStep {
    //TODO rename class

    EncoderDevice() {
    }
    Encoder encoder;
    DigitalInput di1;
    DigitalInput di2;

    int encoderAChannelPort = 0;
    int encoderAChannelSlot = 1;
    int encoderBChannelPort = 0;
    int encoderBChannelSlot = 1;
    int samplesToAverage = 50;

    public void step() {
    }

    public EncoderDevice init() {

        di1 = new DigitalInput(encoderAChannelSlot, encoderAChannelPort);
        di2 = new DigitalInput(encoderBChannelSlot, encoderBChannelPort);
        

        encoder = new Encoder(di2, di1);

        encoder.setSamplesToAverage(samplesToAverage);
        encoder.start();
        encoder.setPIDSourceParameter(Encoder.PIDSourceParameter.kDistance);
        

        /*Devices.logChecker.sendLog(
                "Encoder started: AChannel: (" + 
                        encoderAChannelSlot +
                        "," +
                        encoderAChannelPort +
                        "), BChannel: (" +
                        encoderBChannelSlot +
                        "," +
                        encoderBChannelPort, 
                LogLevelCheck.physical); */
        return this;

    }

    public double get() {

        return Math.abs(encoder.getRate());
    }
    //sets the port for the first encoder

    public EncoderDevice setEncoderAChannelPort(int portNumber) {
        encoderAChannelPort = portNumber;
        return this;
    }
    //sets the port for the second encoder

    public EncoderDevice setEncoderBChannelPort(int portNumber) {
        encoderBChannelPort = portNumber;
        return this;
    }

    public void setAveragesToSample(int samplesToAverage) {
        this.samplesToAverage = samplesToAverage;
    }

    public void test() {
        System.out.println("No test for this device");
    }
}
