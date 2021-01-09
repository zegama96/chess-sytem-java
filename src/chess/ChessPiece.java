package chess;
import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	private Color color;
	protected int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	public Color getColor() {
		return color;
	}
	public int getMoveCount() {
		return moveCount;
	}
	public void increaseMoveCount() {
		moveCount++;
	}
	public void decreaseMoveCount() {
		moveCount--;
	}
	protected boolean isThereOpponentPiece(Position postion) {
		ChessPiece p = (ChessPiece) getBoard().piece(postion);
		return p!=null && p.getColor()!= color;
	}
	
	
}
