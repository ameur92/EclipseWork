package tn.iit.commande;

import tn.iit.entites.Stereo;

public class StereoOffCommand implements Command {

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
		
	}

	@Override
	public void undo() {
		stereo.on();

		
	}

}
