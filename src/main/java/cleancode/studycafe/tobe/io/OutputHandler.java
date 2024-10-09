package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.model.StudyCafeLockerPass;
import cleancode.studycafe.tobe.model.StudyCafePass;

import java.util.List;

public interface OutputHandler {

    public void showWelcomeMessage();

    public void showAnnouncement();

    public void askPassTypeSelection();

    public void showPassListForSelection(List<StudyCafePass> passes);

    public void askLockerPass(StudyCafeLockerPass lockerPass);

    public void showPassOrderSummary(StudyCafePass selectedPass, StudyCafeLockerPass lockerPass);

    public void showSimpleMessage(String message);

}
