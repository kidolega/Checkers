package checkers.logic.player;

import checkers.database.model.MoveEntity;
import checkers.logic.piece.Piece;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Move {
    private int moveNumber;
    private String playerName;
    private String start;
    private String end;
    private Piece pieceMoved;

    public Move(MoveEntity moveEntity) {
        this.moveNumber = moveEntity.getMoveNumber();
        this.playerName = moveEntity.getPlayerName();
        this.start = moveEntity.getStartSpot();
        this.end = moveEntity.getEndSpot();
    }

    @Override
    public String toString() {
        return "\nMove{" +
                "moveNumber=" + moveNumber +
                ", playerName='" + playerName + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", pieceMoved=" + pieceMoved +
                '}';
    }
}