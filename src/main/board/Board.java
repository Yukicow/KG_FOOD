package main.board;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static List<Board> boardList = new ArrayList();


    private String title;
    private String content;

    public static Board createBoard(String title, String content) {
        Board board = new Board();
        board.setTitle(title);
        board.setContent(content);
        return board;
    }

    public static void addBoard(Board board) {
        boardList.add(board);
    }

    public static void printBoard() {
        boardList.forEach( board -> {
            System.out.println("==========================");
            System.out.println("제목 : " + board.title);
            System.out.println("내용 : " + board.content);
            System.out.println("==========================");
        });
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
