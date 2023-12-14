package bordGame;

public class Board {

    private int rows;
    private  int colunms;
    private Piece[][] pieces;

    public Board(int rows, int colunms) {
        if (rows < 1 || colunms <1){
            throw  new BoardException("erro no tabuleiro linhas a menos");
        }
        this.rows = rows;
        this.colunms = colunms;
        pieces = new Piece[rows][colunms];
    }


 ///////////////////////////////////////////////////////////

    public int getRows() {
        return rows;
    }


    public int getColunms() {
        return colunms;
    }
///////////////////////////////////////////////////////////

    public Piece piece(int row , int colunm){
        if (!positionExistis(row,colunm)){
            throw  new BoardException("nao exist e tabiuleiro");
        }
        return pieces[row][colunm];
    }
    public Piece piece(Position position){
        if (!positionExistis(position)){
            throw  new BoardException("nao exist e tabiuleiro");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thrreIsApiece(position)){
            throw new BoardException("ja existe uma peça aqui "+position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    private boolean positionExistis (int row,int colunm){
       return row >= 0  &&  row <= rows &&  colunm >= 0 && colunm < colunms;
    }
public boolean positionExistis(Position position){
   return positionExistis(position.getRow(),position.getColumn());
}

public boolean thrreIsApiece(Position position){
    if (!positionExistis(position)){
        throw  new BoardException("nao exist e tabiuleiro");
    }
         return  piece (position) != null;

}
}
