package cleancode.minesweeper.tobe.minesweeper.board.cell;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmptyCellTest {
    
    @DisplayName("EmptyCell은 지뢰가 아니다")
    @Test
    void isLandMine() {
        // given
        EmptyCell emptyCell = new EmptyCell();

        // when
        boolean isLandMine = emptyCell.isLandMine();

        // then
        assertThat(isLandMine).isEqualTo(false);
    }

}
