package cleancode.minesweeper.tobe.minesweeper.board.position;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CellPositionTest {

    @DisplayName("행 index, 열 index CellPosition을 생성한다")
    @Test
    void of() {
        // given
        int rowIndex = 0;
        int colIndex = 0;

        // when
        CellPosition cellPosition = CellPosition.of(rowIndex, colIndex);

        // then
        assertThat(cellPosition.getRowIndex()).isEqualTo(rowIndex);
        assertThat(cellPosition.getColIndex()).isEqualTo(colIndex);
    }

    @DisplayName("음수 행 index 또는 음수 열 index로 CellPosition을 생성할 수 없다")
    @Test
    void ofByNegativeIndex() {
        // given
        int rowIndex = -1;
        int colIndex = 0;

        // when, then
        assertThatThrownBy(() -> CellPosition.of(rowIndex, colIndex))
            .isInstanceOf(IllegalArgumentException.class)   
            .hasMessage("올바르지 않은 좌표입니다.");
    }

    @DisplayName("기존 좌표에 상대 좌표를 더하여 새로운 좌표를 생성한다.")
    @Test
    void calculatePositionBy() {
        // given
        int rowIndex = 3;
        int colIndex = 5;
        int deltaRow = 1;
        int deltaCol = 1;

        CellPosition cellPosition = CellPosition.of(rowIndex, colIndex);
        RelativePosition relativePosition = RelativePosition.of(deltaRow, deltaCol);

        // when
        CellPosition newCellPosition = cellPosition.calculatePositionBy(relativePosition);

        // then
        assertThat(newCellPosition.getRowIndex()).isEqualTo(rowIndex + deltaRow);
        assertThat(newCellPosition.getColIndex()).isEqualTo(colIndex + deltaCol);
    }

    @DisplayName("기존 좌표에 상대 좌표를 더하여 새로운 좌표를 생성할 때 새로운 좌표의 행과 열 index가 하나라도 음수가 된다면 새로운 좌표를 생성할 수 없다.")
    @Test
    void calculatePositionCreateInvalidPosition() {
        // given
        int rowIndex = 0;
        int colIndex = 0;
        int deltaRow = -1;
        int deltaCol = -1;

        CellPosition cellPosition = CellPosition.of(rowIndex, colIndex);
        RelativePosition relativePosition = RelativePosition.of(deltaRow, deltaCol);

        // when, then
        assertThatThrownBy(() -> cellPosition.calculatePositionBy(relativePosition))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("움직일 수 있는 좌표가 아닙니다.");
    }


}
