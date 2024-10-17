package cleancode.minesweeper.tobe.minesweeper.board.position;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CellPositionsTest {

    @DisplayName("셀포지션에서 지정된 셀포지션을 뺀 나머지 셀포지션을 리턴한다")
    @Test
    void subtract() {
        // given
        List<CellPosition> positions = List.of(
            CellPosition.of(0, 0),
            CellPosition.of(0, 1),
            CellPosition.of(1, 0),
            CellPosition.of(1, 1)
        );
        CellPositions cellPositions = CellPositions.of(positions);
        List<CellPosition> positionsToSubtract = List.of(
            CellPosition.of(0, 0),
            CellPosition.of(1, 1)
        );

        // when
        List<CellPosition> remainingPositions = cellPositions.subtract(positionsToSubtract);

        // then
        assertThat(remainingPositions).hasSize(2);
        assertThat(remainingPositions).contains(CellPosition.of(0, 1));
        assertThat(remainingPositions).contains(CellPosition.of(1, 0));
    }
}
