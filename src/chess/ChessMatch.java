package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		
		board = new Board(8,8); // chama o construtor da classe Board a qual cria uma matriz 8x8 
		//com elementos do tipo Piece iniciando com null
	}

	public ChessPiece[][] getPiece()
	{
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i =0; i<board.getRows(); i++)
		{
			for(int j=0; j <board.getColumns(); j++)
			{
				mat[i][j] = (ChessPiece) board.piece(i,j);
				
			}
			
		}
		return mat;
	}
	
}
