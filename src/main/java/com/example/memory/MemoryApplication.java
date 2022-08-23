package com.example.memory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemoryApplication {
	private static int dim1 = 0;
	private static int dim2 = 0;
	private static String level = null;
	private static int chance = 0;
	private static int tableSize = 0;
	private static int efforts = 0;
	private static boolean next = true;
	private static boolean x = true;
	private static boolean y = false;

	public static void main(String args[]) throws FileNotFoundException, InterruptedException {
		while (next == true) {
			boolean booLevel = true;
			while (booLevel = true) {
				Scanner myLevel = new Scanner(System.in);
				System.out.println("Choose level: Easy/Hard");
				String scLevel = myLevel.nextLine();
				if (scLevel.contains("Easy")) {
					System.out.println("Warm up.");
					level = "Easy";
					booLevel = false;
					dim1 = 2;
					dim2 = 4;
					tableSize = 4;
					efforts = 11;
					break;
				}
				else {
					if (scLevel.contains("Hard")) {
						System.out.println("Hard try!");
						level = "Hard";
						booLevel = false;
						dim1 = 4;
						dim2 = 4;
						tableSize = 8;
						efforts = 16;
						break;
					}
					else {
						System.out.println("Wrong choose, try again.");
					}
				}
			}
			long start = System.currentTimeMillis();
			Scanner input = new Scanner(new File("./src/Words.txt"));
			List<String> list1 = new ArrayList<>();
			String answer = null;
			boolean answer2 = input.hasNext();
			while (answer2 == true) {
				answer = input.nextLine();
				list1.add(answer);
				answer2 = input.hasNext();
			}
			Collections.shuffle(list1);
			List<String> list2 = list1.stream().limit(tableSize).collect(Collectors.toList());
			List<String> list3 = list1.stream().limit(tableSize).collect(Collectors.toList());
			List<String> newList = Stream.concat(list2.stream(), list3.stream())
					.collect(Collectors.toList());
			Collections.shuffle(newList);
			String[] array = new String[newList.size()];
			for (int i = 0; i < newList.size(); i++) {
				array[i] = newList.get(i);
			}
			String[][] board = new String[dim1][dim2];
			for (int row = 0; row < dim1; row++) {
				for (int column = 0; column < dim2; column++) {
					board[row][column] = "X";
				}
			}
			printBoard(board);

			for (int con = 0; con < efforts; con++) {
				int stat = 0;
				chance++;
				Map<String, String> table = new HashMap<String, String>();
				table.put("A1", array[0]);
				table.put("A2", array[1]);
				table.put("A3", array[2]);
				table.put("A4", array[3]);
				table.put("B1", array[4]);
				table.put("B2", array[5]);
				table.put("B3", array[6]);
				table.put("B4", array[7]);
				if (tableSize == 8) {
					table.put("C1", array[8]);
					table.put("C2", array[9]);
					table.put("C3", array[10]);
					table.put("C4", array[11]);
					table.put("D1", array[12]);
					table.put("D2", array[13]);
					table.put("D3", array[14]);
					table.put("D4", array[15]);
				}
				int dim3 = 0;
				int dim4 = 1;
				int dim5 = 2;
				int dim6 = 3;
				int tempDim1 = 0;
				int tempDim2 = 0;
				Scanner myObj = new Scanner(System.in);
				System.out.println("Choose field");
				String word1 = myObj.nextLine();
				String ar1 = table.get(word1);
				if (table.containsKey(word1)) {
					if (word1.equals("A1")) {
						if (board[dim3][dim3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim3][dim3] = ar1;
							tempDim1 = dim3;
							tempDim2 = dim3;
							printBoard(board);
						}
					}
					if (word1.equals("A2")) {
						if (board[dim3][dim4] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim3][dim4] = ar1;
							tempDim1 = dim3;
							tempDim2 = dim4;
							printBoard(board);
						}
					}
					if (word1.equals("A3")) {
						if (board[dim3][dim5] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim3][dim5] = ar1;
							tempDim1 = dim3;
							tempDim2 = dim5;
							printBoard(board);
						}
					}
					if (word1.equals("A4")) {
						if (board[dim3][dim6] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim3][dim6] = ar1;
							tempDim1 = dim3;
							tempDim2 = dim6;
							printBoard(board);
						}
					}
					if (word1.equals("B1")) {
						if (board[dim4][dim3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim4][dim3] = ar1;
							tempDim1 = dim4;
							tempDim2 = dim3;
							printBoard(board);
						}
					}
					if (word1.equals("B2")) {
						if (board[dim4][dim4] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim4][dim4] = ar1;
							tempDim1 = dim4;
							tempDim2 = dim4;
							printBoard(board);
						}
					}
					if (word1.equals("B3")) {
						if (board[dim4][dim5] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim4][dim5] = ar1;
							tempDim1 = dim4;
							tempDim2 = dim5;
							printBoard(board);
						}
					}
					if (word1.equals("B4")) {
						if (board[dim4][dim6] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim4][dim6] = ar1;
							tempDim1 = dim4;
							tempDim2 = dim6;
							printBoard(board);
						}
					}
					if (word1.equals("C1")) {
						if (board[dim5][dim3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim5][dim3] = ar1;
							tempDim1 = dim5;
							tempDim2 = dim3;
							printBoard(board);
						}
					}
					if (word1.equals("C2")) {
						if (board[dim5][dim4] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim5][dim4] = ar1;
							tempDim1 = dim5;
							tempDim2 = dim4;
							printBoard(board);
						}
					}
					if (word1.equals("C3")) {
						if (board[dim5][dim5] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim5][dim5] = ar1;
							tempDim1 = dim5;
							tempDim2 = dim5;
							printBoard(board);
						}
					}
					if (word1.equals("C4")) {
						if (board[dim5][dim6] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim5][dim6] = ar1;
							tempDim1 = dim5;
							tempDim2 = dim6;
							printBoard(board);
						}
					}
					if (word1.equals("D1")) {
						if (board[dim6][dim3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim6][dim3] = ar1;
							tempDim1 = dim6;
							tempDim2 = dim3;
							printBoard(board);
						}
					}
					if (word1.equals("D2")) {
						if (board[dim6][dim4] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim6][dim4] = ar1;
							tempDim1 = dim6;
							tempDim2 = dim4;
							printBoard(board);
						}
					}
					if (word1.equals("D3")) {
						if (board[dim6][dim5] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim6][dim5] = ar1;
							tempDim1 = dim6;
							tempDim2 = dim5;
							printBoard(board);
						}
					}
					if (word1.equals("D4")) {
						if (board[dim6][dim6] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							printBoard(board);
						} else {
							board[dim6][dim6] = ar1;
							tempDim1 = dim6;
							tempDim2 = dim6;
							printBoard(board);
						}
					}
				} else {
					System.out.println("Wrong input.");
					stat = 2;
					printBoard(board);
				}
				Scanner myObj2 = new Scanner(System.in);
				System.out.println("Choose another field");
				String word2 = myObj2.nextLine();
				String ar2 = table.get(word2);

				if (table.containsKey(word2) && stat == 0) {
					if (word2.equals("A1")) {
						if (board[0][0] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[0][0] == "X") {
							board[0][0] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[0][0] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("A2")) {
						if (board[0][1] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[0][1] == "X") {
							board[0][1] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[0][1] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("A3")) {
						if (board[0][2] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[0][2] == "X") {
							board[0][2] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[0][2] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("A4")) {
						if (board[0][3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[0][3] == "X") {
							board[0][3] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[0][3] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("B1")) {
						if (board[1][0] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[1][0] == "X") {
							board[1][0] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[1][0] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("B2")) {
						if (board[1][1] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[1][1] == "X") {
							board[1][1] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[1][1] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("B3")) {
						if (board[1][2] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[1][2] == "X") {
							board[1][2] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[1][2] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("B4")) {
						if (board[1][3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[1][3] == "X") {
							board[1][3] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[1][3] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("C1")) {
						if (board[2][0] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[2][0] == "X") {
							board[2][0] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[2][0] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("C2")) {
						if (board[2][1] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[2][1] == "X") {
							board[2][1] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[2][1] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("C3")) {
						if (board[2][2] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[2][2] == "X") {
							board[2][2] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[2][2] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("C4")) {
						if (board[2][3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[2][3] == "X") {
							board[2][3] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[2][3] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("D1")) {
						if (board[3][0] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[3][0] == "X") {
							board[3][0] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[3][0] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("D2")) {
						if (board[3][1] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[3][1] == "X") {
							board[3][1] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[3][1] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("D3")) {
						if (board[3][2] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[3][2] == "X") {
							board[3][2] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[3][2] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
					if (word2.equals("D4")) {
						if (board[3][3] != "X") {
							System.out.println("Wrong input.");
							stat = 2;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
						if (board[3][3] == "X") {
							board[3][3] = ar2;
							printBoard(board);
							Thread.sleep(2000);
						}
						if (ar1.equals(ar2)) {
							System.out.println("Great!!!");
						}
						if (!ar1.equals(ar2) && stat != 2) {
							board[3][3] = "X";
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
				} else {
					if (table.containsKey(word2)) {
						if (stat == 2) {
							System.out.println("First choice was wrong, try again.");
							stat = 0;
							printBoard(board);
						} else {
							System.out.println("First choice was wrong, try again.");
							stat = 0;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					} else {
						if (stat == 2) {
							System.out.println("Wrong input.");
							stat = 0;
							printBoard(board);
						} else {
							System.out.println("Wrong input.");
							stat = 0;
							board[tempDim1][tempDim2] = "X";
							printBoard(board);
						}
					}
				}
				for (int row = 0; row < dim1; row++) {
					for (int column = 0; column < dim2; column++) {
						if (board[row][column] == "X") {
							y = true;
							break;
						}
						if (board[row][column] != "X") {
							x = false;
						}
					}
				}
				if (y == false && x == false) {
					System.out.println("You solved the memory game after " + chance + " chances. It took you " + (System.currentTimeMillis()/1000 - start/1000) +
							" seconds.");
					break;
				}
				y = false;
				x = true;
			}
			System.out.println("Game time: " + (System.currentTimeMillis()/1000 - start/1000 + " seconds"));
			Scanner myObj3 = new Scanner(System.in);
			System.out.println("Try again? Yes/No");
			String word3 = myObj3.nextLine();
			if (word3.contains("Yes")) {
				System.out.println("Lets go");
				level = null;
				chance = 0;
			}
			if (!word3.contains("Yes")) {
				System.out.println("Bye!");
				next = false;
			}
		}
	}

	private static void printBoard (String[][]board){
		List<String> listTable = Arrays.asList("A", "B", "C", "D");
		// nagłówki kolumn
		System.out.print("Level: " + level);
		System.out.print("\t" + "\t");
		System.out.println("Guess chance: " + chance);
		System.out.print("\t");
		for (int i = 0; i < dim2; i++) {
			System.out.print(i + 1 + "\t" + "\t" + "\t");
		}
		System.out.println();
		for (int row = 0; row < dim1; row++) {
			System.out.print(listTable.get(row) + ":\t");
			for (int column = 0; column < dim2; column++) {
				if (board[row][column] == "X") {
					System.out.print(board[row][column] + "\t" + "\t" + "\t");
				}
				else {
					System.out.print(board[row][column] + "\t" + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}


