package cleancode.minesweeper.tobe.minesweeper.board.position;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RelativePositionTest {

    @DisplayName("deltaRow, deltaCol로 상대죄표를 생성한다")
    @Test
    void of() {
        // given
        int deltaRow = 1;
        int deltaCol = -1;

        // when
        RelativePosition relativePosition = RelativePosition.of(deltaRow, deltaCol);

        // then
        assertThat(relativePosition.getDeltaRow()).isEqualTo(deltaRow);
        assertThat(relativePosition.getDeltaCol()).isEqualTo(deltaCol);
    }
}
