package us.oh.k12.wkw.device.cart.circuitPi;

import java.util.Date;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;

public class WkwCompressor extends Compressor {
	
	public interface CompressorListener {
		
		public void switched(final boolean pOn);
		
	}
	
	private boolean atPressure = false;
	private boolean thisPressure = false;
	private Relay.Value compressorOnLast = Relay.Value.kOff;
	private long onTime = 0;
	private long onStartTime = 0;
	private CompressorListener listener = null;
	
	public WkwCompressor(final int pPressureSwitchChannel, final int pCompressorRelayChannel) {
		super(pPressureSwitchChannel, pCompressorRelayChannel);
	}
	
	public boolean getPressureSwitchValue() {
		
		this.thisPressure = super.getPressureSwitchValue();
		
		if(this.thisPressure != this.atPressure) {
			
			this.atPressure = this.thisPressure;
			
		}
		
		return this.thisPressure;
		
	}
	
	public void setRelayValue(final Relay.Value pRelayValue) {
		
		//super.setRelayValue(pRelayValue);
			
		if (this.compressorOnLast != pRelayValue) {
			
			this.compressorOnLast = pRelayValue;
			
			boolean isOn = (Relay.Value.kOn == this.compressorOnLast);
			
			if(isOn) {
				
				this.onStartTime = System.currentTimeMillis();
				
			} else {
			
				if(this.onStartTime == 0) {
					
				} else {
					
					long aDuration = (System.currentTimeMillis() - this.onStartTime);
					this.onTime += aDuration;
					this.onStartTime = 0;
					
				}
				
			}
			if (null != this.listener) {
				
				this.listener.switched(isOn);
				
			}
			
		}
	}
	
	
	public void setListener(final CompressorListener pListener) {
		this.listener = pListener;
	}
	
	public void resetSecondsOn() {
		this.info("resetSecondsOn()", "Called, onTime=" + this.onTime + ".");
		this.onTime = 0;
	}
	
	public double secondsOn() {
		
		return (double) this.onTime / 1000.0d;
	}
	
	protected void info(final String pMethod, final String pMessage) {
		//Robot.logMsg(Robot.formatMessage(new Date(), this.getClassName(), "I", pMethod, pMessage));
	}
	
	protected String getClassName() {
		String aClassName = this.getClass().getName();
		return aClassName.substring(aClassName.lastIndexOf('.') + 1);
	}

	

}