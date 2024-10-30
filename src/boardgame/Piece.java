package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;  // a posicao de uma peça recen criada tem valor nulo
    }

    protected Board getBoard() {   // somente classes dentro do mesmo pacote outre subclassses podem acessar o tabuleiro de uma peça
        return board;
    }


}
