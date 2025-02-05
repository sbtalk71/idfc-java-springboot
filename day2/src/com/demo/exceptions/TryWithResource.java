package com.demo.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

		/*
		 * try { FileInputStream fis = new FileInputStream("demo.txt"); int b = 0; while
		 * ((b = fis.read()) != -1) { System.out.print((char) b); } } catch
		 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e) {
		 * e.printStackTrace(); } finally { try { fis.close(); } catch (IOException e) {
		 * e.printStackTrace(); } }
		 */

		try (FileInputStream fis = new FileInputStream("demo.txt")) {
			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
