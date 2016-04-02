package com.leo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class FileOperation {

	public void createDirectory(String dir) {

		File d = new File(dir);
		d.mkdirs();
		if (d.isDirectory()) {
			System.out.println("createDirectory successfully");
		} else {
			System.out.println("createDirectory Error");
		}
	}

	public File createFile(String dir, String filename) {
		File d = new File(dir);
		if (!d.isDirectory()) {
			d.mkdirs();
		}
		if (!d.isDirectory()) {
			System.out.println("createFile Error");
			return null;
		}

		try {
			File f = new File(d, filename);
			f.createNewFile();
			return f;
		} catch (IOException e) {
			System.out.println("createFile Error");
			e.printStackTrace();
		}

		return null;
	}

	public void writeToFile(File f, String str) {

		if (f == null || !f.isFile())
			return;

		try {

			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(str);
			pw.flush();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readFromFile(File f) {

		if (f == null || !f.isFile())
			return;

		try {

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String currentLine = br.readLine();

			while (currentLine != null) {

				System.out.println(currentLine);
				currentLine = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * merge two files : fn1 and fn2 copy the cotent to create a new file fn3
	 * 
	 * the copy should be line by line
	 */
	public void mergeFilesLineByLine(String fn1, String fn2, String fn3) {
		File f1 = new File(fn1);
		File f2 = new File(fn2);
		if (!f1.isFile() || !f2.isFile()) {
			System.out.println("error");
			return;
		}

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(f1));
			BufferedReader br2 = new BufferedReader(new FileReader(f2));
			PrintWriter pw = new PrintWriter(new FileWriter(fn3, true));

			String currentLine1 = br1.readLine();
			String currentLine2 = br2.readLine();

			while (currentLine1 != null || currentLine2 != null) {
				if (currentLine1 != null) {
					pw.println(currentLine1);
					currentLine1 = br1.readLine();
				}
				if (currentLine2 != null) {
					pw.println(currentLine2);
					currentLine2 = br2.readLine();

				}
			}

			pw.flush();
			pw.close();
			br1.close();
			br2.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * merge two files : fn1 and fn2 copy the cotent to create a new file fn3
	 */
	public void mergeFiles(String fn1, String fn2, String fn3) {

		File f1 = new File(fn1);
		File f2 = new File(fn2);

		if (!f1.isFile() || !f2.isFile()) {
			System.out.println("error");
			return;
		}

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(f1));
			BufferedReader br2 = new BufferedReader(new FileReader(f2));
			PrintWriter pw = new PrintWriter(new FileWriter(fn3, true));

			String currentLine = br1.readLine();
			while (currentLine != null) {
				pw.println(currentLine);
				currentLine = br1.readLine();
			}

			currentLine = br2.readLine();
			while (currentLine != null) {
				pw.println(currentLine);
				currentLine = br2.readLine();
			}

			pw.flush();
			pw.close();
			br1.close();
			br2.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * merge all files in the dir directory and copy the content into a new file
	 */
	public void mergeFilesFromDirectory(String dir, String result) {

		File d = new File(dir);
		if (!d.isDirectory())
			return;
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(result, true));

			String[] list = d.list();
			for (String fname : list) {

				File f = new File(d, fname);
				if (f.isDirectory())
					continue;

				BufferedReader br = new BufferedReader(new FileReader(f));
				String currentLine = br.readLine();
				while (currentLine != null) {
					pw.println(currentLine);
					currentLine = br.readLine();
				}
				// pw.flush();
				br.close();
			}

			pw.flush();
			pw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * 
	 * remove duplicate content from file and generate the new file
	 */

	public void removeDuplicate(String input, String output) {
		File fi = new File(input);
		if (!fi.isFile()) {
			System.out.println("Error");
			return;
		}

		Set<String> contentSet = new HashSet<String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fi));
			PrintWriter pw = new PrintWriter(new FileWriter(output, true));

			String readLine = br.readLine();

			while (readLine != null) {

				if (!contentSet.contains(readLine)) {
					contentSet.add(readLine);
					pw.println(readLine);
				}

				readLine = br.readLine();
			}

			pw.flush();
			pw.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * Perform a file extraction action, output = input -delete
	 */
	public void fileExtraction(String input, String delete, String output) {

		File fi = new File(input);
		File fd = new File(delete);
		if (!fi.isFile() || !fd.isFile()) {
			System.out.println("Error");
			return;
		}

		Set<String> deleteSet = new HashSet<String>();

		try {
			BufferedReader bri = new BufferedReader(new FileReader(fi));
			BufferedReader brd = new BufferedReader(new FileReader(fd));
			PrintWriter pw = new PrintWriter(new FileWriter(output, true));

			String deleteLine = brd.readLine();
			while (deleteLine != null) {
				deleteSet.add(deleteLine);
				deleteLine = brd.readLine();
			}
			brd.close();

			String currentLine = bri.readLine();
			while (currentLine != null) {

				if (!deleteSet.contains(currentLine)) {
					pw.println(currentLine);
				}
				currentLine = bri.readLine();
			}
			bri.close();

			pw.flush();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {

		FileOperation fop = new FileOperation();

		// fop.createDirectory("C:/DS/DS/DS/DS");
		// fop.createFile("C:/DS/DS/DS/DS", "hanxu.txt");

		// File f = new File("han.txt");
		// fop.writeToFile(f, "i am leo han");
		// fop.writeToFile(f, "this place sucks");
		// fop.writeToFile(f, "123 546");
		// fop.writeToFile(f, "dfsd  dsfsdf");
		// fop.writeToFile(f, "ief gs");

		// fop.mergeFiles("f1.txt", "f2.txt", "f3.txt");

		// fop.mergeFilesLineByLine("f1.txt", "f2.txt", "f4.txt");

//		fop.fileExtraction("input.txt", "delete.txt", "result.txt");

		fop.removeDuplicate("input.txt", "output.txt");
		
	}

}
