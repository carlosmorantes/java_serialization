package com.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.car.Car;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car bmw = new Car(4, "black", 120);
		System.out.println(bmw.toString());
		
		
		String file = "C:/Users/carrcarl/Desktop/car.txt";
		FileOutputStream foo = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(bmw);
		oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object l = ois.readObject();
		ois.close();
		
		System.out.println("Recover: " +l);

	}

}
