package main;

import main.board.Board;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		Test02 t = new Test02();
		while(true) {
			System.out.println("1.로그인 기능");
			System.out.println("2.회원 기능");
			System.out.println("3.게시판 기능");
			num = input.nextInt();
			switch (num) {
			case 1:
				
				break;	
			case 2:
				t.member();
				break;

			case 3:
				System.out.println("1. 게시판 등록");
				System.out.println("2. 게시판 조회");
				int boardAct = input.nextInt();
				switch (boardAct) {
					case 1:
						System.out.println("제목을 입력해 주세요.");
						String title = input.next();
						System.out.println("내용을 입력해 주세요.");
						String content = input.next();
						Board.addBoard(Board.createBoard(title, content));
						break;
					case 2:
						Board.printBoard();
						break;
				}
				break;
				
			}
			
		}
		
		
	}

}
