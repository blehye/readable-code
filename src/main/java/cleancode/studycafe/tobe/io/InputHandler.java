package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.model.StudyCafePass;
import cleancode.studycafe.tobe.model.StudyCafePassType;

import java.util.List;

public interface InputHandler {

    public StudyCafePassType getPassTypeSelectingUserAction();

    public StudyCafePass getSelectPass(List<StudyCafePass> passes);

    public boolean getLockerSelection();

}
